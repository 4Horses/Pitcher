import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Project } from '../models/project.model';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json; charset=utf-8;',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor(private http: HttpClient) { }
  createPost(project: Project) {
    return this.http.post<any>(`http://localhost:8081/projects`, project, httpOptions);
  }

  getAllUsers() {
    return this.http.get<any>(`http://localhost:8081/projects`, httpOptions);
  }

  updateUser(user: Project) {
    return this.http.patch<any>(`http://localhost:8081/user`, user, httpOptions);
  }

  deleteProject(id: number) {
    return this.http.delete<any>(`http://localhost:8081/projects/${id}`, httpOptions);
  }
}
