package com.javasampleapproach.springrest.mongodb.loginrepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.Customer;


public interface CustomerRepository extends MongoRepository<Customer, String>{

}
