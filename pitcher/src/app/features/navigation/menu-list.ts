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
    new MenuItem('Dashboard', 'projects/all', 'Home', 'biotech'),
    new MenuItem('Projects', 'projects', 'Projects', 'calculate'),
    new MenuItem('Badges', 'statistics', 'Statistics', 'star'),
    new MenuItem('Categories', 'settings', 'Settings', 'label_outline'),
];
