import { Component } from '@angular/core';

@Component({
  selector: 'app-tdf',
  standalone: false,
  templateUrl: './tdf.html',
  styleUrl: './tdf.css',
})
export class Tdf {
  firstname : string = "";
  lastname : string = "";
  phone : string = "";
  dob : Date | undefined = undefined;
  
  handleForm(val : any) {
    console.log(val);
    // in real time we need to store the val in the backend
  }
}
