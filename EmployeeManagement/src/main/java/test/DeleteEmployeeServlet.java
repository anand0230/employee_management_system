package test;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteEmployeeServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession hs=req.getSession();
	 if(hs==null){
	    req.setAttribute("msg", "Session Expired..<br>");
	    req.getRequestDispatcher("Msg.jsp").forward(req, res);
	 }else {
		 
		  String eid=req.getParameter("eid");
		  
		  ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
		  Iterator<EmployeeBean> it=al.iterator();
		  while(it.hasNext()) {
			  EmployeeBean eb=(EmployeeBean)it.next();
			  if(eid.equals(eb.geteId())) {
				  int k=new DeleteEmployeeDAO().delete(eb);
				  if(k>0) {
					  req.setAttribute("msg", "Employee Deleted...<br>");
				  }
				  break;
			  }
			  
		  }//end of loop
		  req.getRequestDispatcher("DeleteEmployee.jsp").forward(req, res);
		 
	 }//end of else
		
		
	}

}
