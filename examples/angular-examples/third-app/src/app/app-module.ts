import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Login } from './login/login';
import { Register } from './register/register';
import { Search } from './search/search';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Success } from './success/success';
import { Settings } from './settings/settings';
import { Dashboard } from './dashboard/dashboard';


@NgModule({
  declarations: [
    App,
    Login,
    Register,
    Search,
    Success,
    Settings,
    Dashboard,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
