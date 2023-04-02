import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { first } from 'rxjs';
import { projectList } from 'src/app/modules/project/components/projects/projectList';
import { Project } from '../../models/project.model';
import { ProjectService } from '../../services/project.service';

@Component({
  selector: 'app-project-details',
  templateUrl: './project-details.component.html',
  styleUrls: ['./project-details.component.scss'],
})
export class ProjectDetailsComponent {
  list = projectList;
  currentObject: Project;
  public reactiveForm = new FormGroup({
    name: new FormControl(''),
    description: new FormControl(''),
    createdAt: new FormControl(''),
    startDate: new FormControl(''),
    endDate: new FormControl(''),
  });
  projectId: number = 0;
  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private projectService: ProjectService
  ) {
    this.router = router;
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((params) => {
      this.projectId = +params.get('projectId')!;
    });
    //this.reactiveForm.patchValue(this.list[this.projectId-1]);
    this.currentObject = this.list[this.projectId - 1];
  }

  joinProject() {
    //this.currentObject.isJoined = true;
  }

  deleteProject() {
    this.projectService
      .deleteProject(this.projectId)
      .pipe(first())
      .subscribe((data) => {});
    this.router.navigate([`/projects/all`]);
  }
}
