package com.yash.one_to_many.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yash.one_to_many.entity.Customer;
import com.yash.one_to_many.entity.Order;
import com.yash.one_to_many.entity.OrderStatus;
import com.yash.one_to_many.service.CustomerService;

@Component
public class MyAppRunner implements ApplicationRunner{
	
	@Autowired
	private CustomerService customerService;
	
	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//Save
//		Customer customer = new Customer();
//		customer.setName("AAA");
//		customer.setPhone(999L);
//		
//		customer.setOrders(
//					Arrays.asList(
//								new Order(101L, LocalDate.now(), OrderStatus.DELIVERED),
//								new Order(102L, LocalDate.now(), OrderStatus.ORDERED)
//							));
		
//		----------------------------------------------------------------------
      
//       fetch by id		
//		customer = customerService.saveCustomer(customer);
//		
//		System.out.println("Customer ID : " + customer.getCid());
		
//		Customer customer = customerService.fetchCustomerById(1L);
//		
//		if(customer == null) {
//			System.out.println("Customer not found!");
//		}
//		else
//			System.out.println("Customer : " + customer.getOrders());
		
// ----------------------------------------------------------------------------

/*
		Customer customer = Customer.builder()
							.name("BBB")
							.phone(888L)
							.build();
		
		System.out.println("Customer : " + (customer=customerService.saveCustomer(customer)));
*/
		
		Customer customer = customerService.fetchCustomerById(2L);
	
		
		//Updates the order of 2L with just 103L order and others cust_id is made null!
/*     
		customer.setOrders(
					List.of(
							new Order(106L, LocalDate.now(), OrderStatus.DELIVERED)
					));
*/
		
		
		//keeps existing orders and adds other order
/*		
		customer.getOrders()
				.add(new Order(105L, LocalDate.now(), OrderStatus.DELIVERED));
*/		
		customer.setOrders(
				List.of(
						new Order(103L, LocalDate.now(), OrderStatus.DELIVERED)
				));
		
		customer = customerService.saveCustomer(customer);
		
		System.out.println("Customer saved with ID : " + customer.getCid());
	}

}
