package com.sjsu.ad.service;

import com.sjsu.ad.BO.CustomerInfoBO;

public interface ICustomerService {
	
	CustomerInfoBO doLoginCustomer(CustomerInfoBO customerInfo);

	String registerCustomer(CustomerInfoBO customerDetails);
	

}
