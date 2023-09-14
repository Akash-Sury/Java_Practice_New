package Properties_File;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\Properties_File\\TestData.properties");
       
		Properties prop = new Properties();
		
		prop.load(file);
		
		System.out.println(prop.getProperty("name"));
		//System.out.println(System.getProperty("user.dir"));
	}

}
