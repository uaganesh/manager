package com.telecom.manager.controller;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.telecom.complaint.bean.Complaints;
import com.telecom.manager.bean.Manager;
import com.telecom.manager.service.ManagerService;

@RestController
@CrossOrigin
public class ManagerController {

@Autowired
ManagerService managerService;

//View Active Tickets
@GetMapping(value="activetickets", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Complaints> getAllActiveTickets(Manager m){
	
	m.setPincode(691506);
	return managerService.getActiveTicketsService(m);
	
}

//View Active Tickets
@GetMapping(value="asssignedtickets", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Complaints> getAllAssignedTickets(Manager m){
	
	m.setPincode(691506);
	return managerService.getAssignedTicketsService(m);
	
}


//Assign Active Tickets To Engineers

@PostMapping(value="assignticketstoengineer",consumes = MediaType.APPLICATION_JSON_VALUE)
public String assignTicketToEngineer(@RequestBody Complaints complaints) {
	
	int result=managerService.assignTicketToEngineer(complaints);
	if(result==1) {
		return "Engineer Assigned Successfully";
	}
	else {
		return "error occured";
	}
	
}

////Search Ticket Status with Ticket id 
//@PostMapping(value ="searchTicket",consumes=MediaType.APPLICATION_JSON_VALUE)
//public List<Complaints> searchTicketById(){
//	
//	
//	
//}



}
