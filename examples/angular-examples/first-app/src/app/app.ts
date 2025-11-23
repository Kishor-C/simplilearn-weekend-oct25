import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  // typescript code
  username : string = "Atharv";
  dob : Date = new Date("2024-08-04");
  // javascript code
  name = "Siddharth";
  birthday = new Date("2019-04-25");

}
