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
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
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

    </head>
    <body>
        <div class="limiter">
            <div class="container-table100">
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
    </body>
</html>
