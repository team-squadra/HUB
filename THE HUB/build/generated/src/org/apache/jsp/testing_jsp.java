package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testing_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login V12</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"login/images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login/css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('login/images/home_slider3.jpg');\">\n");
      out.write("                <!--    <video autoplay muted loop id=\"myVideo\">\n");
      out.write("                        <source src=\"Videos/Background.mp4\" type=\"video/mp4\">\n");
      out.write("                    </video> -->\n");
      out.write("\n");
      out.write("                <div class=\"wrap-login100 p-t-190 p-b-30\">\n");
      out.write("                    <form action=\"gg\" method=\"post\" class=\"login100-form validate-form\">\n");
      out.write("                        <div class=\"login100-form-avatar\">\n");
      out.write("                            <img src=\"login/images/avatar-01.jpg\" alt=\"AVATAR\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <span class=\"login100-form-title p-t-20 p-b-45\">\n");
      out.write("                            Sign Up\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Username is required\">\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"Username\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                            <span class=\"symbol-input100\">\n");
      out.write("                                <i class=\"fa fa-user\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Password is required\">\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                            <span class=\"focus-input100\"></span>  \n");
      out.write("                            <span class=\"symbol-input100\">\n");
      out.write("                                <i class=\"fa fa-lock\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Password is required\">\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"repassword\" placeholder=\"Reenter Password\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                            <span class=\"symbol-input100\">\n");
      out.write("                                <i class=\"fa fa-lock\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"E-mail is required\">\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"email\" placeholder=\"E-mail\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                            <span class=\"symbol-input100\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"selection\" class=\"wrap-btn validate-input m-b-10\" data-validate = \"Organization Type is required\">\n");
      out.write("                            <button class=\"btn\" name=\"type\" value=\"University\">\n");
      out.write("                                <i class=\"fa fa-graduation-cap fa-lg\"></i><br><br>\n");
      out.write("                                Sign Up As a University\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"selection\" class=\"wrap-btn validate-input m-b-10\" data-validate = \"Organization Type is required\">\n");
      out.write("                            \n");
      out.write("                            <button class=\"btn\" name=\"type\" value=\"Industry\">\n");
      out.write("                                <i class=\"fa fa-building fa-lg\" aria-hidden=\"true\"></i><br><br>\n");
      out.write("                                Sign Up As a Industry\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                      <!--  <div class=\"container-login100-form-btn p-t-10\">\n");
      out.write("                            <button class=\"login100-form-btn\">\n");
      out.write("                                Sign up\n");
      out.write("                            </button>\n");
      out.write("                        </div>  -->\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <script src=\"login/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"login/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"login/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"login/vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"login/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
