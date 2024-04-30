package test;
import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllEmployeesServlet extends HttpServlet{
	
	protected void  doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else{
			
			ArrayList<EmployeeBean> al=new ViewAllEmployeeDAO().retrieve();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("ViewAllEmployee.jsp").forward(req , res);	
			
		}	
	}
	

}
