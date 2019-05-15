package com.sts.Register.RegisterDemo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.Register.RegisterDemo.model.Register;
import com.sts.Register.RegisterDemo.repository.RegRepo;

@RestController
@RequestMapping("/api")
public class RegController {
	
  @Autowired
   RegRepo regrepo;
  
  @GetMapping("/add")
  public List<Register> getAllRegisters(){
	  List<Register> reg=new ArrayList<>();
	  regrepo.findAll().forEach(reg::add);
	  return reg;
  }
  @PostMapping("/register/create")
  public Register postcustomer(@RequestBody Register register){
	  Register _regi=regrepo.save(register);
	return _regi;
	  
  }
 

}
