package org.apache.jsp.Calender;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;
import CRUD.Edit_values;
import common.User_Bean;

public final class edit_005fcontroller_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

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
        
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.location.href = \"http://localhost/calender/index.php\"\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
