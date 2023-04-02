import { Component } from '@angular/core';

@Component({
  selector: 'app-statistics',
  templateUrl: './statistics.component.html',
  styleUrls: ['./statistics.component.scss']
})
export class StatisticsComponent {

  badges: string[] = [
    "../../../../assets/badge-icons/mentor.png",
    "../../../../assets/badge-icons/first_donation_to_project.png",
    "../../../../assets/badge-icons/second_project.png",
    "../../../../assets/badge-icons/trending_project.png",
  ]
  constructor() { }
}
