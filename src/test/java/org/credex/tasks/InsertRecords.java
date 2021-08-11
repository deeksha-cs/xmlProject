package org.credex.tasks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.credex.xml.jdbcConnection.ConnectionBuilder;
import org.xml.pojo.XEmployees;
import org.xml.pojo.XEmployees.Employee;
import org.credex.xmlActivity.InsertActivity;


public class InsertRecords {
ConnectionBuilder obj=new ConnectionBuilder();
	public boolean insertEmpRecords (XEmployees emps) throws Exception {
	Employee[] empList = emps.getEmployee();
	Connection con= obj.ConnectToDB();
		
        
		for (Employee emp : empList) {
				
		
			// create preparedStmt for insert
			PreparedStatement pstmt =con.prepareStatement("insert into emp values(?,?,?)");
			 
			//pstmt.setInt(emp.getEmpId());
			
			pstmt.setInt(1,emp.getEmpId());
            pstmt.setString(2,emp.getName());
            pstmt.setString(3,emp.getNotes());
			
            emp.getEmpId();
			emp.getName();
			emp.getNotes();
            
           pstmt.executeUpdate();
           
		}
		
		return false;
	}

}