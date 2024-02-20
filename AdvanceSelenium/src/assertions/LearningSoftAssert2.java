package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert2 {
	@Test
	public void login() {
		String url = "https://demowebshop.tricentis.com/";
		String username="komalgupta121@gmail.com";
		String pwd="Shakuni123.@";
		
		// browser set up
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		SoftAssert softAssert = new SoftAssert();

		// launching application
		driver.get(url);
		softAssert.assertEquals(driver.getCurrentUrl(), url, "URL Mismatch");
		Reporter.log("DemoWebShop is launched");

		// ctrl+shift+f User login
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("User clicked on login link", true);
		boolean res1 = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
		softAssert.assertEquals(res1, true, "Login page is not launched");
		Reporter.log("Login page is displayed", true);

		driver.findElement(By.id("Email")).sendKeys(username);
		String actualUsername=driver.findElement(By.id("Email")).getAttribute("Value");
		softAssert.assertEquals(actualUsername, username,"Username mismatch");
		Reporter.log("User name is entered",true);
		
		driver.findElement(By.id("Password")).sendKeys(pwd);
		String actualPassword=driver.findElement(By.id("Password")).getAttribute("value");
		softAssert.assertEquals(actualPassword, pwd,"Password mismatch");
		Reporter.log("Password is entered",true);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		boolean res2=driver.findElement(By.linkText("Log out")).isDisplayed();
		softAssert.assertEquals(res2, true,"Login failed");
		Reporter.log("User logged in successfully",true);
		
		driver.quit();
		Reporter.log("Browser closed",true);
		softAssert.assertAll();
	}
}
