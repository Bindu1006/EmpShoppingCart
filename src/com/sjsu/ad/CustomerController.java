package com.sjsu.ad;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjsu.ad.BO.CustomerInfoBO;
import com.sjsu.ad.service.ICustomerService;



@Controller
public class CustomerController {
	
	private ICustomerService customerService;
	
	public ICustomerService getCustomerService() {
		return customerService;
	}

	@Autowired
	public void setAppVendorService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping("/index")
	public String showIndexPage(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("customerDetails") CustomerInfoBO customerDetails, Model model){
		System.out.println("show Index page");
		model.addAttribute("customerDetails", customerDetails);
		return "index";
	}

	
	@RequestMapping("/authenticateCustomers")
	public String authenticateCustomers(HttpServletRequest request, @ModelAttribute("customerDetails") CustomerInfoBO customerDetails, Model model){
		System.out.println("Customer Login ::: Username ::: " +customerDetails.getCustomerFirstName() );
		
		CustomerInfoBO custInfo = new CustomerInfoBO();
		custInfo = customerService.doLoginCustomer(customerDetails);

		System.out.println("Customer Details: " +custInfo);
		model.addAttribute("customerDetails", custInfo);
		
//		return model;
		return "/jsp/CustomerHomePage";
	}
	
	@RequestMapping("/registerCustomers")
	public String registerCustomers(HttpServletRequest request, @ModelAttribute("customerDetails") CustomerInfoBO customerDetails, Model model){
		System.out.println("Customer Register ::: UserDetails ::: " +customerDetails );
		String result = customerService.registerCustomer(customerDetails);
		if (result.equalsIgnoreCase("SUCCESS")) {
			model.addAttribute("customerDetails", customerDetails);
			return "/jsp/CustomerHomePage";
		}
				
//		return model;
		return "/jsp/error";
	}
	
	public String HomePage(){
		System.out.println("show home page");
		return "/jsp/HomePage";
	}

}
