import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StatisticsComponent } from './components/statistics.component';
import { StatisticsRoutingModule } from './statistics-routing.module';
import { BadgeIconComponent } from 'src/app/shared/components/badge-icon/badge-icon.component';

@NgModule({
  declarations: [StatisticsComponent, BadgeIconComponent],
  imports: [CommonModule, StatisticsRoutingModule],
})
export class StatisticsModule {}
