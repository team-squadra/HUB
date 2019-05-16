package org.apache.jsp.Calender;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import common.User_Bean;
import java.util.List;
import CRUD.Read_Values;

public final class Cal_005fedit_005fdelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Table/images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Table/css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-table100\">\n");
      out.write("                <div class=\"wrap-table100\">\n");
      out.write("                    ");

                        Read_Values obj_Read_Values = new Read_Values();
                        List<User_Bean> list = obj_Read_Values.get_values();
                        Iterator<User_Bean> it_list = list.iterator();
                    
      out.write("\n");
      out.write("                    <div class=\"table\">\n");
      out.write("\n");
      out.write("                        <div class=\"row header\">\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                Event Title\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                Start\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                END\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                Description\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                Action\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            while (it_list.hasNext()) {
                                User_Bean obj_User_Bean = new User_Bean();
                                obj_User_Bean = it_list.next();
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"cell\" data-title=\"Full Name\">\n");
      out.write("                                ");
      out.print(obj_User_Bean.gettitle());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Age\">\n");
      out.write("                                ");
      out.print(obj_User_Bean.getstart_event());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Job Title\">\n");
      out.write("                                ");
      out.print(obj_User_Bean.getend_event());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Location\">\n");
      out.write("                                ");
      out.print(obj_User_Bean.getdescription());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Location\">\n");
      out.write("                                <center>\n");
      out.write("                                    <a href=\"edit.jsp?id=");
      out.print(obj_User_Bean.getid());
      out.write("\">Edit</a> <br>\n");
      out.write("                                    <a href=\"delete_controller.jsp?id=");
      out.print(obj_User_Bean.getid());
      out.write("\">Delete</a>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <script src=\"Table/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Table/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"Table/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Table/vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Table/js/main.js\"></script>\n");
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
