import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/core/services/authentication.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss'],
})
export class DashboardComponent {
  constructor(
    private router: Router,
    authenticationService: AuthenticationService
  ) {
    authenticationService.getAccessToken()
      ? this.router.navigate([`/home`])
      : this.router.navigate([`/login`]);
  }
}
