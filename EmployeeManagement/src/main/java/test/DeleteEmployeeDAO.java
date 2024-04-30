package test;
import java.sql.*;

public class DeleteEmployeeDAO {
	
	public int k=0;
	public int delete(EmployeeBean eb) {
	    try {
	    	Connection con=DBConnection.getCon();
	    	PreparedStatement ps=con.prepareStatement("delete from employee60 where eid=?");
	    	ps.setString(1, eb.geteId());
	    	k=ps.executeUpdate();
	    	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	
		return k;
	}
	

}
