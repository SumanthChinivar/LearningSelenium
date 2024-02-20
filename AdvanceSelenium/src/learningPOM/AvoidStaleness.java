package learningPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AvoidStaleness {
	@Test
	public void serachInDWS() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("Mobile");

		driver.navigate().refresh();
		
		search=driver.findElement(By.name("q"));
		search.sendKeys("SmartPhone");
	}
}
