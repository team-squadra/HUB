package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CRUD.Edit_values;
import common.User_Bean;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = (String) request.getParameter("id");
            Edit_values obj_Edit_values = new Edit_values();
            User_Bean obj_User_Bean = obj_Edit_values.get_value_of_user(id);
        
      out.write("\n");
      out.write("        <center>\n");
      out.write("            <h1>Edit Values</h1>\n");
      out.write("            <form action=\"Calender\\edit_controller.jsp\">\n");
      out.write("                \n");
      out.write("                Sl No :<input type=\"text\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"><br>\n");
      out.write("                User Name :<input type=\"text\" name=\"title\" value=\"");
      out.print(obj_User_Bean.gettitle());
      out.write("\"><br>\n");
      out.write("                Mobile:<input type=\"text\" name=\"start_event\" value=\"");
      out.print(obj_User_Bean.getstart_event());
      out.write("\"><br>\n");
      out.write("                Email:<input type=\"text\" name=\"end_event\" value=\"");
      out.print(obj_User_Bean.getend_event());
      out.write("\"><br>\n");
      out.write("                sex<input type=\"text\" name=\"description\" value=\"");
      out.print(obj_User_Bean.getdescription());
      out.write("\"><br>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Edit\">\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
