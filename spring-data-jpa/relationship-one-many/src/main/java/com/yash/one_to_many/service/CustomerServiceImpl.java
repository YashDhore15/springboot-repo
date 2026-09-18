package com.yash.one_to_many.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.one_to_many.entity.Customer;
import com.yash.one_to_many.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer fetchCustomerById(Long id) {
		
		Optional<Customer> customer = customerRepository.findById(id);
		
		if(customer.isPresent()) {
			return customer.get();
		}
		else
			return null;
	}
	
}
