package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser7 {
	@Test
	@Parameters("browser")
	public void launchUber(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else
			System.out.println("Enter a correct browser name");		driver.manage().window().maximize();
		driver.get("https://www.uber.com/");
//		driver.quit();
	}
}
