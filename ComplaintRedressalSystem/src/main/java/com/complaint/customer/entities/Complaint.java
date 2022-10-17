package com.complaint.customer.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name ="complaints_table1")
public class Complaint 
{	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int cid;//cid:Complain ID
	private int uid;//uid:customer or user id
	private String name;
	private String phone;
	private String details;
	

	

	public Complaint(String details,int uid, String name,String phone)
	{
	
		this.uid = uid;
		this.name = name;
		this.phone=phone;
		this.details = details;
	}

	public Complaint(int cid, String details, String phone)
	{
		this.cid = cid;
		this.details = details;
		this.phone = phone;
	}

	public Complaint(String details, String name)
	{
		this.details = details;
		this.name = name;
	}
	
	
	public Complaint(String details) 
	{
		this.details = details;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getcid() {
		return cid;
	}

	public void setcid(int cid) {
		this.cid = cid;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone=phone;
	}
	@Override
	public String toString() {
		return "Complaint [cid=" + cid +",id="+uid+", details="
				+ details + ", name="+name+",phone="+phone+"]";
	}

		public Complaint() {
			super();
			// TODO Auto-generated constructor stub
		}

}