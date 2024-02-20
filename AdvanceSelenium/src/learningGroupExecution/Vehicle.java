package learningGroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vehicle {

	@Test(groups = "Bike")
	public void royalEnfield()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/");
		driver.quit();
	}
	
	@Test(groups = "Car")
	public void lamborghini()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lamborghini.com/");
		driver.quit();
	}
	
	@Test(groups = "Auto")
	public void bajajAuto()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
		driver.quit();	
	}
	
	@Test(groups = "Bike")
	public void harley()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/");
		driver.quit();
	}
	
	@Test(groups = "Car")
	public void landRover()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.landrover.in/");
		driver.quit();
	}
	
	@Test(groups = "Car")
	public void tataMotors()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cars.tatamotors.com/");
		driver.quit();
	}
	
	@Test(groups = "Auto")
	public void mahindraAutos()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auto.mahindra.com/");
		driver.quit();
	}
	
	@Test(groups = "Bike")
	public void heroMotors()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/");
		driver.quit();
	}
	
	@Test(groups = "Cycle")
	public void heroCycles()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.herocycles.com/");
		driver.quit();
	}
	
	@Test(groups = "Cycle")
	public void hercules()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hercules.in/");
		driver.quit();
	}
}
