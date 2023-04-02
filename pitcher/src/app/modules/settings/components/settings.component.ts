import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { Category } from 'src/app/shared/models/category';

@Component({
  selector: 'app-settings',
  templateUrl: './settings.component.html',
  styleUrls: ['./settings.component.scss']
})
export class SettingsComponent implements OnInit {

  @ViewChild('searchbar') searchbar!: ElementRef;
  searchText = '';

  toggleSearch: boolean = false;
  constructor() {
  }

  openSearch() {
    this.toggleSearch = true;
    this.searchbar.nativeElement.focus();
  }
  searchClose() {
    this.searchText = '';
    this.toggleSearch = false;
  }

  categories: Category[] = [
    {
      "name": "Programming",
      "description": "Learn how to code and create software applications for various platforms.",
      "imagePath": "../../../../assets/images/programming.svg"
    },
    {
      "name": "Web Development",
      "description": "Build dynamic and responsive websites using HTML, CSS, and JavaScript.",
      "imagePath": "../../../../assets/images/webdevelopment.svg"
    },
    {
      "name": "Mobile App Development",
      "description": "Create mobile applications for iOS and Android using various programming languages.",
      "imagePath": "../../../../assets/images/mobileappdevelopment.svg"
    },
    {
      "name": "Programming",
      "description": "Learn how to code and create software applications for various platforms.",
      "imagePath": "../../../../assets/images/programming.svg"
    },
    {
      "name": "Web Development",
      "description": "Build dynamic and responsive websites using HTML, CSS, and JavaScript.",
      "imagePath": "../../../../assets/images/webdevelopment.svg"
    },
    {
      "name": "Mobile App Development",
      "description": "Create mobile applications for iOS and Android using various programming languages.",
      "imagePath": "../../../../assets/images/mobileappdevelopment.svg"
    },
    {
      "name": "Programming",
      "description": "Learn how to code and create software applications for various platforms.",
      "imagePath": "../../../../assets/images/programming.svg"
    },
    {
      "name": "Web Development",
      "description": "Build dynamic and responsive websites using HTML, CSS, and JavaScript.",
      "imagePath": "../../../../assets/images/webdevelopment.svg"
    },
    {
      "name": "Mobile App Development",
      "description": "Create mobile applications for iOS and Android using various programming languages.",
      "imagePath": "../../../../assets/images/mobileappdevelopment.svg"
    },
    {
      "name": "Programming",
      "description": "Learn how to code and create software applications for various platforms.",
      "imagePath": "../../../../assets/images/programming.svg"
    },
    {
      "name": "Web Development",
      "description": "Build dynamic and responsive websites using HTML, CSS, and JavaScript.",
      "imagePath": "../../../../assets/images/webdevelopment.svg"
    },
    {
      "name": "Mobile App Development",
      "description": "Create mobile applications for iOS and Android using various programming languages.",
      "imagePath": "../../../../assets/images/mobileappdevelopment.svg"
    }
  ]

  // {
  //   "name": "Artificial Intelligence",
  //   "description": "Learn about machine learning algorithms and how to create intelligent systems.",
  //   "imagePath": "artificialintelligence.svg"
  // },
  // {
  //   "name": "Machine Learning",
  //   "description": "Learn about algorithms and statistical models that enable systems to learn and make predictions.",
  //   "imagePath": "machinelearning.svg"
  // },
  // {
  //   "name": "Data Science",
  //   "description": "Data Science: Analyze and interpret complex data using statistical and computational techniques.",
  //   "imagePath": "datascience.svg"
  // },
  // {
  //   "name": "Game Development",
  //   "description": "Create video games using various game engines and programming languages.",
  //   "imagePath": "gamedevelopment.svg"
  // },
  // {
  //   "name": "Graphic Design",
  //   "description": "Learn about design principles and create visual designs for various media.",
  //   "imagePath": "graphicdesign.svg"
  // },
  // {
  //   "name": "UI/UX Design",
  //   "description": "Design user interfaces and experiences for websites, applications, and other digital products.",
  //   "imagePath": "uiuxdesign.svg"
  // },
  // {

