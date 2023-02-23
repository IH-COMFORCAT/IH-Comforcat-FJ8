import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PostRequest } from '../models/post-request';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private readonly baseUrl = 'https://jsonplaceholder.typicode.com/posts';

  constructor(private http: HttpClient) { }

  getPosts(): Observable<PostRequest[]> {
    return this.http.get<PostRequest[]>(this.baseUrl);
  }

  getPostById(id:number): Observable<PostRequest> {

    return this.http.get<PostRequest>(this.baseUrl + '/' + id);
  
  }


}
