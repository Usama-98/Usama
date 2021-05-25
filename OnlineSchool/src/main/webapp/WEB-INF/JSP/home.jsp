<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home School</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<style>
.header{
transition: all 0.5s;
  z-index: 997;
  display: flex!important;
  align-items: center;
  justify-content: space-between;
  padding-top: 0px;
}
.head{
  width: 100%;
  transition: all 0.5s;
  z-index: 997;
  padding: 15px 20px!important;
  display: flex!important;
  align-items: center;
  justify-content: space-between;
  background: rgba(21, 34, 43, 0.85);
}
.header .logo {
  font-size: 32px;
  margin: 0;
  padding: 0;
  line-height: 1;
  font-weight: 700;
  letter-spacing: 2px;
  text-decoration: none;
  margin-left: 15px;
  }
  .header .logo a {
  color: #fff;
  text-decoration: none;
}
.navMenu{
display:flex;
}
  .navMenu ul {
  margin: 0;
  padding: 0;
  list-style: none;
}
.navMenu>ul {
  display: flex;
}
.navMenu>ul>li {
  position: relative;
  white-space: nowrap;
  padding: 0px 12px;
  display:flex;
  align-items:center;
}
.navMenu>ul>li>a{
padding:0px;
display:flex;
align-items:center;
height:fit-content;

}
.navMenu>ul>li>a:before {
  content: "";
  position: absolute;
  width: 100%;
  height: 2px;
  bottom: -6px;
  left: 0;
  background-color: #ff4a17;
  visibility: hidden;
  width: 0px;
  transition: all 0.3s ease-in-out 0s;
}
 .navMenu a {
  display: Blue;
  position: relative;
  color: rgba(255, 255, 255, 0.9);
  transition: 0.3s;
  font-size: 14px;
  font-family: "Open Sans", sans-serif;
  text-transform: uppercase;
  font-weight: 600;
  padding: 0 3px;
  text-decoration:none;
}

.navMenu a:hover:before,
.navMenu li:hover>a:before,
.navMenu .active>a:before {
  visibility: visible;
  width: 100%;
}
.navMenu .dropDown ul {
  display: Blue;
  position: absolute;
  left: 12px;
  top: calc(100% + 30px);
  z-index: 99;
  opacity: 0;
  visibility: hidden;
  padding: 10px 0;
  background: #fff;
  box-shadow: 0px 0px 30px rgba(127, 137, 161, 0.25);
  transition: 0.3s;
}
.navMenu .dropDown:hover>ul {
  opacity: 1;
  top: 100%;
  visibility: visible;
}
.navMenu a:hover,
.navMenu .active>a,
.navMenu li:hover>a {
  color: #fff;
}
.navMenu .dropDown ul a:hover,
.navMenu .dropDown ul .active>a,
.navMenu .dropDown ul li:hover>a {
  color: #ff4a17;
}
.navMenu .dropDown>a:after {
  content: "\ea99";
  font-family: IcoFont;
  padding-left: 5px;
}
.navMenu .dropDown .dropDown ul {
  top: 0;
  left: calc(100% - 30px);
}
.navMenu .dropDown .dropDown:hover>ul {
  opacity: 1;
  top: 0;
  left: 100%;
}
.navMenu .dropDown .dropDown>a {
  padding-right: 35px;
}
.navMenu .dropDown .dropDown>a:after {
  content: "\eaa0";
  font-family: IcoFont;
  position: absolute;
  right: 15px;
}
.navMenu D:hover>ul {
  opacity: 1;
  top: 100%;
  visibility: visible;
}
.navMenu .dropDown li {
  min-width: 180px;
  position: relative;
}

.navMenu .dropDown ul a {
  padding: 10px 20px;
  font-size: 14px;
  font-weight: 500;
  text-transform: none;
  color: #15222b;
}

.navMenu>ul>li>a{
padding:0px;
display:flex;
align-items:center;
height:fit-content;
}
</style>
<body>
<div class="header">
    <div class="head">
        <h1 class="logo"><a href="/home">Spring School</a></h1>
        <div class="navMenu">
            <ul>
                <li class="active"><a href="/OnlineSchool/viewStudents.html">View Students</a></li>
                
                <li>
                ${admin.bttnAddNewStudent}</li>
            </ul>
            <a href="/OnlineSchool/registration" onClick="j">LOG OUT</a>
            </div>
            </div>
            </div>
            <div class="box">
<h1 style="text-align:center;font-size:45px;margin-bottom:40px">Welcome To SpringSchool ${home.name}</h1>

<div style="display:flex;justify-content:space-between;flex-wrap:no-wrap;">
<span style="text-align:center;font-size:30px">Email</span>
<span style="text-align:center;font-size:30px">${home.email}</span>
</div>
</div>

</body>
