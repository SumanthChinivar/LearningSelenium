package learningParallelExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMW {
@Test
public void launchBMW()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bmw.in/");
	driver.quit();
}
}
