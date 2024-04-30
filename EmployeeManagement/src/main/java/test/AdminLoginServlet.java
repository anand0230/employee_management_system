package test;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		String uN=req.getParameter("uname");
		String pW=req.getParameter("pword");
		AdminBean ab= new AdminLoginDAO().Login(uN, pW);
		
		if(ab==null) {		
			req.setAttribute("msg", "Wrong userId and PWord..<br>");
		    req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else{
			HttpSession hs=req.getSession();//creating new Session
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);								
		}
		
		
		
		
		
	}
	
	

}