  //   "name": "Product Design",
  //   "description": "Learn about product development processes and design physical products for various industries.",
  //   "imagePath": "productdesign.svg"
  // },
  // {
  //   "name": "Photography",
  //   "description": "Capture and edit photos using various techniques and software.",
  //   "imagePath": "photography.svg"
  // },
  // {
  //   "name": "Video Production",
  //   "description": "Learn about video production processes and create professional videos for various purposes.",
  //   "imagePath": "videoproduction.svg"
  // },
  // {
  //   "name": "Music Production",
  //   "description": "Create and produce music using various digital audio workstations and software.",
  //   "imagePath": "musicproduction"
  // },
  // {
  //   "name": "Writing",
  //   "description": "Learn about different writing styles and techniques and create written content for various purposes.",
  //   "imagePath": "writing.svg"
  // },
  // {
  //   "name": "Content Creation",
  //   "description": "Create various types of content including videos, articles, and social media posts for various purposes.",
  //   "imagePath": "contentcreation.svg"
  // },
  // {
  //   "name": "Marketing",
  //   "description": "Learn about different marketing strategies and techniques and create marketing campaigns for various products and services.",
  //   "imagePath": "marketing.svg"
  // },
  // {
  //   "name": "Social Media Management",
  //   "description": "Manage social media accounts and create engaging content for various businesses and organizations.",
  //   "imagePath": "socialmediamanagement.svg"
  // },
  // {
  //   "name": "Business Development",
  //   "description": "Learn about different business models and strategies and help businesses grow and expand.",
  //   "imagePath": "businessdevelopment.svg"
  // },
  // {
  //   "name": "Entrepreneurship",
  //   "description": "Learn how to start and run a business successfully and create products and services that meet market needs.",
  //   "imagePath": "entrepreneurship.svg"
  // },
  // {
  //   "name": "Investing",
  //   "description": "Learn about different investment strategies and techniques and invest in stocks, bonds, and other financial instruments.",
  //   "imagePath": "investing.svg"
  // },
  // {
  //   "name": "Finance",
  //   "description": "Learn about financial management and analysis and help businesses and individuals make informed financial decisions.",
  //   "imagePath": "finance.svg"
  // },
  // {
  //   "name": "Cooking & Baking",
  //   "description": "Learn about different cooking and baking techniques and create delicious and healthy meals and desserts.",
  //   "imagePath": "cookingbaking.svg"
  // },
  // {
  //   "name": "Home Improvement/DIY",
  //   "description": "Learn how to make home repairs and improvements and create DIY projects for various purposes.",
  //   "imagePath": "homeimprovementdiy.svg"
  // },
  // {
  //   "name": "Art & Design",
  //   "description": "Learn about different art forms and techniques and create visual art for various purposes.",
  //   "imagePath": "artdesign.svg"
  // },
  // {
  //   "name": "Fashion & Style",
  //   "description": "Learn about fashion design and trends and create clothing and accessories for various purposes.",
  //   "imagePath": "fashionstyle.svg"
  // },
  // {
  //   "name": "Fitness & Exercise",
  //   "description": "Learn about different exercise routines and techniques and help individuals achieve their fitness goals.",
  //   "imagePath": "fitnessexercise.svg"
  // },
  // {
  //   "name": "Health & Wellness",
  //   "description": "Learn about different health and wellness practices and help individuals improve their overall well-being.",
  //   "imagePath": "healthwellness.svg"
  // },
  // {
  //   "name": "Travel & Tourism",
  //   "description": "Learn about different travel destinations and experiences and help individuals plan and book their trips.",
  //   "imagePath": "traveltourism.svg"
  // },
  // {
  //   "name": "Language Learning",
  //   "description": "Learn a new language and improve communication skills for personal and professional purposes.",
  //   "imagePath": "languagelearning.svg"
  // },
  // {
  //   "name": "Education & Teaching",
  //   "description": "Learn about different teaching techniques and methods and help individuals achieve their educational goals.",
  //   "imagePath": "educationteaching.svg"
  // },
  // {
  //   "name": "Parenting & Family",
  //   "description": "Learn about different parenting practices and techniques and help individuals raise happy and healthy families.",
  //   "imagePath": "parentingfamily.svg"
  // },
  // {
  //   "name": "Philosophy & Ethics",
  //   "description": "Learn about different philosophical and ethical principles and apply them to various aspects of life.",
  //   "imagePath": "philosophyethics.svg"
  // },
  // {
  //   "name": "Science & Technology",
  //   "description": "Learn about different scientific and technological advancements and apply them to various industries and fields.",
  //   "imagePath": "sciencetechnology.svg"
  // },
  // {
  //   "name": "Sports & Recreation",
  //   "description": " Learn about different sports and recreational activities and participate in various physical activities for fun and health.",
  //   "imagePath": "sportsrecreation.svg"
  // },
  // {
  //   "name": "Pets & Animal Care",
  //   "description": "Learn about different pet care practices and techniques and take care of pets and animals for various purposes.",
  //   "imagePath": "petsanimalcare.svg"
  // }

  ngOnInit(): void {
    // this.dataService.getCategories().subscribe(categories => {
    //   this.categories = categories;
    // });
  }
}
