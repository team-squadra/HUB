<%-- 
    Document   : edit_controller
    Created on : Apr 10, 2019, 10:38:20 PM
    Author     : Hishan Kavishka
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@page import="CRUD.Edit_values"%>
<%@page import="common.User_Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            String title = request.getParameter("title");

            String start_date = request.getParameter("start_date");
            String end_date = request.getParameter("end_date");
            String start_time = request.getParameter("start_time");
            String end_time = request.getParameter("end_time");

            Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(start_date);
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            start_date = formatter.format(date.getTime());

            Date date1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(end_date);
            DateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            end_date = formatter1.format(date1.getTime());
            
            String start_event = start_date +" "+ start_time;
            String end_event = end_date +" "+ end_time;
   
            String description = request.getParameter("description");

            User_Bean obj_User_Bean = new User_Bean();

            obj_User_Bean.setid(id);
            obj_User_Bean.settitle(title);
            obj_User_Bean.setstart_event(start_event);
            obj_User_Bean.setend_event(end_event);
            obj_User_Bean.setdescription(description);

            Edit_values obj_Edit_values = new Edit_values();
            obj_Edit_values.edit_user(obj_User_Bean);
        %>
        <script type="text/javascript">
            window.location.href = "http://localhost/calender/index.php"
        </script>
    </body>
</html>