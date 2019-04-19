import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/login';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login:Login=new Login()
  constructor(private formBuilder:FormBuilder,private router : Router) { }
  f:FormGroup;
  ngOnInit() {
    this.f = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
  });
  }
  onLogin(){
     this.router.navigateByUrl("Home");
   
  }
}
