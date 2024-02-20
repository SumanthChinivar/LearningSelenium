package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPlaceHolder {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
			
		String placeHolder=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(placeHolder);
	}
}
