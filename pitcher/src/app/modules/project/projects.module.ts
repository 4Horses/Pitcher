import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProjectsComponent } from './components/projects/projects.component';
import { ProjectsRoutingModule } from './projects-routing.module';
import { NewProjectComponent } from './components/new-project/new-project.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [ProjectsComponent, NewProjectComponent],
  imports: [
    CommonModule,
    ProjectsRoutingModule,
    MatFormFieldModule,
    FormsModule,
  ],
})
export class ProjectsModule {}
