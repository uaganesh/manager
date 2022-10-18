import { NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';
import { AssignOperationComponent } from './assign-operation/assign-operation.component';
import { ManagerDashboardComponent } from './managerdashboard/managerdashboard.component';
import { SearchComponent } from './search/search.component';
import { ViewActiveTicketsComponent } from './view-active-tickets/view-active-tickets.component';
import { ViewticketsComponent } from './viewtickets/viewtickets.component';
const routes: Routes =[
{path:"manager",component:ManagerDashboardComponent},
{path:"manager/viewTickets/activeTickets",component:ViewActiveTicketsComponent},
{path:"assign-operation",component:AssignOperationComponent},
{path:"manager/viewTickets",component:ViewticketsComponent},
{path:"",redirectTo:"manager",pathMatch:"full"}
];

// const routes: Routes =[
//     {path:"manager",component:ManagerDashboardComponent,children:[{path:"viewTickets",component:ViewticketsComponent},
//        {path:"viewActiveTickets",component:ViewActiveTicketsComponent},
//        {path:"assign-operation",component:AssignOperationComponent}]},
//        {path:"",redirectTo:"manager",pathMatch:"full"}
// ];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
