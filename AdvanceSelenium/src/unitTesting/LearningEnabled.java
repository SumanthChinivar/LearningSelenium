package unitTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningEnabled {

	@Test(enabled = true)
	public void launchInstagram()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}
	
	@Test(enabled = false)
	public void launchYouTube()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.quit();
	}
}
