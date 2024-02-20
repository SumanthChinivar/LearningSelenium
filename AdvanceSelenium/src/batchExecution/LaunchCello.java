package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchCello {
@Test
public void launchCello()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.celloworld.com/");
	driver.quit();
}
}
