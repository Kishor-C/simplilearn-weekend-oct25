import { Component, inject } from '@angular/core';
import { ProfileService } from '../profile-service';

@Component({
  selector: 'app-list-profile',
  standalone: false,
  templateUrl: './list-profile.html',
  styleUrl: './list-profile.css',
})
export class ListProfile {
  profiles : any = undefined;
  service = inject(ProfileService);

  users : any = undefined;
  
  handleClick() {
    this.profiles = this.service.findAll();
    this.service.getData().subscribe({
      next : (v) => this.users = v,
      error : (e) => console.log(e),
      complete: () => console.log('completed...')
    });
  }
}
