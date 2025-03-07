package readingpropertyfile;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingPropertiesFile {

public static void main(String[] args) throws IOException {

/*1)to read data from the property file we need to create an object for the Properties class(all these are available in Java)
 *2)next we need to read data from a file so we use the File Input Stream class
 * 
 * 3) to capture only keys from properties file
 * 
 * 4)to capture only values from properties file
 * 
 */
		//create an object of Properties class
		Properties probj =new Properties();
		
		//location of the Properties class
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestDataFolder\\config.properties");
		
		//load Properties file
		probj.load(file);
		
		//reading data from Properties file
		
		String url = probj.getProperty("appurl");
		System.out.println(url);
		
		String email =probj.getProperty("email");
		System.out.println(email);
		
		 String usn=probj.getProperty("username");
		 System.out.println(usn);
		 
		 String pw = probj.getProperty("password");
		 System.out.println(pw);
		
		
		//reading only keys from properties file 2 approaches using Set<String> Set<Object>
		 
		 //using Set<String>
	      Set<String> keys=	probj.stringPropertyNames();
	      System.out.println(keys);
		
		
		//Set<Object>
		
		Set <Object> keys1=probj.keySet();
		System.out.println(keys1);
		
		
		//to capture only values from properties file
		
		Collection <Object> value=probj.values();
		System.out.println(value);
		
		file.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
