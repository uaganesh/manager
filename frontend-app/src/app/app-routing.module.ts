import { NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';
import { AssignOperationComponent } from './assign-operation/assign-operation.component';
import { ManagerDashboardComponent } from './managerdashboard/managerdashboard.component';
import { SearchComponent } from './search/search.component';
import { ViewActiveTicketsComponent } from './view-active-tickets/view-active-tickets.component';
import { ViewticketsComponent } from './viewtickets/viewtickets.component';
const routes: Routes = [
{path:"managerdashboard",component:ManagerDashboardComponent},
{path:"managerdashboard/viewTickets",component:ViewticketsComponent},
{path:"search",component:SearchComponent},
{path:"managerdashboard",component:ManagerDashboardComponent},
{path:"managerdashboard/viewTickets/activeTickets",component:ViewActiveTicketsComponent},
{path:"assign-operation",component:AssignOperationComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
