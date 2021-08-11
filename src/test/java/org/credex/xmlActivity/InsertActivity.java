package  org.credex.xmlActivity;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import org.credex.xml.jdbcConnection.ConnectionBuilder;
import org.credex.tasks.InsertRecords;
import org.credex.xml.ReadXmlToPojo;
import org.xml.pojo.XEmployees;
public class InsertActivity {      
   public static void main(String args[]) {
      try {
    	 XEmployees emp =  ReadXmlToPojo.mapXmlUsingJackson();
    	 InsertRecords records = new InsertRecords();
    
    	 records.insertEmpRecords(emp);
    	  
    	  //System.out.println(emp.toString());
        
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}