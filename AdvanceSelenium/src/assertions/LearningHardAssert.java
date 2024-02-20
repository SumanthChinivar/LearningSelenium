package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningHardAssert {
	@Test
	public void login() {
		// credentials
		String username = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";
		String url = "https://demowebshop.tricentis.com/";

		// launching the browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// opening the url
		driver.get(url);
		Reporter.log("Demowebshop is launched", true);

		// login to demowebshop
		driver.findElement(By.linkText("Log in")).click();
		boolean res1 = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
		Assert.assertEquals(res1, true);
		Reporter.log("Log in page is displayed", true);

		driver.findElement(By.id("Email")).sendKeys(username);
		String emailID = driver.findElement(By.id("Email")).getAttribute("value");
		Assert.assertEquals(emailID, username);
		Reporter.log("Email id is matching", true);

		driver.findElement(By.id("Password")).sendKeys(password);
		String enteredPassword = driver.findElement(By.id("Password")).getAttribute("value");
		Assert.assertEquals(enteredPassword, password);
		Reporter.log("Password is same", true);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text = driver.findElement(By.xpath("//a[text()='komalgupta121@gmail.com']")).getText();
		Assert.assertEquals(text, username);
		Reporter.log("Logged in successfully", true);

		// Logout and close
		driver.findElement(By.linkText("Log out")).click();
		boolean res2 = driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(res2, true);
		Reporter.log("Logged out successfully", true);

		driver.quit();
		Reporter.log("Browser closed", true);
	}
}
