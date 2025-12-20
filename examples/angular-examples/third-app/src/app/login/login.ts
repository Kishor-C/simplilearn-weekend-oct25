import { Component, inject, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login implements OnInit {
  builder = inject(FormBuilder);
  router = inject(Router);

  loginForm = this.builder.group({
    username: [''], password: [''] 
  });

  ngOnInit(): void {
    // clear the old session
    sessionStorage.clear();
  }

  handleLogin() {
    let username  = this.loginForm.controls['username'].value ;
    let password = this.loginForm.controls['password'].value;
    
    //alert('Form submitted, username is '+username);
    if(username === password) {
      // success/username - store username in the sessionStorage
      sessionStorage.setItem("loggedInUser", username!);
      this.router.navigate(['success', username])
    } else {
      alert('username or password is incorrect, redirecting');
      this.router.navigate(['login'])
    }
  }
}
