package com.sts.Register.RegisterDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sts.Register.RegisterDemo.model.Register;

public interface RegRepo extends MongoRepository<Register,String> {

}
