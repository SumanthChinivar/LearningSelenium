package learningGroups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchFlipkart {
	@Test(groups = "Functional", dependsOnGroups = "Smoke")
	public void launchFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
	
	@Test(groups="Smoke")
	public void launchIndianTourism()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tourism.gov.in/");
		driver.quit();
	}
}
