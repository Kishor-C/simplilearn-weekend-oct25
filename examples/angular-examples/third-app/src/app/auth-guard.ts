import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

// authGuard is a variable that holds the logic of arrow function
// we must write the logic inside arrow function
// this arrow function is called when the variable is mentioned in the routes
export const authGuard: CanActivateFn = (route, state) => {
  let router: Router = inject(Router);
  let username = sessionStorage.getItem('loggedInUser');
  let path = route.paramMap.get('user');
  if(username == path) {
    return true;
  } else {
    alert("You must login first");
    router.navigate(['/login']);
    return false;
  }
  
};
