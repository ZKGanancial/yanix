package com.zkg.web.yanix.bl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkg.web.yanix.bl.models.Customer;

public interface CustomerMapper {

	public List<Customer> getCustomers() throws Exception;
	public Integer insertCustomer(@Param("customer") Customer customer) throws Exception;
	public Integer updateCustomer(@Param("customer") Customer customer) throws Exception;
	public Integer deleteCustomer(@Param("customerId") Integer customerId) throws Exception;
}
