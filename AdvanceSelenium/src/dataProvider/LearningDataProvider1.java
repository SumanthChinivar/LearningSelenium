package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider1 {

	@DataProvider
	public String[][] demo()
	{
		String[][] data= {{"komalgupta121@gmail.com","Shakuni123.@","https://demowebshop.tricentis.com/"},
				{"komalgupta121@gmail.com","Shakuni123.@","https://demowebshop.tricentis.com/"}};
		return data;
	}
	
	@Test(dataProvider = "demo")
	public void login(String[] credentials)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(credentials[2]);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(credentials[0]);
		driver.findElement(By.id("Password")).sendKeys(credentials[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys(un);
//		driver.findElement(By.id("Password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		
//		driver.findElement(By.linkText("Log out")).click();
//		driver.quit();
		
	}
}
