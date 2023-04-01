import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent {
  public individualForm = new FormGroup({
    FirstName: new FormControl("", Validators.required),
    LastName: new FormControl("", Validators.required),
    Email: new FormControl("", [Validators.required,
      Validators.pattern("^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"),
    ]),
    PhoneNumber: new FormControl("", Validators.required),
  });
  public corporateForm = new FormGroup({
   Name: new FormControl("", Validators.required),
    Address: new FormControl("", Validators.required),
    Email: new FormControl("",  [Validators.required,
      Validators.pattern("^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"),
    ]),
    PhoneNumber: new FormControl("", Validators.required),
  });
  isCorporate = false;
  ngOnInit() {
   
  }
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
}
