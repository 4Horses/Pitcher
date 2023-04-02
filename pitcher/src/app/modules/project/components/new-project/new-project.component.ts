import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-new-project',
  templateUrl: './new-project.component.html',
  styleUrls: ['./new-project.component.scss']
})

export class NewProjectComponent {
  name = '';
  category = '';
  description = '';

  constructor(public dialogRef: MatDialogRef<NewProjectComponent>) {}

  submitProject(): void {
    const project = { name: this.name, category: this.category, description: this.description };
    this.dialogRef.close(project);
  }

  onCancelClick(): void {
    this.dialogRef.close();
  }
}
