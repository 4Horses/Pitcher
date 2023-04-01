import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  public reactiveForm = new FormGroup({
    email: new FormControl("", [Validators.required,
      Validators.pattern("^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"),
    ]),
    password: new FormControl("", Validators.required),
   
  });

  ngOnInit(){
    

  }
  isValid(){
    return this.reactiveForm.valid;
  }
}
