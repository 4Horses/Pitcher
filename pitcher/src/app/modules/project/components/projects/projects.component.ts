import { Component, ViewChild, ElementRef } from '@angular/core';
import { projectList } from './projectList';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { NewProjectComponent } from '../new-project/new-project.component';
import { Project } from '../../project';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.scss'],
})
export class ProjectsComponent {
  projects = projectList;
  @ViewChild('newProjectModal') newProjectModal!: NewProjectComponent;

  constructor(private router: Router, private dialog: MatDialog) {
    this.router = router;
    this.dialog = dialog;
  }

  onHover(project: Project) {
    project.isHovered = true;
  }

  onLeave(project: Project) {
    project.isHovered = false;
  }

  createProject() {
    const dialogRef = this.dialog.open(NewProjectComponent, {
      width: '860px',
      height: '640px',
      data: {},
    });
    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.projects.push(result);
      }
    });
  }
}
