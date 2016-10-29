package com.zkg.web.yanix.bl.daos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zkg.web.yanix.bl.daos.CustomerDao;
import com.zkg.web.yanix.bl.mappers.CustomerMapper;
import com.zkg.web.yanix.bl.models.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	CustomerMapper mapper;
	
	@Override
	public List<Customer> getCustomers() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getCustomers();
	}

	@Override
	public Integer insertCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.insertCustomer(customer);
	}

	@Override
	public Integer updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateCustomer(customer);
	}

	@Override
	public Integer deleteCustomer(Integer customerId) throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteCustomer(customerId);
	}

}
