import { Component } from '@angular/core';

@Component({
  selector: 'app-directives-demo',
  standalone: false,
  templateUrl: './directives-demo.html',
  styleUrl: './directives-demo.css',
})
export class DirectivesDemo {
  names : string[] = ["Atharva", "Siddharth", "Vishnu", "Rohith"];
  users : any[] = [{id: 100, name: "Alex"}, {id: 200, name: "Brad"}, {id: 300, name: "Charles"}];
  username : string | undefined = undefined;
  option = 0;
  toggle() {
    this.username = 'Guest';
    this.option++;
    if(this.option == 4) {
      this.option = 0;
    }
  }
}
