package org.xml.pojo;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute; 
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

	 public  class XEmployees {
		
	    private Employee[] employee;

	   
	  

	    public Employee[] getEmployee() {
	        return employee;
	    }

	    public void setEmployee(Employee[] employee) {
	        this.employee = employee;
	    }

	    
	    


	public static class Employee {
	    @JacksonXmlProperty(localName = "EmpId", isAttribute = true)
	    private int EmpId;
	    @JacksonXmlProperty(localName = "Name")
	    private String Name;
	    @JacksonXmlProperty(localName = "Notes")
	    private String Notes;
	   

	    


	    public void setEmpId(int EmpId) {
	        this.EmpId = EmpId;
	    }
	    public int getEmpId() {
	        return EmpId;
	    }
	    public String getName() {
	        return Name;
	    }@JsonProperty("Employee")
	    public void setName(String Name) {
	        this.Name = Name;
	    }
	    public String getNotes() {
	        return Notes;
	    }
	    public void setNotes(String Notes) {
	        this.Notes = Notes;
	    }
		@Override
		public String toString() {
			return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Notes=" + Notes + "]";
		}
	    
	
}


	@Override
	public String toString() {
		 return "Employees{" +
	                "employees=" + Arrays.toString(employee) +
	                '}';
	}
	
}

