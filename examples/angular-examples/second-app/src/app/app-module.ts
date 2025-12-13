import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { StyleClassDemo } from './style-class-demo/style-class-demo';
import { Parent } from './parent/parent';
import { Child } from './child/child';
import { Tdf } from './tdf/tdf';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Mdf } from './mdf/mdf';
import { ListProfile } from './list-profile/list-profile';
import { provideHttpClient } from '@angular/common/http';

@NgModule({
  declarations: [
    App,
    StyleClassDemo,
    Parent,
    Child,
    Tdf,
    Mdf,
    ListProfile
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(), provideHttpClient()
  ],
  bootstrap: [App]
})
export class AppModule { }
