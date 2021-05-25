package com.OnlineSchool;



public class Admin {
	private static Admin instance = new Admin();
	private String bttnAddNewStudent;
    private String studentClass;
	 private Admin(){}
	
	 public static Admin getInstance(){
	 return instance;
	 }
	 public String getBttnAddNewStudent()
	    {
	        return bttnAddNewStudent;
	    }
	    public void setBttnAddNewStudent(String bttn)
	    {
	        this.bttnAddNewStudent = bttn;
	    }
	    public String getStudentClass()
	    {
	        return studentClass;
	    }
	    public void setstudentClass(String bttn)
	    {
	        this.studentClass = bttn;
	    }
}
