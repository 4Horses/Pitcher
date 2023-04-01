export class Project {
  constructor(
    public name: string,
    public progress: number,
    public description: string,
    public isHovered = false
  ) {}
}

export const projectList = [
  new Project(
    'Gamification App',
    99,
    'Get motivated to achieve your goals with our fun and engaging gamification app that tracks your progress and encourages you every step of the way'
  ),
  new Project(
    'Woodworking Project',
    0,
    'Transform your living space with our DIY woodworking project that teaches you how to build custom shelves, cabinets, or other storage solutions that fit your unique style and needs'
  ),
  new Project(
    'Economy Project',
    99,
    'Explore the world of finance and investing with our economy project that offers insights and analysis on market trends, investment strategies, and economic indicators.'
  ),
  new Project(
    'Cooking Project',
    25,
    'Learn new recipes and techniques from top chefs with our cooking project that includes step-by-step videos and interactive tutorials.'
  ),
  new Project(
    'Gardening Project',
    50,
    'Grow your own organic produce and cultivate a beautiful garden with our gardening project that provides expert tips and guidance.'
  ),
  new Project(
    'Language Learning App',
    75,
    'Master a new language with our language learning app that uses gamification and interactive exercises to make learning fun and effective.'
  ),
  new Project(
    'Home Automation Project',
    80,
    'Upgrade your home with smart devices and automate your daily routines with our home automation project that provides easy-to-follow instructions and tutorials.'
  ),
];
