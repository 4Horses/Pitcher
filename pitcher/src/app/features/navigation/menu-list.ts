export class MenuItem {
  constructor(
    public name: string,
    public route: string,
    public toolTip: string,
    public icon: string = '',
    public isActive: boolean = false
  ) {}
}

export const menuList = [
  new MenuItem('Profile', 'profile', 'Your Profile', 'account_circle'),
  new MenuItem('Dashboard', 'dashboard', 'Dashboard', 'dashboards'),
  new MenuItem('Projects', 'projects', 'Projects', 'design_services'),
  new MenuItem('Badges', 'statistics', 'Statistics', 'military_tech'),
  new MenuItem('Categories', 'settings', 'Settings', 'category'),
];
