package org.apache.jsp.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("\t<title>Student Registration</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"Student/images/icons/favicon.ico\"/>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/vendor/animate/animate.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"sStudent/vendor/select2/select2.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Student/css/main.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-contact100\">\r\n");
      out.write("\t\t<div class=\"wrap-contact100\">\r\n");
      out.write("\t\t\t<form action=\"../Student_reg\" class=\"contact100-form validate-form\" method=\"post\">\r\n");
      out.write("                            \r\n");
      out.write("\t\t\t\t<span class=\"contact100-form-title\">\r\n");
      out.write("\t\t\t\t\tGet your admission from here!\r\n");
      out.write("\t\t\t\t</span>                         \r\n");
      out.write("                                \r\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"first-name\">Tell us your name *</label>\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 rs1-wrap-input100 validate-input\" data-validate=\"Type first name\">\r\n");
      out.write("\t\t\t\t\t<input id=\"first-name\" class=\"input100\" type=\"text\" name=\"first_name\" placeholder=\"First name\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 rs2-wrap-input100 validate-input\" data-validate=\"Type last name\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"last_name\" placeholder=\"Last name\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"email\">Enter your email *</label>\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\r\n");
      out.write("\t\t\t\t\t<input id=\"email\" class=\"input100\" type=\"text\" name=\"email\" placeholder=\"Eg. example@email.com\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"phone\">Enter phone number</label>\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid phone number is required: ex. +94 12 345 6789\">\r\n");
      out.write("\t\t\t\t\t<input id=\"phone\" class=\"input100\" type=\"text\" name=\"phone\" placeholder=\"Eg. +94 12 345 6789\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"phone\">Enter you're university and faculty</label>\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid university and faculty is required: ex. ABC university, computing faculty\">\r\n");
      out.write("\t\t\t\t\t<input id=\"university and faculty\" class=\"input100\" type=\"text\" name=\"faculty\" placeholder=\"Eg. ABC university, computing faculty\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"Age\">Age *</label>\r\n");
      out.write("\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid Age is required: ex. 18 years and above\">\r\n");
      out.write("\t\t\t\t\t<input id=\"Age\" class=\"input100\" type=\"text\" name=\"Age\" placeholder=\"Eg. 18 years and above\">\r\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container-contact100-form-btn\">\r\n");
      out.write("\t\t\t\t\t<button class=\"contact100-form-btn\">\r\n");
      out.write("\t\t\t\t\t\tSubmit\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"contact100-more flex-col-c-m\" style=\"background-image: url('Student/images/bg-01.jpg');\">\r\n");
      out.write("\t\t\t\t<div class=\"flex-w size1 p-b-47\">\r\n");
      out.write("\t\t\t\t\t<div class=\"txt1 p-r-25\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"lnr lnr-map-marker\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"flex-col size2\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1 p-b-20\">\r\n");
      out.write("\t\t\t\t\t\t\tAddress\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t309 Dampe,<br>\r\n");
      out.write("\t\t\t\t\t\t\tPitipana Rd,<br>\r\n");
      out.write("\t\t\t\t\t\t\tkottawa<br> \r\n");
      out.write("\t\t\t\t\t\t\tSri Lanka.\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"dis-flex size1 p-b-47\">\r\n");
      out.write("\t\t\t\t\t<div class=\"txt1 p-r-25\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"lnr lnr-phone-handset\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"flex-col size2\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1 p-b-20\">\r\n");
      out.write("\t\t\t\t\t\t\tLets Talk\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt3\">\r\n");
      out.write("\t\t\t\t\t\t\t011 5 446 005,<br>\r\n");
      out.write("\t\t\t\t\t\t\t+94 76 216 2374 (Sudesh Fernandez)\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"dis-flex size1 p-b-47\">\r\n");
      out.write("\t\t\t\t\t<div class=\"txt1 p-r-25\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"lnr lnr-envelope\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"flex-col size2\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1 p-b-20\">\r\n");
      out.write("\t\t\t\t\t\t\tGeneral Support\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt3\">\r\n");
      out.write("\t\t\t\t\t\t\tsudeshfernandez98@gmail.com\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\r\n");
      out.write("\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/vendor/animsition/js/animsition.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"Student/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/vendor/select2/select2.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(\".selection-2\").select2({\r\n");
      out.write("\t\t\tminimumResultsForSearch: 20,\r\n");
      out.write("\t\t\tdropdownParent: $('#dropDownSelect1')\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/vendor/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("\t<script src=\"Student/vendor/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/vendor/countdowntime/countdowntime.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"Student/js/main.js\"></script>\r\n");
      out.write("\t<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("\t<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t  window.dataLayer = window.dataLayer || [];\r\n");
      out.write("\t  function gtag(){dataLayer.push(arguments);}\r\n");
      out.write("\t  gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("\t  gtag('config', 'UA-23581568-13');\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
