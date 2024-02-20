package crossBrowser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LearningToLaunchBrowsersByReadingBrowserName {
@Test
public void launchBrowser() throws IOException
{
	File file=new File("./TestData/Browser.properties");
	FileInputStream fis=new FileInputStream(file);

	Properties prop=new Properties();
	prop.load(fis);
	
	
	String browserName=(String)prop.get("browserName");
	
	WebDriver driver=null;
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}else if(browserName.equals("edge")) {
		driver=new EdgeDriver();
	}else if(browserName.equals("firefox")) {
		driver=new FirefoxDriver();
	}
}
}
