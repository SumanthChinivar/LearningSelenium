package LearningITestListener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ListenerImplementation.class)
public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void print(ITestResult result)
	{
		if(result.isSuccess())
		Reporter.log("Success",true);
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}
