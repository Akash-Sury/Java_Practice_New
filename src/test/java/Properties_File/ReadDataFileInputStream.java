package Properties_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class ReadDataFileInputStream {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop =new Properties();
		FileInputStream fp = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\JAVA_PRACTICE\\src\\test\\java\\Properties_File\\TestData.properties");
	
		prop.load(fp);
		System.out.println(prop.getProperty("name"));

	}

}
