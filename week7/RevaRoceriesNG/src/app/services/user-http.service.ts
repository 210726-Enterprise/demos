import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/User';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserHttpService {

  constructor(private http: HttpClient) { }

  private postHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

  getAllUsers(): Observable<User[]> {
    return this.http.get<User[]>('http://localhost:8080/api/users');
  }

  addUser(user: User): Observable<User> {
    return this.http.post<User>('http://localhost:8080/api/users', user, { headers: this.postHeaders });
  }

}
