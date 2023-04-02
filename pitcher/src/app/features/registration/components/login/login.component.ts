import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { first } from 'rxjs';
import { AuthenticationService } from 'src/app/core/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {
  public reactiveForm = new FormGroup({
    email: new FormControl('', [
      Validators.required,
      Validators.pattern('^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$'),
    ]),
    password: new FormControl('', Validators.required),
  });
  constructor(
    private router: Router,
    private authenticationService: AuthenticationService
  ) {}

  ngOnInit() {}

  isValid() {
    return this.reactiveForm.valid;
  }

  login() {
   
   this.router.navigate([`/projects/all`]);
   localStorage.setItem('accessToken', '1234567890');

    this.authenticationService
    .login(
      this.reactiveForm.controls.email.value!,
      this.reactiveForm.controls.password.value!
    ).pipe(first())
      .subscribe((data) => {
        this.router.navigate([`/home`]);
       
      });
  }
}
