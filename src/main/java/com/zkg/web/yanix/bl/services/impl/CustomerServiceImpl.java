package com.zkg.web.yanix.bl.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zkg.web.yanix.bl.daos.CustomerDao;
import com.zkg.web.yanix.bl.models.Customer;
import com.zkg.web.yanix.bl.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	
	private final ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public String getCustomers() throws Exception {
		// TODO Auto-generated method stub
		List<Customer> customerList = dao.getCustomers();
		String jsonString = mapper.writeValueAsString(customerList);
		return jsonString;
	}

	@Override
	public Integer insertCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return dao.insertCustomer(customer);
	}

	@Override
	public Integer updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public Integer deleteCustomer(Integer customerId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customerId);
	}

}
