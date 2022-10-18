package com.telecom.manager.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telecom.complaint.bean.Complaints;
import com.telecom.manager.bean.Manager;


@Repository
public class ManagerRepo {
	
	@Autowired
	EntityManagerFactory emf;
	
	//Get Active Tickets with Engineer not assigned
	public List<Complaints> getActiveTickets(Manager m){
		
		EntityManager em=emf.createEntityManager();
		int pincode=m.getPincode();
		System.out.println("pincode="+pincode);
		Query qry=em.createQuery("select c from complaints c where c.status='RAISED' and c.pincode=:pincode and c.eid is null ");
		qry.setParameter("pincode",pincode);
	    List<Complaints> listOfComplaints=qry.getResultList();
	    System.out.println(listOfComplaints);
		return listOfComplaints;
		
	}
	
	
	//Get Assigned Tickets with engineer gets assigned 
	public List<Complaints> getAssignedTickets(Manager m){
		EntityManager em=emf.createEntityManager();
		int pincode=m.getPincode();
		System.out.println("pincode="+pincode);
		Query qry=em.createQuery("select c from complaints c where c.eid is not null and c.pincode=:pincode");
		qry.setParameter("pincode",pincode);
	    List<Complaints> listOfAssignedComplaints=qry.getResultList();
		return listOfAssignedComplaints;
	}
	
	//Assign Tickets to Engineer 
	public int assignTicketToEngineer(Complaints c) {
     
//		EntityManager em=emf.createEntityManager();
//		int empid=c.getEid();
//		int ticketid=c.getTid();
//		Query qry=e.createQuery("update complaint c set c.eid=:empid where c.tid=:ticketid");
//		qry.setParameter("empid",empid);
//		qry.setParameter("ticketid",tid);
 	      System.out.println("Recieved at DAo Layer");
		  EntityManager manager=emf.createEntityManager();
		  Complaints ct=manager.find(Complaints.class, c.getTid());
		  EntityTransaction tran=manager.getTransaction();
		  System.out.println("Recieved at DAo Layer 2");
		  if(ct==null)
		  {
			  System.out.println("retuened 0");
		    return 0;
		    
		  }
		  else
		  {
		    ct.setEid(c.getEid());;
		    tran.begin();
		    manager.merge(ct);
		    tran.commit();
		    return 1;
		  }
	
	}
	
	
	

}
