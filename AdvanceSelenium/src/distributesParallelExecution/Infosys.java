package distributesParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Infosys {
	@Test
	public void launchInfosys() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.infosys.com/");
		driver.quit();
	}
}
