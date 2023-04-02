import { Component, OnInit } from '@angular/core';
import { MenuItem, menuList } from './menu-list';

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

  onClickMenuItem(event: MouseEvent, menuItem: MenuItem) {
    event.stopPropagation();
    this.sideMenu.forEach((item) => {
      item.isActive = false;
    });
    menuItem.isActive = true;
  }
}
