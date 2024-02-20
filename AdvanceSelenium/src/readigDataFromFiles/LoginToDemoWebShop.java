package readigDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToDemoWebShop {
	public static void main(String[] args) throws IOException {
		File file = new File("./TestData/Demo.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);

		String url = (String) prop.getProperty("url");
		String username = (String) prop.get("username");
		String password = (String) prop.get("password");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
}
