package com.sjsu.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjsu.ad.BO.CustomerInfoBO;
import com.sjsu.ad.DAO.ICustomerDao;

@Component
public class CustomerServiceImpl implements ICustomerService{

private ICustomerDao customerDao;
	
	public ICustomerDao getCustomerDao() {
		return customerDao;
	}

	@Autowired
	public void setAppVendorDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public CustomerInfoBO doLoginCustomer(CustomerInfoBO customerInfo) {
		System.out.println("CLASSNAME :: CustomerServiceImpl ");
		CustomerInfoBO loggedCustDetails = customerDao.doLoginCustomer(customerInfo);
		System.out.println("Logged Customer Details :: "+ loggedCustDetails);
		return loggedCustDetails;
	}

	@Override
	public String registerCustomer(CustomerInfoBO customerDetails) {
		String result = customerDao.registerCustomer(customerDetails);
		return result;
	}
	
	

}
