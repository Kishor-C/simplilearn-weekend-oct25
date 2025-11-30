import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  standalone: false,
  templateUrl: './pipe-demo.html',
  styleUrl: './pipe-demo.css',
})
export class PipeDemo {
  // always give the date in yyyy-MM-dd format because it is ISO format
  employee = {id: 100, name : "Alex", salary : 20000, birthday : "2001-10-19"};
  users = [{username: "Sachin", gender: "Male"}, {username:"Preeti", gender:"Female"}]
}
