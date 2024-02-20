package film;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoToFilm {
	@Test(groups = "Film", dependsOnGroups = "cabs")
	public void goToFilm() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookmyshow.com/");
		driver.quit();
	}
}
