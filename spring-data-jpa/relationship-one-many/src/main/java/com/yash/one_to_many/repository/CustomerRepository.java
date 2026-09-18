package com.yash.one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.one_to_many.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
