import { Component, ElementRef } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';
import { ProjectService } from 'src/app/core/services/project.service';

@Component({
  selector: 'app-new-project',
  templateUrl: './new-project.component.html',
  styleUrls: ['./new-project.component.scss'],
})
export class NewProjectComponent {
  name = '';
  category = '';
  description = '';

  constructor(
    public dialogRef: MatDialogRef<NewProjectComponent>,
    public elementRef: ElementRef,
    private projectService: ProjectService
  ) {}

  submitProject(): void {
    const project = {
      name: this.name,
      category: this.category,
      description: this.description,
    };
   

   // this.projectService.createPost(project).subscribe((data) => {
      this.dialogRef.close(project);
   // });
  }
}
