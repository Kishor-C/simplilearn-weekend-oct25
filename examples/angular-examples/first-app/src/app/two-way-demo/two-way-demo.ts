import { Component } from '@angular/core';

@Component({
  selector: 'app-two-way-demo',
  standalone: false,
  templateUrl: './two-way-demo.html',
  styleUrl: './two-way-demo.css',
})
export class TwoWayDemo {
  firstname : string = "";
  lastname: string = "";
}
