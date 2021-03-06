package com.OnlineSchool;



public class Student {
	private static final long serialVersionUID = -1280037900360314186L;

    private String name;
    private String email;
    private String password;
    
    public Student() {
    	super();
    }
    
    public Student(String name,String email,String password) {
    	 super();
         this.name = name;
         this.email = email;
         this.password = password;
    }
  

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null)
        {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null)
        {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (password == null)
        {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }
    
    public String toString() {
    	return "Student [name=" + name + ", email=" + email + ", password=" + password + "]";
    }
}
