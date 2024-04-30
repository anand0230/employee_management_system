package test;
import java.sql.*;

public class EmployeeLoginDAO {
	public EmployeeBean eb=null;
	public EmployeeBean details(String eid) {
		try {
			Connection con=DBConnection.getCon();
			   PreparedStatement ps=con.prepareStatement("Select * from employee60 where eid=?");
			   ps.setString(1, eid);
			   ResultSet rs=ps.executeQuery();
			 if(rs.next()) {
				 eb=new EmployeeBean();
				 eb.seteId(rs.getString(1));
				 eb.seteName(rs.getString(2));
				 eb.seteDesg(rs.getString(3));
				 eb.setbSal(rs.getInt(4));
				 eb.setHra(rs.getFloat(5));
				 eb.setDa(rs.getFloat(6));
				 eb.setTotsal(rs.getFloat(7));
				 
				 
			 }
			
		}catch(Exception e){
			
		}
		return eb;
	}

}
