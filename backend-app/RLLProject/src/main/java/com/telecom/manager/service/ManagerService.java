package com.telecom.manager.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.complaint.bean.Complaints;
import com.telecom.manager.bean.Manager;
import com.telecom.manager.repository.ManagerRepo;

@Service
public class ManagerService {

@Autowired
ManagerRepo managerRepo;

//Get Active Tickets
public List<Complaints> getActiveTicketsService(Manager m){
	
	return managerRepo.getActiveTickets(m);	
	
}

//Get Assigned Tickets
public List<Complaints> getAssignedTicketsService(Manager m){
	
	return managerRepo.getAssignedTickets(m);	

}


//Assign Ticket To Engineers
public int assignTicketToEngineer(Complaints c){
	
	return managerRepo.assignTicketToEngineer(c);	

}


}
