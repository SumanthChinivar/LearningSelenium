package learningGroups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchMeesho {
	@Test(groups = "Integration", dependsOnGroups = "Functional")
	public void launchMeesho()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.quit();
	}
}
