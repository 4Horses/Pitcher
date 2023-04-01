import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  reactiveForm!: FormGroup;

  ngOnInit(){
    this.reactiveForm = new FormGroup({
      email: new FormControl(''),
      password: new FormControl('')
    });

  }
  isValid(){
    return !this.reactiveForm.valid;
  }
}
