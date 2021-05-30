package com.OnlineSchool;
import java.util.List;


public interface StudentDAO {
	// This is the student DAO

	public void saveStudent(Student student);
    public Student getStudentById(String email);
    public void updateStudent(Student student);
    public void deleteStudent(String email);
    public List<Student> getAllStudents();
	void insertNurseryStudents(NurseryStudents nurserystudents);
	void insertPrimaryStudents(PrimaryStudents primarystudents );
    
}
