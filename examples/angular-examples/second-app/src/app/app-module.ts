import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { StyleClassDemo } from './style-class-demo/style-class-demo';
import { Parent } from './parent/parent';
import { Child } from './child/child';

@NgModule({
  declarations: [
    App,
    StyleClassDemo,
    Parent,
    Child
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
