package com.telecom.manager.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telecom.complaint.bean.Complaints;


@Repository
public class ManagerRepo {
	
	@Autowired
	EntityManagerFactory emf;
	
	public List<Complaints> getActiveTickets(){
		
		EntityManager em=emf.createEntityManager();
		Query qry=em.createQuery("select c from complaints where c.status='RAISED'");
	    List<Complaints> listOfComplaints=qry.getResultList();
		return listOfComplaints;
	}
	
	

}
