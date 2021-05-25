package com.OnlineSchool;

public class PrimaryStudents implements Students {
	private static final long serialVersionUID = -1280037900360314186L;
	private String Id,cls,DOB,Age,AdmissionDate;
	String type="nursery";
	public void addStudents(String Id, String cls, String DOB, String Age, String AdmissionDate) {
	this.Id=Id;
	this.cls=cls;
	this.DOB=DOB;
	this.Age=Age;
	this.AdmissionDate=AdmissionDate;
	}
	 public String getId()
	    {
	        return Id;
	    }
	    public void setId(String id)
	    {
	        this.Id = id;
	    }
	    public String getCls()
	    {
	        return cls;
	    }
	    public void setCls(String cls)
	    {
	        this.cls = cls;
	    }
	    public void setDOB(String DOB)
	    {
	        this.DOB = DOB;
	    }
	    public String getDOB()
	    {
	        return DOB;
	    }
	    public void setAge(String Age)
	    {
	        this.Age = Age;
	    }
	    public String getAge()
	    {
	        return Age;
	    }
	    public void setAdmissionDate(String AdmissionDate)
	    {
	        this.AdmissionDate = AdmissionDate;
	    }
	    public String getAdmissionDate()
	    {
	        return AdmissionDate;
	    }
}
