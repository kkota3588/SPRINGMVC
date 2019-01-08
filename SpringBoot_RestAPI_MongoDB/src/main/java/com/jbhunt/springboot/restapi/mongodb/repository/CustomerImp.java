package com.jbhunt.springboot.restapi.mongodb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.jbhunt.springboot.restapi.mongodb.beans.Customer;

@Repository
public class CustomerImp implements CustomerRepository {
	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Customer> getAllCustomers() {
		return mongoTemplate.findAll(Customer.class);
	}

	public Customer getCustomerById(String customerId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(customerId));
		return mongoTemplate.findOne(query, Customer.class);
	}

	public Customer addNewCustomer(Customer customer) {
		mongoTemplate.save(customer);
		return customer;
	}

	@Override
	public <S extends Customer> List<S> save(Iterable<S> entites) {
		return null;
	}

	@Override
	public List<Customer> findAll() {
		return null;
	}

	@Override
	public List<Customer> findAll(Sort sort) {
		return null;
	}

	@Override
	public <S extends Customer> S insert(S entity) {
		return null;
	}

	@Override
	public <S extends Customer> List<S> insert(Iterable<S> entities) {
		return null;
	}

	@Override
	public <S extends Customer> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<Customer> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Customer> S save(S entity) {
		return null;
	}

	@Override
	public Customer findOne(String id) {
		return null;
	}

	@Override
	public boolean exists(String id) {
		return false;
	}

	@Override
	public Iterable<Customer> findAll(Iterable<String> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(String id) {

	}

	@Override
	public void delete(Customer entity) {

	}

	@Override
	public void delete(Iterable<? extends Customer> entities) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public <S extends Customer> S findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {

		return null;
	}

	@Override
	public <S extends Customer> long count(Example<S> example) {

		return 0;
	}

	@Override
	public <S extends Customer> boolean exists(Example<S> example) {

		return false;
	}

}
