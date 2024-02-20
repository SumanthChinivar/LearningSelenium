package learningGroups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchParker {
	@Test(groups = "Smoke")
	public void launchParker() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.parker.com/");
		driver.quit();
	}

	@Test(groups="Smoke")
	public void launchImdb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		driver.quit();
	}
}
