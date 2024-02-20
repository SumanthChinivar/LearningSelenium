package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser9 {
	@Test
	@Parameters("browser")
	public void launchUber(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
//		driver.quit();
	}
}
