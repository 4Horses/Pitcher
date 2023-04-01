import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent {
  reactiveForm!: FormGroup;
  isCorporate = false;
  ngOnInit() {
    this.reactiveForm = new FormGroup({
      email: new FormControl(''),
      password: new FormControl(''),
    });
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
}
