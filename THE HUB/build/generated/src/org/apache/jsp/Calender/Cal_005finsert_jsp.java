package org.apache.jsp.Calender;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cal_005finsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags-->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("\r\n");
      out.write("    <!--Page Title -->\r\n");
      out.write("    <title>Add An Event</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Icons font CSS-->\r\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <!-- Font special for pages-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS-->\r\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!--header css-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Homepage/css/styles-merged.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Homepage/css/style.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Homepage/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"js/vendor/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"js/vendor/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .bg-blue {\r\n");
      out.write("          background-image: url('images/fff.jpg');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #home_name{\r\n");
      out.write("        font-size: 40px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--header-->\r\n");
      out.write("<div class=\"probootstrap-search\" id=\"probootstrap-search\">\r\n");
      out.write("      <a href=\"#\" class=\"probootstrap-close js-probootstrap-close\"><i class=\"icon-cross\"></i></a>\r\n");
      out.write("      <form action=\"#\">\r\n");
      out.write("        <input type=\"search\" name=\"s\" id=\"search\" placeholder=\"Search a keyword and hit enter...\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"probootstrap-page-wrapper\">\r\n");
      out.write("      <!-- Fixed navbar -->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"probootstrap-header-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-9 col-md-9 col-sm-9 probootstrap-top-quick-contact-info\" >\r\n");
      out.write("              <span><i class=\"icon-location2\"></i>Next Generation Colloboration</span>\r\n");
      out.write("              <span><i class=\"icon-phone2\"></i>+1-123-456-7890</span>\r\n");
      out.write("              <span><i class=\"icon-mail\"></i>info@thehub.com</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-3 col-sm-3 probootstrap-top-social\">\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icon-facebook2\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icon-instagram2\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"icon-youtube\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"probootstrap-search-icon js-probootstrap-search\"><i class=\"icon-search\"></i></a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <nav class=\"navbar navbar-default probootstrap-navbar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <div class=\"btn-more js-btn-more visible-xs\">\r\n");
      out.write("              <a href=\"#\"><i class=\"icon-dots-three-vertical \"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a id=\"home_name\" class=\"probootstrap-heading probootstrap-animate\" href=\"index.jsp\" title=\"HOME PAGE\">THE HUB</a>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div id=\"navbar-collapse\" class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("              <li><a href=\"../Homepage/index.jsp\">Home</a></li>\r\n");
      out.write("              <li><a href=\"../Homepage/industry.jsp\">Industry</a></li>\r\n");
      out.write("              <li ><a href=\"../Homepage/university.jsp\">University</a></li>\r\n");
      out.write("              <li><a href=\"../Homepage/students.jsp\">Students</a></li>\r\n");
      out.write("              \r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">More Pages</a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li class=\"dropdown-submenu dropdown\">\r\n");
      out.write("                    <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\"><span>Academic calenders</span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("                      <li><a href=\"http://localhost/calender/index.php\">View Calender</a></li>\r\n");
      out.write("                      <li><a href=\"Cal_edit_delete.jsp\">Edit Or Delete Events</a></li>\r\n");
      out.write("                      <li><a href=\"#\">Second Level Menu</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li><a href=\"courses.html\">Courses</a></li>\r\n");
      out.write("                  <li><a href=\"../Homepage/course-single.html\">Course Single</a></li>\r\n");
      out.write("                  <li><a href=\"../Homepage/gallery.html\">Gallery</a></li>\r\n");
      out.write("                  <li><a href=\"../Homepage/news.html\">News</a></li>\r\n");
      out.write("                  <li><a href=\"../Homepage/about.html\">About Us</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li><a href=\"../signin.jsp\">Login</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!--header end-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-wrapper bg-blue p-t-180 p-b-100 font-robo\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w960\">\r\n");
      out.write("            <div class=\"card card-2\">\r\n");
      out.write("                <div class=\"card-heading\"></div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h2 class=\"title\">Create An Event</h2>\r\n");
      out.write("                    \r\n");
      out.write("                    <form action=\"../Cal_insert_sevlet\" method=\"post\">\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input class=\"input--style-2\" type=\"text\" placeholder=\"Event Name\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row row-space\">\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-2 js-datepicker\" type=\"text\" placeholder=\"Starting Date\" name=\"start_date\">\r\n");
      out.write("                                    <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-2 js-datepicker\" type=\"text\" placeholder=\"Ending Date\" name=\"end_date\">\r\n");
      out.write("                                    <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row row-space\">\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <label class=\"input--style-2\">Starting Time</label>\r\n");
      out.write("                                    <input class=\"input--style-2\" type=\"Time\" placeholder=\"Starting Time\" name=\"start_time\">\r\n");
      out.write("                                  <!--  <i class=\"fa fa-clock-o input-icon01 js-btn-calendar\" aria-hidden=\"true\"></i> -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <label class=\"input--style-2\">Ending Time</label>\r\n");
      out.write("                                    <input class=\"input--style-2\" type=\"Time\" placeholder=\"Ending Time\" name=\"end_time\">\r\n");
      out.write("                                   <!-- <i class=\"fa fa-clock-o input-icon01 js-btn-calendar\" aria-hidden=\"true\"></i> -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input class=\"input--style-2\" type=\"text\" placeholder=\"Type a Discription about the Event Here\" name=\"discription\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"p-t-30\">\r\n");
      out.write("                            <button class=\"btn btn--radius btn--green\" type=\"submit\">Create Event</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Jquery JS-->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Vendor JS-->\r\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/datepicker/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/datepicker/daterangepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"js/global.js\"></script>\r\n");
      out.write("    <script src=\"js/global01.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- END wrapper -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <script src=\"../Homepagejs/scripts.min.js\"></script>\r\n");
      out.write("    <script src=\"../Homepage/js/main.min.js\"></script>\r\n");
      out.write("    <script src=\"../Homepage/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!-- end document-->\r\n");
      out.write("\r\n");
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
