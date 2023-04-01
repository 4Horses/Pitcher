import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'pitcher';
  currentRoute = '/';

  constructor(private router: Router) {}

  isLogged() {
    return this.router.url != '/login' && this.router.url != '/register';
  }
}
