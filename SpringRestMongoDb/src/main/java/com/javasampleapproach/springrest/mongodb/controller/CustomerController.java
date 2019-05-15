package com.javasampleapproach.springrest.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mongodb.model.LoginPojo;

import com.javasampleapproach.springrest.mongodb.loginrepo.LoginRepository;
import com.javasampleapproach.springrest.mongodb.model.Customer;
import com.javasampleapproach.springrest.mongodb.repo.CustomerRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomerRepository repository;
	
	@Autowired
	LoginRepository repo;

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Customer> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);

		return customers;
	}

	@PostMapping("/customers/validate")
	boolean validateUser(@RequestBody LoginPojo userlog) {

	//System.out.println(userlog);
		List<LoginPojo> login=repo.findAll();
		//System.out.println(login);
	//	System.out.println(login);
		for(LoginPojo log:login) {
			//System.out.println(dblog.getEmail()+" "+userlog.getEmail());
			if(log.getEmail().equals(userlog.getEmail()) && log.getPassword().equals(userlog.getPassword()))
				return true;
		    }
		
		return false;
	}
	
	 @PostMapping("/customers/register")
		public LoginPojo postCustomer(@RequestBody LoginPojo customer) {

		  LoginPojo _customer = repo.save(new LoginPojo(customer.getFullname(),customer.getEmail(),customer.getPassword(),customer.getRepeatpassword()));
			return _customer;
		}
	
	@PostMapping("/customers/create")
	public Customer postCustomer(@RequestBody Customer customer) {

		Customer _customer = repository.save(new Customer(customer.getId(),customer.getBreed(),customer.getColour(),customer.getAge(),customer.getImageUrl()));
		return _customer;
	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		repository.deleteById(id);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/customers/delete")
	public ResponseEntity<String> deleteAllCustomers() {
		System.out.println("Delete All Customers...");

		repository.deleteAll();

		return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
	}

//	@GetMapping("customers/age/{uname}")
//	public String findByName(@PathVariable String Breed) {
//
//		List<Customer> customers = repository.findByName(Breed);
//		return "Hi customer"+Breed;
//	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") String id, @RequestBody Customer customer) {
		System.out.println("Update Customer with ID = " + id + "...");

		Optional<Customer> customerData = repository.findById(id);

		if (customerData.isPresent()) {
			Customer _customer = customerData.get();
			_customer.setBreed(customer.getBreed());
			_customer.setColour(customer.getColour());
		
			return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
