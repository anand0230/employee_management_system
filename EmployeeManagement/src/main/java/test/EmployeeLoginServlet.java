package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/elogin")

public class EmployeeLoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String eid=req.getParameter("eid");
		EmployeeBean eb=new EmployeeLoginDAO().details(eid);
		if(eb==null) {
         res.setContentType("text/html");	
         PrintWriter pw=res.getWriter();
         pw.println("<p style='color:red'>Wrong EmployeeId.<p> <br>");
         req.getRequestDispatcher("EmployeeLogin.html").include(req, res);
         
		}else {
			req.setAttribute("ebean", eb);
			req.getRequestDispatcher("EmployeeLogin.jsp").forward(req, res);
			
			
		}
		
	}
	
	
	

}
