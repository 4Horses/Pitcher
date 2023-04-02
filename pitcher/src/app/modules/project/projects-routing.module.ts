import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ProjectsComponent } from './components/projects/projects.component';
import { NewProjectComponent } from './components/new-project/new-project.component';
import { ProjectDetailsComponent } from 'src/app/core/components/project-details/project-details.component';

const routes: Routes = [
  { path: '', redirectTo: 'all', pathMatch: 'full' },
  { path: 'all', component: ProjectsComponent },
  { path: ':projectId', component: ProjectDetailsComponent },

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ProjectsRoutingModule {}
