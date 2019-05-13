package org.apache.jsp.Calender;

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
      out.write("        <!-- Required meta tags-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("        <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("        <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("        <!-- Title Page-->\n");
      out.write("        <title>Au Register Forms by Colorlib</title>\n");
      out.write("\n");
      out.write("        <!-- Icons font CSS-->\n");
      out.write("        <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <!-- Font special for pages-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS-->\n");
      out.write("        <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <style>\n");
      out.write("            .bg-blue {\n");
      out.write("                background-image: url('images/fff.jpg');\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        \n");
      out.write("        ");

            String id = (String) request.getParameter("id");
            Edit_values obj_Edit_values = new Edit_values();
            User_Bean obj_User_Bean = obj_Edit_values.get_value_of_user(id);
        
      out.write("\n");
      out.write("       <center>\n");
      out.write("            <h1>Edit Values</h1>\n");
      out.write("            <div class=\"page-wrapper bg-blue p-t-180 p-b-100 font-robo\">\n");
      out.write("                <form action=\"edit_controller.jsp\">\n");
      out.write("\n");
      out.write("                    Event ID No :<input type=\"text\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"><br>\n");
      out.write("                    Event Name :<input type=\"text\" name=\"title\" value=\"");
      out.print(obj_User_Bean.gettitle());
      out.write("\"><br>\n");
      out.write("                    Starting Time:<input type=\"text\" name=\"start_event\" value=\"");
      out.print(obj_User_Bean.getstart_event());
      out.write("\"><br>\n");
      out.write("                    Ending Time:<input type=\"text\" name=\"end_event\" value=\"");
      out.print(obj_User_Bean.getend_event());
      out.write("\"><br>\n");
      out.write("                    Description<input type=\"text\" name=\"description\" value=\"");
      out.print(obj_User_Bean.getdescription());
      out.write("\"><br>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Edit\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"page-wrapper bg-blue p-t-180 p-b-100 font-robo\">\n");
      out.write("            <div class=\"wrapper wrapper--w960\">\n");
      out.write("                <div class=\"card card-2\">\n");
      out.write("                    <div class=\"card-heading\"></div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h2 class=\"title\">Edit Your Event</h2>\n");
      out.write("\n");
      out.write("                        <form action=\"edit_controller.jsp\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input--style-2\" type=\"text\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input--style-2\" type=\"text\" name=\"title\" value=\"");
      out.print(obj_User_Bean.gettitle());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input--style-2\" type=\"text\" name=\"start_event\" value=\"");
      out.print(obj_User_Bean.getstart_event());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input--style-2\" type=\"text\" name=\"end_event\" value=\"");
      out.print(obj_User_Bean.getend_event());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input--style-2\" type=\"text\" placeholder=\"Type a Discription about the Event Here\" name=\"description\" value=\"");
      out.print(obj_User_Bean.getdescription());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--     Dates     -->\n");
      out.write("\n");
      out.write("                            <div class=\"row row-space\">\n");
      out.write("                                <div class=\"col-2\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input class=\"input--style-2 js-datepicker\" type=\"text\" placeholder=\"Starting Date\" name=\"start_date\">\n");
      out.write("                                        <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-2\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input class=\"input--style-2 js-datepicker\" type=\"text\" placeholder=\"Ending Date\" name=\"end_date\">\n");
      out.write("                                        <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--    End Dates   -->\n");
      out.write("\n");
      out.write("                            <!--   Times   -->\n");
      out.write("\n");
      out.write("                            <div class=\"row row-space\">\n");
      out.write("                                <div class=\"col-2\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <label class=\"input--style-2\">Starting Time</label>\n");
      out.write("                                        <input class=\"input--style-2\" type=\"Time\" placeholder=\"Starting Time\" name=\"start_time\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-2\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <label class=\"input--style-2\">Ending Time</label>\n");
      out.write("                                        <input class=\"input--style-2\" type=\"Time\" placeholder=\"Ending Time\" name=\"end_time\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--   End Times   -->\n");
      out.write("\n");
      out.write("                            <div class=\"p-t-30\">\n");
      out.write("                                <button class=\"btn btn--radius btn--green\" type=\"submit\">Edit Event</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Jquery JS-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Vendor JS-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <script src=\"vendor/datepicker/moment.min.js\"></script>\n");
      out.write("        <script src=\"vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Main JS-->\n");
      out.write("        <script src=\"js/global.js\"></script>\n");
      out.write("        <script src=\"js/global01.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
