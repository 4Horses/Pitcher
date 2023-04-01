import { Component, OnInit } from '@angular/core';
import { menuList } from './menu-list';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss'],
})
export class NavigationComponent implements OnInit {
  sideMenu = menuList;
  collapse = false;

  constructor() {}

  ngOnInit(): void {}

  toggleSidebar() {
    this.collapse = !this.collapse;
  }
}
