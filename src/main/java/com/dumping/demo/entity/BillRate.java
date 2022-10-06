package com.dumping.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BillRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bill_id;
	private int associate_id;
	private String associate_name;
	private int project_id;
	private int bill_hours;
	private int bill_rate;
	private int bill_period;
	private int net_bill_period;
	private int leave_days;
	
	 public void setProperty(String property, String data)
	    {
	        switch (property)
	        {
	        
	            
	            case "Project ID" :
	                this.setProject_id(Integer.parseInt(data));
	                break;
	            case "Billable Hours" :
	                this.setBill_hours(Integer.parseInt(data));
	                break;
	            case "BillRate":
	                this.setBill_rate(Integer.parseInt(data));
	                break;
	        }
	    }
	 
	 

	public int getAssociate_id() {
		return associate_id;
	}



	public void setAssociate_id(int associate_id) {
		this.associate_id = associate_id;
	}



	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public String getAssociate_name() {
		return associate_name;
	}

	public void setAssociate_name(String associate_name) {
		this.associate_name = associate_name;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public int getBill_hours() {
		return bill_hours;
	}

	public void setBill_hours(int bill_hours) {
		this.bill_hours = bill_hours;
	}

	public int getBill_rate() {
		return bill_rate;
	}

	public void setBill_rate(int bill_rate) {
		this.bill_rate = bill_rate;
	}

	public int getBill_period() {
		return bill_period;
	}

	public void setBill_period(int bill_period) {
		this.bill_period = bill_period;
	}

	public int getNet_bill_period() {
		return net_bill_period;
	}

	public void setNet_bill_period(int net_bill_period) {
		this.net_bill_period = net_bill_period;
	}

	public int getLeave_days() {
		return leave_days;
	}

	public void setLeave_days(int leave_days) {
		this.leave_days = leave_days;
	}

	public BillRate(int associate_id,int bill_id, String associate_name, int project_id, int bill_hours, int bill_rate, int bill_period,
			int net_bill_period, int leave_days) {
		super();
		this.associate_id = associate_id;
		this.bill_id = bill_id;
		this.associate_name = associate_name;
		this.project_id = project_id;
		this.bill_hours = bill_hours;
		this.bill_rate = bill_rate;
		this.bill_period = bill_period;
		this.net_bill_period = net_bill_period;
		this.leave_days = leave_days;
	}

	public BillRate() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "BillRate [bill_id=" + bill_id + ", associate_id=" + associate_id + ", associate_name=" + associate_name
				+ ", project_id=" + project_id + ", bill_hours=" + bill_hours + ", bill_rate=" + bill_rate
				+ ", bill_period=" + bill_period + ", net_bill_period=" + net_bill_period + ", leave_days=" + leave_days
				+ "]";
	}

	
	
	
	 
	 

	
	
	
	

}
