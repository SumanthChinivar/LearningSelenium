import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RollsRoyce {
	@Test
	public void launchRollsRoyce() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/");
		driver.quit();
	}
}
