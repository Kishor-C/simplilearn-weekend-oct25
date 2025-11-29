import { Component } from '@angular/core';

@Component({
  selector: 'app-property-demo',
  standalone: false,
  templateUrl: './property-demo.html',
  styleUrl: './property-demo.css',
})
export class PropertyDemo {
  isDisabled : boolean = true;
  isHidden : boolean = true;

  toggle() {
    this.isDisabled = !this.isDisabled;
    this.isHidden = !this.isHidden;
  }
}
