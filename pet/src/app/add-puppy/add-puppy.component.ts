import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-puppy',
  templateUrl: './add-puppy.component.html',
  styleUrls: ['./add-puppy.component.css']
})
export class AddPuppyComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private router : Router) { }

  ngOnInit() {
  
}
Onsubmit(){
  this.router.navigateByUrl("AddPuppy");
}
}
