package com.dumping.demo.entity;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	private int project_id;
	private String project_description;
	private String project_billability;
	private String project_type;
	private String project_start_date;
	private String project_end_date;
	private String project_manager_id;
	private String project_manager_name;

	
	public void setProperty(String property, String data) throws ParseException
    {
        switch (property)
        {
            case "Project ID" :
                this.setProject_id(Integer.parseInt(data));
                break;
            case "Project Description" :
                this.setProject_description(data);
                break;
            case "Project Billability" :
                this.setProject_billability(data);
                break;
            case "Project Manager ID":
                this.setProject_manager_id(data);
                break;
            case "Project Manager Name":
                this.setProject_manager_name(data);
                break;
            case "Project Start Date":
                this.setProject_start_date(data);
            	break;
            case "Project End Date":
            	this.setProject_end_date(data);
            	break;
            	
          
            
        }
    }

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_description() {
		return project_description;
	}

	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}

	public String getProject_billability() {
		return project_billability;
	}

	public void setProject_billability(String project_billability) {
		this.project_billability = project_billability;
	}

	public String getProject_type() {
		return project_type;
	}

	public void setProject_type(String project_type) {
		this.project_type = project_type;
	}

	public String getProject_start_date() {
		return project_start_date;
	}

	public void setProject_start_date(String data) {
		this.project_start_date = data;
	}

	public String getProject_end_date() {
		return project_end_date;
	}

	public void setProject_end_date(String project_end_date) {
		this.project_end_date = project_end_date;
	}

	public String getProject_manager_id() {
		return project_manager_id;
	}

	public void setProject_manager_id(String project_manager_id) {
		this.project_manager_id = project_manager_id;
	}

	public String getProject_manager_name() {
		return project_manager_name;
	}

	public void setProject_manager_name(String project_manager_name) {
		this.project_manager_name = project_manager_name;
	}

	public Project(int p_id, int project_id, String project_description, String project_billability,
			String project_type, String project_start_date, String project_end_date, String project_manager_id,
			String project_manager_name) {
		super();
		this.p_id = p_id;
		this.project_id = project_id;
		this.project_description = project_description;
		this.project_billability = project_billability;
		this.project_type = project_type;
		this.project_start_date = project_start_date;
		this.project_end_date = project_end_date;
		this.project_manager_id = project_manager_id;
		this.project_manager_name = project_manager_name;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [p_id=" + p_id + ", project_id=" + project_id + ", project_description=" + project_description
				+ ", project_billability=" + project_billability + ", project_type=" + project_type
				+ ", project_start_date=" + project_start_date + ", project_end_date=" + project_end_date
				+ ", project_manager_id=" + project_manager_id + ", project_manager_name=" + project_manager_name + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	

}

