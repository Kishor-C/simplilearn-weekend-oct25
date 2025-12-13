import { Component, inject } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ProfileService } from '../profile-service';
@Component({
  selector: 'app-mdf',
  standalone: false,
  templateUrl: './mdf.html',
  styleUrl: './mdf.css',
})
export class Mdf {
  builder = inject(FormBuilder);
  service = inject(ProfileService); // import ProfileService

  userForm = this.builder.group({
    firstname:['', [Validators.required, Validators.minLength(3)]], 
    lastname:['', [Validators.required, Validators.minLength(1)]], 
    phone : ['', [Validators.required, Validators.pattern(/^[0-9]{10}$/)]]
  });

  handleForm() {
    this.service.save(this.userForm.value); // {firstname:data, lastname:data, phone:data}
    this.userForm.reset({});
    this.userForm.patchValue({lastname:'KC'})
  }

}
