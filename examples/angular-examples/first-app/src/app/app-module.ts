import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Hello } from './hello/hello';
import { Hello2 } from './hello2/hello2';
import { EventDemo } from './event-demo/event-demo';
import { PropertyDemo } from './property-demo/property-demo';
import { FormsModule } from '@angular/forms';
import { TwoWayDemo } from './two-way-demo/two-way-demo';


@NgModule({
  declarations: [
    App, Hello, Hello2, EventDemo, PropertyDemo, TwoWayDemo
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
