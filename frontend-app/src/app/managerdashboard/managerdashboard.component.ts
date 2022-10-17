import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-managerdashboard',
  templateUrl: './managerdashboard.component.html',
  styleUrls: ['./managerdashboard.component.css']
})
export class ManagerDashboardComponent implements OnInit {

  complaint:string="image/complaint.png"
  constructor() { }

  ngOnInit(): void {
  }

}
