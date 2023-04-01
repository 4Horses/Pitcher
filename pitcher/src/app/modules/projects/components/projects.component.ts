import { Component } from '@angular/core';
import { Project, projectList } from './projectList';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.scss'],
})
export class ProjectsComponent {
  projects = projectList;

  onHover(project: Project) {
    project.isHovered = true;
  }

  onLeave(project: Project) {
    project.isHovered = false;
  }
}
