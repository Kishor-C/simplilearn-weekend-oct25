import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Login } from './login/login';
import { Register } from './register/register';
import { Search } from './search/search';
import { Success } from './success/success';
import { Dashboard } from './dashboard/dashboard';
import { Settings } from './settings/settings';

const routes: Routes = [
  {path: 'login', component : Login},
  {path: 'register', component: Register},
  {path: '', component: Login},
  {path: 'success/:user', component: Success, children: [
    {path: '', component: Dashboard},
    {path: 'dashboard', component: Dashboard},
    {path: 'search', component: Search},
    {path: 'settings', component: Settings}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
