package com.zkg.web.yanix.bl.services;

import com.zkg.web.yanix.bl.models.Customer;

public interface CustomerService {
	
	public String getCustomers() throws Exception;
	public Integer insertCustomer(Customer customer) throws Exception;
	public Integer updateCustomer(Customer customer) throws Exception;
	public Integer deleteCustomer(Integer customerId) throws Exception;

}
