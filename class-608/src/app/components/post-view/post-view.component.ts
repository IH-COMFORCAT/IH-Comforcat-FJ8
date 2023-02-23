import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PostRequest } from 'src/app/models/post-request';
import { PostService } from 'src/app/services/post.service';

@Component({
  selector: 'app-post-view',
  templateUrl: './post-view.component.html',
  styleUrls: ['./post-view.component.css']
})
export class PostViewComponent implements OnInit {

  constructor(private postService: PostService, private route: ActivatedRoute ) { }

  id: number = this.route.snapshot.params['id'];

  post!: PostRequest;

  ngOnInit(): void {
    this.getPostById();
  }

  getPostById() {
  this.postService.getPostById(this.id).subscribe(result =>{
    this.post=result;
  })
  
  }

}
