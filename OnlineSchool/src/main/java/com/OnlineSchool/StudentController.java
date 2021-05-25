package com.OnlineSchool;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class StudentController {
	@Autowired
	private StudentDAO studentDAO;
    @RequestMapping(value = "/home",method={ RequestMethod.GET, RequestMethod.POST })
    public String saveStudent(@ModelAttribute("student") Student student,Model model)
    {
   System.out.println(student.getEmail());
   System.out.println(student.getEmail().equalsIgnoreCase("Usama@gmail.com"));
   System.out.println(student.getPassword().equalsIgnoreCase("id38s786"));
    	if(student.getPassword().equals("id38s786") && student.getEmail().equalsIgnoreCase("Usama@gmail.com")) 
    	{
    		Admin object = Admin.getInstance();
    		object.setBttnAddNewStudent("<a href=\"/student\">Add Nursery Students</a>");
    		object.setstudentClass("<a href=\"/student\">Manage Students</a>");
    		System.out.println("inside admin");
    		model.addAttribute("home", student);
    		model.addAttribute("admin", object);
            System.out.println("inside catch");
            studentDAO.saveStudent(student);
            return "home";
    	}
    	else {
    	model.addAttribute("home", student);
    	Admin object = Admin.getInstance();
		object.setstudentClass("<a href=\"/students\">View Students</a>");
		object.setBttnAddNewStudent("<a>Manage Students</a>");
		model.addAttribute("admin", object);
    	System.out.println("inside student");
            System.out.println("inside catch");
            studentDAO.saveStudent(student);
        return "home";
    }
    }
    

@RequestMapping(value = "/addNurseryStudents",method={ RequestMethod.GET, RequestMethod.POST })
public String manageNurseryStudents(@ModelAttribute("catogries") NurseryStudents nurserystudents,Model model)
{
	model.addAttribute("catogries", nurserystudents);
	System.out.println(nurserystudents.getId());
	Admin object = Admin.getInstance();
	object.setBttnAddNewStudent("<a href=\"/OnlineSchool/addNurseryStudents\">Add Nursery Students</a><a href=\"/OnlineSchool/addPrimaryStudents\">Add Primary Students</a>");
	object.setstudentClass("<a href=\"/students\">Manage Students</a>");
	model.addAttribute("admin", object);
	model.addAttribute("addNurseryStudents", nurserystudents);
	if(nurserystudents.getId()!=null) {
		studentDAO.insertNurseryStudents(nurserystudents);
	}
	
	return "addNurseryStudents";
}
@RequestMapping(value = "/addPrimaryStudents",method={ RequestMethod.GET, RequestMethod.POST })
public String manageNurseryStudents(@ModelAttribute("catogries") PrimaryStudents primarystudents,Model model)
{
	model.addAttribute("catogries", primarystudents);
	Admin object = Admin.getInstance();
	object.setBttnAddNewStudent("<a href=\"/OnlineSchool/addNurseryStudents\">Add Nursery Students</a><a href=\"/OnlineSchool/addPrimaryStudents\">Add Primary Students</a>");
	object.setstudentClass("<a href=\"/students\">Manage Students</a>");
	model.addAttribute("admin", object);
	model.addAttribute("addPrimaryStudents", primarystudents);
	if(primarystudents.getId()!=null) {
			studentDAO.insertPrimaryStudents(primarystudents);
		}
	return "addPrimaryStudents";
}
   
    @RequestMapping(value = "/viewStudents",method={ RequestMethod.GET, RequestMethod.POST })
	public String addStudents(@ModelAttribute("student") Student student,Model model) {
		Admin object = Admin.getInstance();
   	object.setBttnAddNewStudent("<div  class=\"getStartedBtn\"><a href=\"/OnlineSchool/manageStudents\" onClick=\"j\">Add New Student</a></div>");
	object.setstudentClass("<a href=\"/students\">Manage Students</a>");
	studentDAO.saveStudent(student);
		System.out.println("inside admin");
		
		return "viewStudents";
	}
    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editStudent(@ModelAttribute("student") Student student,@PathVariable("email") String email)
    {
        ModelAndView model = new ModelAndView("registration");
        student = studentDAO.getStudentById(email);
        List<Student> studentList = studentDAO.getAllStudents();
        model.addObject("student",student);
        model.addObject("studentList",studentList);
        return model;
    }
    
    @RequestMapping(value = "/delete/{id}")
    public ModelAndView deleteStudent(@ModelAttribute("student") Student student,@PathVariable("name") String name)
    {
    	studentDAO.deleteStudent(name);
        return new ModelAndView("redirect:/registration");
    }

    @RequestMapping(value = "/registration")
    public ModelAndView listStudents(@ModelAttribute("student") Student student)
    {
        ModelAndView model = new ModelAndView("registration");
        List<Student> studentList = studentDAO.getAllStudents();
        System.out.println(studentList);
        model.addObject("studentList", studentList);
        return model;
    }
}
