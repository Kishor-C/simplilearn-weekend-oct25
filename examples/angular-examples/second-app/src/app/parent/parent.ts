import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  standalone: false,
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent {
  message : string = "This is a parent message";
  message2 : string = "This is another message";
  handleClick(val : string) {
    this.message = val;
  }
}
