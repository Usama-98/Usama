package com.OnlineSchool;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate jdbcTemplate;
    // JdbcTemplate setter
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Saving a new Employee
    public void saveStudent(Student student)
    {
        String sql = "insert into student values(?,?,?)";
        System.out.println("dao called");
        jdbcTemplate.update(sql, new Object[]
        { student.getName(), student.getEmail(), student.getPassword()});
    }

    // Getting a particular Employee
    public Student getStudentById(String email)
    {
        String sql = "select * from student where email=?";
        Student student = (Student) jdbcTemplate.queryForObject(sql, new Object[]
        { email }, new RowMapper<Student>()
        {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
            {
            	Student student = new Student();
            	student.setName(rs.getString(1));
            	student.setPassword(rs.getString(3));
            	student.setEmail(rs.getString(2));
                return student;
            }
        });
        return student;
    }

    // Getting all the Employees
    public List<Student> getAllStudents()
    {
        String sql = "select * from student";

        List<Student> studentList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>()
        {
            @Override
            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<Student> list = new ArrayList<Student>();
                while (rs.next())
                {
                	Student student = new Student();
                	 student.setName(rs.getString(1));
                	 student.setEmail(rs.getString(2));
                	 student.setPassword(rs.getString(3));
                    list.add( student);
                }
                return list;
            }

        });
        return studentList;
    }

    // Updating a particular Employee
    public void updateStudent(Student  student)
    {
        String sql = "update student set Id =?, name =?, email=?,password=? where email=?";
        jdbcTemplate.update(sql, new Object[]
        { student.getName(),  student.getEmail(), student.getPassword(),  student.getEmail()}); 
    }

    // Deletion of a particular Employee
    public void deleteStudent(String email)
    {
        String sql = "delete from student where email=?";
        jdbcTemplate.update(sql, new Object[]
        { email });
    }
    @Override
	public void insertNurseryStudents(NurseryStudents nurserystudents) {
    	StudentsData studentsdata = new StudentsData();
		 //get an object of Circle and call its draw method.
		 Students student = studentsdata.storeStudent("Nursery");
		 student.addStudents(nurserystudents.getId(), nurserystudents.getCls(), nurserystudents.getDOB(), nurserystudents.getAge(), nurserystudents.getAdmissionDate());
		
		String sql = "insert into catogries values(?,?,?,?,?)";
        System.out.println("dao called");
        jdbcTemplate.update(sql, new Object[]
        { "nursery", nurserystudents.getId(), nurserystudents.getCls(), nurserystudents.getDOB(), nurserystudents.getAge(), nurserystudents.getAdmissionDate()});
	}
	@Override
	public void insertPrimaryStudents(PrimaryStudents primarystudents) {
		StudentsData studentsdata = new StudentsData();
		 //get an object of Circle and call its draw method.
		 Students student =studentsdata.storeStudent("Primary");
		 student.addStudents(primarystudents.getId(), primarystudents.getCls(), primarystudents.getDOB(), primarystudents.getAge(), primarystudents.getAdmissionDate());
		String sql = "insert into catogries values(?,?,?,?,?)";
        System.out.println("dao called");
        jdbcTemplate.update(sql, new Object[]
        { "primary", primarystudents.getId(), primarystudents.getCls(), primarystudents.getDOB(), primarystudents.getAge(), primarystudents.getAdmissionDate()});
	}

}
