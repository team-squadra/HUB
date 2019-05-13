<%-- 
    Document   : edit
    Created on : Apr 10, 2019, 10:35:12 PM
    Author     : Hishan Kavishka
--%>

<%@page import="CRUD.Edit_values"%>
<%@page import="common.User_Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Colorlib Templates">
        <meta name="author" content="Colorlib">
        <meta name="keywords" content="Colorlib Templates">

        <!-- Title Page-->
        <title>Au Register Forms by Colorlib</title>

        <!-- Icons font CSS-->
        <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
        <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
        <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

        <!-- Main CSS-->
        <link href="css/main.css" rel="stylesheet" media="all">
        <style>
            .bg-blue {
                background-image: url('images/fff.jpg');
            }
        </style>
    </head>
    <body> 
        
        <%
            String id = (String) request.getParameter("id");
            Edit_values obj_Edit_values = new Edit_values();
            User_Bean obj_User_Bean = obj_Edit_values.get_value_of_user(id);
        %>
       <center>
            <h1>Edit Values</h1>
            <div class="page-wrapper bg-blue p-t-180 p-b-100 font-robo">
                <form action="edit_controller.jsp">

                    Event ID No :<input type="text" name="id" value="<%=id%>"><br>
                    Event Name :<input type="text" name="title" value="<%=obj_User_Bean.gettitle()%>"><br>
                    Starting Time:<input type="text" name="start_event" value="<%=obj_User_Bean.getstart_event()%>"><br>
                    Ending Time:<input type="text" name="end_event" value="<%=obj_User_Bean.getend_event()%>"><br>
                    Description<input type="text" name="description" value="<%=obj_User_Bean.getdescription()%>"><br>

                    <input type="submit" value="Edit">
                </form>
            </div>
        </center>
        




        <div class="page-wrapper bg-blue p-t-180 p-b-100 font-robo">
            <div class="wrapper wrapper--w960">
                <div class="card card-2">
                    <div class="card-heading"></div>
                    <div class="card-body">
                        <h2 class="title">Edit Your Event</h2>

                        <form action="edit_controller.jsp">

                            <div class="input-group">
                                <input class="input--style-2" type="text" name="id" value="<%=id%>">
                            </div>
                            <div class="input-group">
                                <input class="input--style-2" type="text" name="title" value="<%=obj_User_Bean.gettitle()%>">
                            </div>

                            <div class="input-group">
                                <input class="input--style-2" type="text" name="start_event" value="<%=obj_User_Bean.getstart_event()%>">
                            </div>
                            <div class="input-group">
                                <input class="input--style-2" type="text" name="end_event" value="<%=obj_User_Bean.getend_event()%>">
                            </div>

                            <div class="input-group">
                                <input class="input--style-2" type="text" placeholder="Type a Discription about the Event Here" name="description" value="<%=obj_User_Bean.getdescription()%>">
                            </div>

                            <!--     Dates     -->

                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-2 js-datepicker" type="text" placeholder="Starting Date" name="start_date">
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-2 js-datepicker" type="text" placeholder="Ending Date" name="end_date">
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>

                            <!--    End Dates   -->

                            <!--   Times   -->

                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="input--style-2">Starting Time</label>
                                        <input class="input--style-2" type="Time" placeholder="Starting Time" name="start_time">
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="input--style-2">Ending Time</label>
                                        <input class="input--style-2" type="Time" placeholder="Ending Time" name="end_time">
                                    </div>
                                </div>
                            </div>

                            <!--   End Times   -->

                            <div class="p-t-30">
                                <button class="btn btn--radius btn--green" type="submit">Edit Event</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Jquery JS-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <!-- Vendor JS-->
        <script src="vendor/select2/select2.min.js"></script>
        <script src="vendor/datepicker/moment.min.js"></script>
        <script src="vendor/datepicker/daterangepicker.js"></script>

        <!-- Main JS-->
        <script src="js/global.js"></script>
        <script src="js/global01.js"></script>



    </body>
</html>
