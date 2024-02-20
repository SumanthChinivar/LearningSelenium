package practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetURL {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	HashMap<String,String> hs=new HashMap();
	driver.get("https://www.google.com/");
	hs.put(driver.getCurrentUrl(), driver.getTitle());
	driver.get("https://www.instagram.com/");
	hs.put(driver.getCurrentUrl(), driver.getTitle());
	driver.get("https://www.facebook.com/");
	hs.put(driver.getCurrentUrl(), driver.getTitle());
	
	//to check if title contains gram
	for(Map.Entry<String,String> val:hs.entrySet())
	{
		if(val.getValue().contains("gram"))
		{
			driver.get(val.getKey());
			break;
		}
	}
}
}
