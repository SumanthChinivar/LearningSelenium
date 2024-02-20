package learningGroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bus {

	@Test(groups = "Bus")
	public void bus()
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.buses.tatamotors.com/");
			driver.quit();
	}
}
