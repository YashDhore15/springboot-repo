package com.yash.one_to_many.service;

import com.yash.one_to_many.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public Customer fetchCustomerById(Long id);
}
