package test;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/update")

public class UpdateEmployeeServlet extends HttpServlet  {
	
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {	
	 
	HttpSession hs=req.getSession(false);
  if(hs==null) {
	  req.setAttribute("msg", "Session Expired..<br>");
	  req.getRequestDispatcher("Msg.jsp").forward(req, res);
	  
  }else {
	  String eid=req.getParameter("eid");
	 int bS=Integer.parseInt(req.getParameter("bsal"));
	 float h=Float.parseFloat(req.getParameter("hra"));
	 float d=Float.parseFloat(req.getParameter("da"));
	 
	 float hra=(bS*h)/100;
	 float da=(bS*d)/100;
	 float totalsal=bS+hra+da;
	 ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
	 Iterator<EmployeeBean> it=al.iterator();
	 
	 while(it.hasNext()) {
		 EmployeeBean eb=(EmployeeBean)it.next();
		 if(eid.equals(eb.geteId())) {
		 eb.setbSal(bS);
		 eb.setHra(hra);
		 eb.setDa(da);
		 eb.setTotsal(totalsal);
		int k= new UpdateEmployeeDAO().update(eb);
		if(k>0) {
			req.setAttribute("msg","Employee Updated Successfully...");			
		}
		
		break;
		 }//end of first if
		 
	 }//end of loop
	 
	 req.getRequestDispatcher("UpdateEmployee.jsp").forward(req, res);
	  
  }//end of else
	
}

}
