import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  standalone: false,
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {
  @Input()
  parentMessage: string = "Good morning";
  @Output()
  childMessage : EventEmitter<string> = new EventEmitter<string>();
  send(val: string) {
    this.childMessage.emit(val);
  }
}
