import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  //register:Register=new Register()
  f:FormGroup;
  ngOnInit(){
  this.f = this.formBuilder.group({
    username: ['', Validators.required],
    password: ['', Validators.required]
});
}
  constructor(private formBuilder:FormBuilder,private router : Router) { }

  OnRegister() {
    this.router.navigateByUrl("Login");
  }

}
