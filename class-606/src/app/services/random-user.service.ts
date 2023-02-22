import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RandomUserResponse } from '../models/random-user-model';

@Injectable({
  providedIn: 'root'
})
export class RandomUserService {

  private  readonly baseUrl = 'https://randomuser.me/apissadsd';

  constructor(private http: HttpClient) { }


  getRandomUser(): Observable<RandomUserResponse> {

    return this.http.get<RandomUserResponse>(this.baseUrl); 

  }


  

}
