<%-- 
    Document   : insert_values
    Created on : Apr 10, 2019, 10:34:16 PM
    Author     : Hishan Kavishka
--%>

<%@page import="java.util.Iterator"%>
<%@page import="common.User_Bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.Read_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Edit calender</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="Table/images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Table/vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Table/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Table/vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Table/vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Table/vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Table/css/util.css">
        <link rel="stylesheet" type="text/css" href="Table/css/main.css">
        <!--===============================================================================================-->
         <!--header css-->
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="../Homepage/css/styles-merged.css">
    <link rel="stylesheet" href="../Homepage/css/style.min.css">
    <link rel="stylesheet" href="../Homepage/css/custom.css">

    <!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.min.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->

    <style>
    #home_name{
        font-size: 40px;
        font-weight: bold;
        padding: 10px;
      }
      </style>

    </head>
    <body>

 <div>
      <!--header-->
<div class="probootstrap-search" id="probootstrap-search" >
      <a href="#" class="probootstrap-close js-probootstrap-close"><i class="icon-cross"></i></a>
      <form action="#">
        <input type="search" name="s" id="search" placeholder="Search a keyword and hit enter...">
      </form>
    </div>
    
    <div class="probootstrap-page-wrapper">
      <!-- Fixed navbar -->
      
      <div class="probootstrap-header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-9 col-md-9 col-sm-9 probootstrap-top-quick-contact-info" >
              <span><i class="icon-location2"></i>Next Generation Colloboration</span>
              <span><i class="icon-phone2"></i>+1-123-456-7890</span>
              <span><i class="icon-mail"></i>info@thehub.com</span>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3 probootstrap-top-social" >
              <ul>
                <li><a href="#"><i class="icon-twitter"></i></a></li>
                <li><a href="#"><i class="icon-facebook2"></i></a></li>
                <li><a href="#"><i class="icon-instagram2"></i></a></li>
                <li><a href="#"><i class="icon-youtube"></i></a></li>
                <li><a href="#" class="probootstrap-search-icon js-probootstrap-search"><i class="icon-search"></i></a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <nav class="navbar navbar-default probootstrap-navbar">
        <div class="container">
          <div class="navbar-header">
            <div class="btn-more js-btn-more visible-xs">
              <a href="#"><i class="icon-dots-three-vertical "></i></a>
            </div>
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <br>
            <a id="home_name" class="probootstrap-heading probootstrap-animate" href="index.jsp" title="HOME PAGE">THE HUB</a>
          </div>

          <div id="navbar-collapse" class="navbar-collapse collapse" >
            <ul class="nav navbar-nav navbar-right">

              <li><a href="..\Homepage\index.jsp">Home</a></li>
              <li><a href="..\Homepage\industry.jsp">Industry</a></li>
              <li ><a href="..\Homepage\university.jsp">University</a></li>
              <li><a href="..\Homepage\students.jsp">Students</a></li>
              
              <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle">More Pages</a>
                <ul class="dropdown-menu">
                <li class="dropdown-submenu dropdown">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle"><span>Academic calenders</span></a>
                    <ul class="dropdown-menu">

                      <li><a href="http://localhost/calender/index.php">View Calender</a></li>
                      <li><a href="..\Calender\Cal_edit_delete.jsp">Edit Or Delete Events</a></li>
                      <li><a href="#">Second Level Menu</a></li>

                    </ul>
                  </li>
                  <li><a href="courses.html">Courses</a></li>
                  <li><a href="..\Homepage\course-single.html">Course Single</a></li>
                  <li><a href="..\Homepage\gallery.html">Gallery</a></li>
                  <li><a href="Homepage\news.html">News</a></li>
                  <li><a href="Homepage\about.html">About Us</a></li>
                </ul>
              </li>
              <li><a href="../signin.jsp">Login</a></li>
            </ul>
          </div>
        </div>
      </nav>
      <div>
      <!--header end-->
       
        <div class="limiter" >
            <div class="container-table100" style="background-color:red;">
                <div class="wrap-table100">
                    <%
                        Read_Values obj_Read_Values = new Read_Values();
                        List<User_Bean> list = obj_Read_Values.get_values();
                        Iterator<User_Bean> it_list = list.iterator();
                    %>
                    <div class="table">

                        <div class="row header">
                            <div class="cell">
                                Event Title
                            </div>
                            <div class="cell">
                                Start
                            </div>
                            <div class="cell">
                                END
                            </div>
                            <div class="cell">
                                Description
                            </div>
                            <div class="cell">
                                Action
                            </div>
                        </div>

                        <%
                            while (it_list.hasNext()) {
                                User_Bean obj_User_Bean = new User_Bean();
                                obj_User_Bean = it_list.next();
                        %>

                        <div class="row">
                            <div class="cell" data-title="Full Name">
                                <%=obj_User_Bean.gettitle()%>
                            </div>
                            <div class="cell" data-title="Age">
                                <%=obj_User_Bean.getstart_event()%>
                            </div>
                            <div class="cell" data-title="Job Title">
                                <%=obj_User_Bean.getend_event()%>
                            </div>
                            <div class="cell" data-title="Location">
                                <%=obj_User_Bean.getdescription()%>
                            </div>
                            <div class="cell" data-title="Location">
                                <center>
                                    <a href="edit.jsp?id=<%=obj_User_Bean.getid()%>">Edit</a> <br>
                                    <a href="delete_controller.jsp?id=<%=obj_User_Bean.getid()%>">Delete</a>
                                </center>
                            </div>

                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>




        <!--===============================================================================================-->	
        <script src="Table/vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="Table/vendor/bootstrap/js/popper.js"></script>
        <script src="Table/vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="Table/vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="Table/js/main.js"></script>

        <!-- END wrapper -->
    

    <script src="../Homepage/js/scripts.min.js"></script>
    <script src="../Homepage/js/main.min.js"></script>
    <script src="../Homepage/js/custom.js"></script>

    </body>
</html>
