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
    return this.http.post<any>(`http://localhost:8081/user`, user, httpOptions);
  }

  getAllUsers() {
    return this.http.get<any>(`http://localhost:8081/user`, httpOptions);
  }

  updateUser(user: User) {
    return this.http.patch<any>(`http://localhost:8081/user`, user, httpOptions);
  }
}
