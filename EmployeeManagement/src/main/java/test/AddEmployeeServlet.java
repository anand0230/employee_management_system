package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
	
		HttpSession hs=req.getSession(false);//accessing existing session
		if(hs==null) {
			
			req.setAttribute("msg", "Session Expired ..<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			EmployeeBean eb=new EmployeeBean();
			eb.seteId(req.getParameter("eid"));
			eb.seteName(req.getParameter("name"));
			eb.seteDesg(req.getParameter("edesg"));
			
		int bsal=Integer.parseInt(req.getParameter("bsal"));
		float h=(float)(bsal*93)/100;
		float d=(float)(bsal*61)/100;
		float totsal=bsal+h+d;
		eb.setbSal(bsal);
		eb.setHra(h);
		eb.setDa(d);
		eb.setTotsal(totsal);
		int k=new AddEmployeeDAO().insert(eb);
		if(k>0) {
			req.setAttribute("msg", "Employee added Successfully..");
			req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
			
		}
		
		
			   
			   
			
		}
		
		
		
		
		
	}
	
	

}
