package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser12 {
	@Test
	@Parameters("bname")
	public void launchGoogle(@Optional("edge") String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else
			System.out.println("Enter a correct browser name");
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.quit();
	}
}
