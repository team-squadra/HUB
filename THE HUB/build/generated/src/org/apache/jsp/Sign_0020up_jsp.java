package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sign_0020up_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <title>Login V12</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"login/images/icons/favicon.ico\"/>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/animate/animate.css\">\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/select2/select2.min.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/css/util.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/css/main.css\">\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('login/images/home_slider3.jpg');\">\r\n");
      out.write("                <!--    <video autoplay muted loop id=\"myVideo\">\r\n");
      out.write("                        <source src=\"Videos/Background.mp4\" type=\"video/mp4\">\r\n");
      out.write("                    </video> -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"wrap-login100 p-t-190 p-b-30\">\r\n");
      out.write("                    <form action=\"signup_server\" method=\"post\" class=\"login100-form validate-form\">\r\n");
      out.write("                        <div class=\"login100-form-avatar\">\r\n");
      out.write("                            <img src=\"login/images/avatar-01.jpg\" alt=\"AVATAR\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <span class=\"login100-form-title p-t-20 p-b-45\">\r\n");
      out.write("                            Sign UP\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Username is required\">\r\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"Username\">\r\n");
      out.write("                            <span class=\"focus-input100\"></span>\r\n");
      out.write("                            <span class=\"symbol-input100\">\r\n");
      out.write("                                <i class=\"fa fa-user\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Password is required\">\r\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("                            <span class=\"focus-input100\"></span>  \r\n");
      out.write("                            <span class=\"symbol-input100\">\r\n");
      out.write("                                <i class=\"fa fa-lock\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Password is required\">\r\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"repassword\" placeholder=\"Reenter Password\">\r\n");
      out.write("                            <span class=\"focus-input100\"></span>\r\n");
      out.write("                            <span class=\"symbol-input100\">\r\n");
      out.write("                                <i class=\"fa fa-lock\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"E-mail is required\">\r\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"email\" placeholder=\"E-mail\">\r\n");
      out.write("                            <span class=\"focus-input100\"></span>\r\n");
      out.write("                            <span class=\"symbol-input100\">\r\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"selection\" class=\"wrap-btn validate-input m-b-10\" data-validate = \"Organization Type is required\">\r\n");
      out.write("                            <button class=\"btn\" name=\"type\" value=\"University\">University\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"selection\" class=\"wrap-btn validate-input m-b-10\" data-validate = \"Organization Type is required\">\r\n");
      out.write("                            \r\n");
      out.write("                            <button class=\"btn\" name=\"type\" value=\"Industry\">Industry\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"container-login100-form-btn p-t-10\">\r\n");
      out.write("                            <button class=\"login100-form-btn\">\r\n");
      out.write("                                Sign up\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("        <script src=\"login/vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"login/vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("        <script src=\"login/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"login/vendor/select2/select2.min.js\"></script>\r\n");
      out.write("        <!--===============================================================================================-->\r\n");
      out.write("        <script src=\"login/js/main.js\"></script>\r\n");
      out.write("\r\n");
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
