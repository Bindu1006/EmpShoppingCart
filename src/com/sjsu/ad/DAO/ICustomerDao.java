package com.sjsu.ad.DAO;

import com.sjsu.ad.BO.CustomerInfoBO;

public interface ICustomerDao {
	
	CustomerInfoBO doLoginCustomer(CustomerInfoBO customerInfo);

	String registerCustomer(CustomerInfoBO customerDetails);

}
