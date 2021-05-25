package com.OnlineSchool;


public class StudentsData {
	public Students storeStudent(String studentType){
		 if(studentType == null){
		 return null; }
		 if(studentType.equalsIgnoreCase("Nursery")){
		 return new NurseryStudents();
		 } else if(studentType.equalsIgnoreCase("Primary")){
		 return new PrimaryStudents();
		 }
		 return null; }
}
