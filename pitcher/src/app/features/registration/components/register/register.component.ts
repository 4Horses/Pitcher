import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { first } from 'rxjs';
import { User } from 'src/app/core/models/user.model';
import { RegisterService } from 'src/app/core/services/register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent {
  public individualForm = new FormGroup({
    FirstName: new FormControl('', Validators.required),
    LastName: new FormControl('', Validators.required),
    Email: new FormControl('', [
      Validators.required,
      Validators.pattern('^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$'),
    ]),
    PhoneNumber: new FormControl('', Validators.required),
    Password: new FormControl('',  [
      Validators.required,
      Validators.pattern("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"),
    ]),

  });
  public corporateForm = new FormGroup({
    Name: new FormControl('', Validators.required),
    Address: new FormControl('', Validators.required),
    Email: new FormControl('', [
      Validators.required,
      Validators.pattern('^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$'),
    ]),
    PhoneNumber: new FormControl('', Validators.required),
    Password: new FormControl('',  [
      Validators.required,
      Validators.pattern("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"),
    ]),

  });
  isCorporate = false;
  constructor(private registerService: RegisterService, private router: Router,) {}
  ngOnInit() {}
  changeTab(role: string) {
    let corporateTab = document.getElementById('corporate');
    let individualTab = document.getElementById('individual');
    switch (role) {
      case 'corporate': {
        this.isCorporate = true;
        corporateTab!.style.display = 'flex';
        individualTab!.style.display = 'none';
        break;
      }
      case 'individual': {
        this.isCorporate = false;
        corporateTab!.style.display = 'none';
        individualTab!.style.display = 'flex';
        break;
      }
    }
  }

  getClass(role: string): any {
    switch (role) {
      case 'corporate':
        return this.isCorporate ? 'inactive-button' : 'active-button';
        break;
      case 'individual':
        return this.isCorporate ? 'active-button' : 'inactive-button';
        break;
    }
  }
  isValidForEdit(): boolean {
    return this.isCorporate
      ? this.corporateForm.valid
      : this.individualForm.valid;
  }

  createUserAccount() {
    console.log("In create user account");
    const user: User = {
      firstName: Number(this.individualForm.controls.FirstName.value),
      lastName: this.individualForm.controls.LastName.value!,
      email: this.individualForm.controls.Email.value!,
      phoneNumber: this.individualForm.controls.PhoneNumber.value!,
      password: this.individualForm.controls.Password.value!,
      address: ""
    }
    this.registerService
      .createUser(user).pipe(first())
      .subscribe((data) => {
        console.log(data);
        this.router.navigate([`/login`]);
      });
  }
  createCorporateAccount()  {
    // this.registerService
    //   .createUser(this.corporateForm.value as User)
    //   .subscribe((data) => {
      
    //     console.log(data);
    //   });
  }
}
