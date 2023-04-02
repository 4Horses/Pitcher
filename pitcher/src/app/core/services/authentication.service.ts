import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json; charset=utf-8;',
  }),
};

@Injectable({
  providedIn: 'root',
})
export class AuthenticationService {
  constructor(private http: HttpClient) {}

  login(username: string, password: string) {
    const user = {
      username: username,
      password: password,
    };
    return this.http.post<any>(
      `http://localhost:8081/account`,
      user,
      httpOptions
    );
  }

  logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('accessToken');
  }
  changePassword(username: string, newpassword: string) {}
  forgotPassword(username: string) {}
  getAccessToken() {
    return localStorage.getItem('accessToken');
  }
}
