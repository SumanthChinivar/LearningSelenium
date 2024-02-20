package unitTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningPriorityClass4 {
	@Test(priority = 'a')
	public void launchWoodland() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/");
		System.out.println("Woodland");
		driver.quit();
	}

	@Test(priority = -1)
	public void launchMaxFashion() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maxfashion.in/");
		System.out.println("Max fashion");
		driver.quit();
	}

	@Test(priority = 0)
	public void dummy() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Dummy");
		driver.quit();
	}
}
