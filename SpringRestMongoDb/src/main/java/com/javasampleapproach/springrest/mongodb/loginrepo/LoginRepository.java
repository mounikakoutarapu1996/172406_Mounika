package com.javasampleapproach.springrest.mongodb.loginrepo;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.LoginPojo;

public interface LoginRepository extends MongoRepository<LoginPojo, String>{

}

