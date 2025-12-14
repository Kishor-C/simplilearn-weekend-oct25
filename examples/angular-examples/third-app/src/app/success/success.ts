import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-success',
  standalone: false,
  templateUrl: './success.html',
  styleUrl: './success.css',
})
export class Success implements OnInit{

  username = "";
  active = inject(ActivatedRoute);
  // auto-executed when component is initialized
  ngOnInit(): void {
    this.active.params
      .subscribe({
        next: (p: any)=> this.username=p['user'],
        error : (err: any) => alert('error..')
      })
  }

}
