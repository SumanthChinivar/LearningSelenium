package unitTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningDependsOnMethod2 {
	@Test(dependsOnMethods = "launchMyntra")
	public void launchAmazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/	");
		driver.quit();
	}
}
