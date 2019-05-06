/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ______KaviYa______
 */
@WebServlet(name = "Cal_insert_sevlet", urlPatterns = {"/Cal_insert_sevlet"})
public class Cal_insert_sevlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cal_insert_sevlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cal_insert_sevlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String eventname = request.getParameter("name");
            String start_date = request.getParameter("start_date");
            String end_date = request.getParameter("end_date");
            String start_time = request.getParameter("start_time");
            String end_time = request.getParameter("end_time");
            String discription = request.getParameter("discription");

            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(start_date);
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                start_date = formatter.format(date.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(end_date);
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                end_date = formatter.format(date.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            String start_event = start_date +" "+ start_time;
            String end_event = end_date +" "+ end_time;


            try {
                String sql = "insert into events (title,start_event,end_event,description) values(?,?,?,?)";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, eventname);
                ps.setString(2, start_event);
                ps.setString(3, end_event);
                ps.setString(4, discription);
                ps.executeUpdate();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('sucess!!');");
                out.println("location='index.jsp';");
                out.println("</script>");
            } catch (SQLException ex) {
                out.println(ex);
            } 

        } catch (ClassNotFoundException ex) {
            out.println(ex);
        } 

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
