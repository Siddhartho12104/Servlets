import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet {
 	 
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     try {
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");

        if(pass.equals("pass123"))
        {
           RequestDispatcher req = request.getRequestDispatcher("Welcome");
           req.forward(request, response);
        }
        else
         {
         out.println("<b>Login failed. Kindly enter correct password</b>");
                RequestDispatcher req = request.getRequestDispatcher("form.html");
                req.include(request, response);
            }
        }finally{
        	
        }
        
    }
}