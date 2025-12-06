import { Component } from '@angular/core';

@Component({
  selector: 'app-style-class-demo',
  standalone: false,
  templateUrl: './style-class-demo.html',
  styleUrl: './style-class-demo.css',
})
export class StyleClassDemo {

  myStyles = {color: "blue", border: "2px solid blue", padding : "20px"}
  status = true;
  toggle() {
    this.status = !this.status;
  }
  changeStylesToRed() {
    this.myStyles.color = "red";
    this.myStyles.border = "2px solid red"
  }
  changeStylesToGreen() {
    this.myStyles.color = "green";
    this.myStyles.border = "2px solid green"
  }
  changeStylesToDefault() {
    this.myStyles.color = "blue";
    this.myStyles.border = "2px solid blue"
  }
  
}
