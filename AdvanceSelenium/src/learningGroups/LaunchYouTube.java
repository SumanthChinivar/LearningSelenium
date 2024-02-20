package learningGroups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchYouTube {
	@Test(groups = "System")
	public void launchYouTube() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.quit();
	}
}
