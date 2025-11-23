import { Component } from "@angular/core";

@Component({
    selector : 'hello',
    templateUrl : './hello.html',
    standalone: false
})
export class Hello {
    title : string = 'This is hello component';
}