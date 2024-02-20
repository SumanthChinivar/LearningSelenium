package unitTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningInvocationCount {
	@Test(invocationCount = 5)
	public void launchGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
	@Test(invocationCount = -2)
	public void launchFacebook()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
}
