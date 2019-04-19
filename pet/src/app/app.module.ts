import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule } from '@angular/router';
import { appRoutes } from 'src/routerConfig';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { AddPuppyComponent } from './add-puppy/add-puppy.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { PuppydetailsComponent } from './puppydetails/puppydetails.component';
import { HomeComponent } from './home/home.component'
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    AboutComponent,
    AddPuppyComponent,
    PuppydetailsComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
