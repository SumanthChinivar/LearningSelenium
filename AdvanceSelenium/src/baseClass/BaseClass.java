package baseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;
	String emailID = "sumanthchinivar16@gmail.com";
	String password = "Rowdy@123";

	@Parameters("browserName")
	@BeforeClass
	public void browserSetup(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("URL is launched");
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("Login page is diaplayed");
		driver.findElement(By.id("Email")).sendKeys(emailID);
		System.out.println("Email id is entered");
		driver.findElement(By.id("Password")).sendKeys(password);
		System.out.println("password is entered");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("User logged in successfully");
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("User logged out successfully");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}

}
