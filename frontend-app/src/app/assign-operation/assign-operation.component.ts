import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ComplaintsService } from '../complaints.service';
import {FormGroup,FormControl} from '@angular/forms';
import { Complaints } from '../complaints';
@Component({
  selector: 'app-assign-operation',
  templateUrl: './assign-operation.component.html',
  styleUrls: ['./assign-operation.component.css']
})
export class AssignOperationComponent implements OnInit {
  complaint:any;
  obj:any;
  
  constructor(public router:Router,public cs:ComplaintsService) { }
  
  
  engineerRef=new FormGroup({
    tid:new FormControl(),
    eid:new FormControl(),
    pincode:new FormControl(),
    reason:new FormControl(),
    status:new FormControl(),
    userid:new FormControl()  
    });
  ngOnInit(): void {
    let obj=sessionStorage.getItem("complaintInfo");
    console.log("obj="+obj);
    if(obj!=null){
    this.complaint=JSON.parse(obj)[0];
    this.engineerRef.controls.tid.setValue(this.complaint.tid);
    this.engineerRef.controls.eid.setValue(this.complaint.eid);
    this.engineerRef.controls.pincode.setValue(this.complaint.pincode);
    this.engineerRef.controls.reason.setValue(this.complaint.reason);
    this.engineerRef.controls.status.setValue(this.complaint.status);
    this.engineerRef.controls.userid.setValue(this.complaint.userid);

    }

  }

  



}
