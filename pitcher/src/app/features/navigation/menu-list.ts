export class MenuItem {
    constructor(
        public name: string,
        public route: string,
        public toolTip: string,
        public icon: string = ''
    ) {}
}

export const menuList = [
    new MenuItem('Profile', 'profile', 'Your Profile', 'science'),
    new MenuItem('Dashboard', 'dashboard', 'Dashboard', 'biotech'),
    new MenuItem('Projects', 'projects', 'Projects', 'calculate'),
    new MenuItem('Statistics', 'statistics', 'Statistics', 'flash_on'),
    new MenuItem('Settings', 'settings', 'Settings', 'flash_on'),
];