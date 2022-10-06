package com.dumping.demo.entity;

import java.text.ParseException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Associate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int a_id;
	private int associate_id;
	private String name;
	private String sid;
	private String project_id;
	private String grade_description;
	private String onoff;
	
	public void setProperty(String property, String data) throws ParseException
    {
        switch (property)
        {
            case "Associate ID" :
                this.setAssociate_id(Integer.parseInt(data));
                break;
            case "Associate Name" :
                this.setName(data);
                break;
            case "SID" :
                this.setSid(data);
                break;
            case "Project ID":
                this.setProject_id(data);
                break;
            case "Grade Description":
                this.setGrade_description(data);
                break;
            case "On/Off":
                this.setOnoff(data);
            	break;
            
            	
          
            
        }
    }
	
	
	
	public int getAssociate_id() {
		return associate_id;
	}
	public void setAssociate_id(int associate_id) {
		this.associate_id = associate_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getGrade_description() {
		return grade_description;
	}
	public void setGrade_description(String grade_description) {
		this.grade_description = grade_description;
	}
	public String getOnoff() {
		return onoff;
	}
	public void setOnoff(String onoff) {
		this.onoff = onoff;
	}
	public Associate(int a_id,int associate_id, String name, String sid, String project_id, String grade_description,
			String onoff) {
		super();
		this.a_id = a_id;
		this.associate_id = associate_id;
		this.name = name;
		this.sid = sid;
		this.project_id = project_id;
		this.grade_description = grade_description;
		this.onoff = onoff;
	}
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Associate [associate_id=" + associate_id + ", name=" + name + ", sid=" + sid + ", project_id="
				+ project_id + ", grade_description=" + grade_description + ", onoff=" + onoff + "]";
	}
	
	
	
	
	
	

}
