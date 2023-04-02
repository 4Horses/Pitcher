import { Component, ViewChild, ElementRef } from '@angular/core';
import { projectList } from './projectList';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { NewProjectComponent } from '../new-project/new-project.component';
import { ProjectDto as project } from '../../project';
import { Project } from 'src/app/core/models/project.model';
import { ProjectService } from 'src/app/core/services/project.service';
import { first } from 'rxjs';
import * as moment from 'moment';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.scss'],
})
export class ProjectsComponent {
  projects = projectList;
  @ViewChild('newProjectModal') newProjectModal!: NewProjectComponent;

  constructor(
    private router: Router,
    private dialog: MatDialog,
    private projectService: ProjectService
  ) {
    this.router = router;
    this.dialog = dialog;
  }
  ngOnInit(): void {
    this.projectService
      .getAllProjects()
      .pipe(first())
      .subscribe((data) => {
        this.projects = data;
      });
  }
  getProgress(project: Project) {
    var start = moment(project.startDate);
    var end = moment(project.endDate);
    var days = end.diff(start, 'days');
    var current = end.diff(moment(), 'days');
    console.log((current * days) / 100);
    if (end.diff(moment(), 'days') < 0) {
      return 100;
    }
    return (current * days) / 100;
  }

  onHover(project: Project) {
    project.isHovered = true;
  }

  onLeave(project: Project) {
    project.isHovered = false;
  }
  openDetailsModal(project: Project) {
    this.router.navigate([`/projects/${project.id}`]);
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
  logOut() {
    localStorage.removeItem('accessToken');
    this.router.navigate([`/login`]);
  }
}
