package com.telecom.complaint.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaints {
	
@Id
int tid;
@Column(name = "userid")
String userid;
@Column(name = "reason")
String reason;
@Column(name = "status")
String status;
@Column(name="eid")
String eid;
@Column(name = "pincode")
int pincode;

public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Complaints [tid=" + tid + ", userid=" + userid + ", reason=" + reason + ", status=" + status + ", eid="
			+ eid + ", pincode=" + pincode + "]";
}





}
