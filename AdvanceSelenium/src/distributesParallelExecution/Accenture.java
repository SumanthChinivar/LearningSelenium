package distributesParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Accenture {
	@Test
	public void launchAccenture() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.accenture.com/");
		driver.quit();
	}
}
