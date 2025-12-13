import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProfileService {
  tempDB : any = [];
  http = inject(HttpClient); // angular supplies HttpClient object

  // if anybody invokes getData() but doesn't subscribe then request will not be sent
  // request will be sent only if someone subscribes
  getData() : Observable<any> {
    let URL = "https://jsonplaceholder.typicode.com/users";
    return this.http.get(URL);
  }

  // save accepts an object and returns void
  save(profile : any) : void {
    this.tempDB.push(profile);
  }
  // findAll returns all the elements in the array
  findAll() : any {
    return this.tempDB;
  }
}
