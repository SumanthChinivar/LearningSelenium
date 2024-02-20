package readigDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		File file =new File("./TestData/Demo.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=(String)prop.get("url");
		System.out.println(url);
		
		String username=(String)prop.get("username");
		System.out.println(username);
		
		String password=(String)prop.getProperty("password");
		System.out.println(password);
	}
}
