import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Complaints } from './complaints';

@Injectable({
  providedIn: 'root'
})
export class ComplaintsService {

  constructor(public http:HttpClient) { }

//Load Acive Complaints That Are not Assigned 
loadActiveComplaintData():Observable<Complaints[]>{
  return this.http.get<Complaints[]>("http://localhost:8080/activetickets");
}

findAllComplaints():Observable<Complaints[]>{
return this.http.get<Complaints[]>("http://localhost:8080/activetickets");
}
}
