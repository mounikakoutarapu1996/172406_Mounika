import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class LoginService {
 
  private baseUrl = 'http://localhost:8080/api/login';
 
  constructor(private http: HttpClient) { }
 
  
 
  loginCustomer(login: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/login`, login);
  }
}