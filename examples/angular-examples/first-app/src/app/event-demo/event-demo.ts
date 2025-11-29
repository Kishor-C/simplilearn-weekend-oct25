import { Component } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  standalone: false,
  templateUrl: './event-demo.html',
  styleUrl: './event-demo.css',
})
export class EventDemo {
  message : string = "";
  counter : number = 0;

  handleClick(text: string) {
    this.message = text;
    this.counter++;
  }
}
