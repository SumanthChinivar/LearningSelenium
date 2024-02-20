package unitTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningPriorityClass2 {
	@Test(priority = 2)
	public void launchGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
	}
}

class LearningPriorityClass3 extends LearningPriorityClass2
{
	@Test(priority = 1)
	public void launchFaceBook()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
}