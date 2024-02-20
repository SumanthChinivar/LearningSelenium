package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginToDWS {
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
		if (driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed()) {
			Reporter.log("Login page is displayed", true);
		} else
			Reporter.log("Login page is not displayed", true);

		driver.findElement(By.id("Email")).sendKeys(username);
		String emailID=driver.findElement(By.id("Email")).getAttribute("value");
		if(emailID.equals(username)) {
			Reporter.log("Entered username is matching",true);
		}else
			Reporter.log("Entered username is not matching",true);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		String enteredPassword=driver.findElement(By.id("Password")).getAttribute("value");
		if(enteredPassword.equals(password)) {
			Reporter.log("Password is same",true);
		}else
			Reporter.log("Password is not same",true);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text=driver.findElement(By.xpath("//a[text()='komalgupta121@gmail.com']")).getText();
		if(text.equals(username)) {
			Reporter.log("User logged in successfully",true);
		}else
			Reporter.log("Login failed",true);
		
		//Logout and close
		driver.findElement(By.linkText("Log out")).click();
		if(driver.findElement(By.linkText("Register")).isDisplayed()) {
			Reporter.log("Logged out successfully",true);
		}else
			Reporter.log("Logout failed",true);
		driver.quit();
		Reporter.log("Browser closed",true);
	}
}
