<%-- 
    Document   : edit_controller
    Created on : Apr 10, 2019, 10:38:20 PM
    Author     : Hishan Kavishka
--%>

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
            String start_event = request.getParameter("start_event");
            String end_event = request.getParameter("end_event");
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