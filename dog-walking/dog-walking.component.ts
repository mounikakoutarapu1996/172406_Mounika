import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-dog-walking',
  templateUrl: './dog-walking.component.html',
  styleUrls: ['./dog-walking.component.css']
})
export class DogWalkingComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }
onsubmit(){
  this.router.navigateByUrl("dogwalking");
}
}
