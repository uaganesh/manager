import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ManagerDashboardComponent } from './managerdashboard/managerdashboard.component';
import { SearchComponent } from './search/search.component';
import { ViewticketsComponent } from './viewtickets/viewtickets.component';
import { ViewActiveTicketsComponent } from './view-active-tickets/view-active-tickets.component';
import { HttpClientModule } from '@angular/common/http';
import { AssignOperationComponent } from './assign-operation/assign-operation.component';

@NgModule({
  declarations: [
    AppComponent,
    ManagerDashboardComponent,
    SearchComponent,
    ViewticketsComponent,
    ViewActiveTicketsComponent,
    AssignOperationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule,ReactiveFormsModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
