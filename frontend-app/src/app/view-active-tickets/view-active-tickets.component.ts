import { Component, OnInit } from '@angular/core';
import { Complaints } from '../complaints';
import { ComplaintsService } from '../complaints.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-active-tickets',
  templateUrl: './view-active-tickets.component.html',
  styleUrls: ['./view-active-tickets.component.css']
})
export class ViewActiveTicketsComponent implements OnInit {

  complaint:Array<Complaints>=[];

  constructor(public cs:ComplaintsService,public router:Router) { }

  ngOnInit(): void {

    this.viewActiveTicketDetails();
    
  }

  viewActiveTicketDetails(){
    this.cs.loadActiveComplaintData().subscribe({
      next:(data:any)=>this.complaint=data,
      error:(error:any)=>console.log(this.complaint),
      complete:()=>console.log("Completed")
    })
  }


  ticketDetails(complaint:any)
  {
    sessionStorage.setItem("complaintInfo",JSON.stringify(complaint));
    console.log("Sucessfully Stored in complaintInfo")
    this.router.navigate(["assign-operation"]);
  }

}
