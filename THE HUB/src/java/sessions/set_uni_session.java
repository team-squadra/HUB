
package sessions;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "set_uni_session", urlPatterns = {"/set_uni_session"})
public class set_uni_session extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String uniname = request.getParameter("uniname");
            HttpSession session_uniname = request.getSession();
            session_uniname.setAttribute("uniname", uniname);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>session</title>");            
            out.println("</head>");
            out.println("<body>");
             out.println("<script type=\"text/javascript\">");
                 out.println("location='Univercity/index.jsp';");
                out.println("</script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        
        out.println("<script type=\"text/javascript\">");
                out.println("location='Homepage/index.jsp';");
                out.println("</script>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        
        String uniname = request.getParameter("uniname");
        out.println("<script type=\"text/javascript\">");
                out.println("location='Homepage/index.jsp';");
                out.println("</script>");
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
