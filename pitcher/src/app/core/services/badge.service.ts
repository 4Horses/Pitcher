import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json; charset=utf-8;',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class BadgeService {

  constructor(private http: HttpClient) { }
  
  getAllBadgeById(badgeId: string) {
    return this.http.get<any>(`http://localhost:8081/badge/${badgeId}`, httpOptions);
  }
}
