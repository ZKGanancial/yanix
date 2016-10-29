package com.zkg.web.yanix.bl.daos;

import java.util.List;

import com.zkg.web.yanix.bl.models.Customer;

public interface CustomerDao {

	public List<Customer> getCustomers() throws Exception;
	public Integer insertCustomer(Customer customer) throws Exception;
	public Integer updateCustomer(Customer customer) throws Exception;
	public Integer deleteCustomer(Integer customerId) throws Exception;
}
