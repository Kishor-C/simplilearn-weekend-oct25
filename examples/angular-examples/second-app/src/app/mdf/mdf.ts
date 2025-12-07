import { Component, inject } from '@angular/core';
import { FormBuilder } from '@angular/forms';
@Component({
  selector: 'app-mdf',
  standalone: false,
  templateUrl: './mdf.html',
  styleUrl: './mdf.css',
})
export class Mdf {
  builder = inject(FormBuilder);
  
  userForm = this.builder.group({
    firstname:[''], lastname:[''], phone : ['']
  });

  handleForm() {
    console.log(this.userForm.value);
    this.userForm.reset({});
    this.userForm.patchValue({lastname:'KC'})
  }

}
