import { Routes } from '@angular/router';
import { LoginComponent } from './app/login/login.component';
import { RegisterComponent } from './app/register/register.component';
import { AboutComponent } from './app/about/about.component';
import { AddPuppyComponent } from './app/add-puppy/add-puppy.component';
import { PuppydetailsComponent } from './app/puppydetails/puppydetails.component';
import { HomeComponent } from './app/home/home.component';


export const appRoutes: Routes = [
  {
    path:'Home',
    component:HomeComponent
  },
  {
    path:'AddPuppy',
    component:AddPuppyComponent
  },
  { 
    path: 'login', 
    component: LoginComponent 
  },
  {
    path:'register',
    component:RegisterComponent
  },
  {
    path:'About',
    component:AboutComponent
  },
  {
  path:'Addpuppy',
  component:AddPuppyComponent
  },
  {
    path:'puppydetails',
    component:PuppydetailsComponent
  },
 
];