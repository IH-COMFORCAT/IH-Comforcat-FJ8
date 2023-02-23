import { Component, OnInit } from '@angular/core';
import { PostRequest } from 'src/app/models/post-request';
import { PostService } from 'src/app/services/post.service';

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent implements OnInit {

  posts: PostRequest[] = [];

  constructor(private postService: PostService) { }

  ngOnInit(): void {

    this.postService.getPosts().subscribe(data => {
      this.posts = data;
      console.log(this.posts);
    });

  }

  navigateToRoute(id: number) {
    let postId = this.posts[id].id;
    window.location.href = 'posts/' + postId;
  }

}
