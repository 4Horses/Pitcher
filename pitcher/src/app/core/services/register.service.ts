import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user.model';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json; charset=utf-8;',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http: HttpClient) { }
  
  createUser(user: User) {
    console.log("In create user service");
    console.log(user)
    return this.http.post<any>(`http://localhost:8081/user`, user, httpOptions);
  }
}
