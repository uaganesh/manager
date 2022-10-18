import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ComplaintsService } from '../complaints.service';

@Component({
  selector: 'app-assign-operation',
  templateUrl: './assign-operation.component.html',
  styleUrls: ['./assign-operation.component.css']
})
export class AssignOperationComponent implements OnInit {
 
  complaint:any;
 public sessionStorage = sessionStorage;
  constructor(public router:Router,public cs:ComplaintsService) { }

  ngOnInit(): void {
    let obj=sessionStorage.getItem("complaintInfo");
    if(obj!=null){
    this.complaint=JSON.parse(obj);
    }
  }

  



}
