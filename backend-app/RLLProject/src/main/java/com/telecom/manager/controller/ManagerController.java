package com.telecom.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.complaint.bean.Complaints;
import com.telecom.manager.service.ManagerService;

@RestController
public class ManagerController {

@Autowired
ManagerService managerService;

@GetMapping(value="activetickets", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Complaints> getAllActiveTickets(){
	
	return managerService.getActiveTicketsService();
	
}
	

}
