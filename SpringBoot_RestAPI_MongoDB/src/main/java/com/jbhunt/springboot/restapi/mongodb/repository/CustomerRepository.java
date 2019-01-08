package com.jbhunt.springboot.restapi.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jbhunt.springboot.restapi.mongodb.beans.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
	Customer getCustomerById(String CustomerId);

	Customer addNewCustomer(Customer Customer);
	List<Customer> getAllCustomers();
}
