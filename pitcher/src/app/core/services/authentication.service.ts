import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthenticationService {
  constructor() {}

  login(username: string, password: string) {
    localStorage.setItem('accessToken', '1234567890');
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
