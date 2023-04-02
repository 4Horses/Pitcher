import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SettingsComponent } from './components/settings.component';
import { SettingsRoutingModule } from './settings-routing.module';
import { CategoryCardComponent } from 'src/app/shared/components/category-card/category-card.component';

@NgModule({
  declarations: [SettingsComponent,
  CategoryCardComponent],
  imports: [CommonModule, SettingsRoutingModule],
})
export class SettingsModule {}
