package org.credex.xml;



import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;


import org.xml.pojo.XEmployees;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.StringUtils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadXmlToPojo {
	
	public static  XEmployees mapXmlUsingJackson() throws Exception {
		
		 ObjectMapper Mapper = new ObjectMapper();
	        //XEmployees emp = Mapper.readValue(new File("employees.xml"), XEmployees.class);
	        XEmployees emp = Mapper.readValue(StringUtils.toEncodedString(Files.readAllBytes(Paths.get("employees.xml")), StandardCharsets.UTF_8),XEmployees.class);
	        
	        return emp;
	}
}


