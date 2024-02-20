package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB11 {
	@Test
	@Parameters("browser")
	public void launchNammaYatri(String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else
			System.out.println("Enter a correct browser name");
		driver.manage().window().maximize();
		driver.get("https://meet.google.com/");
//		driver.quit();
	}
}
