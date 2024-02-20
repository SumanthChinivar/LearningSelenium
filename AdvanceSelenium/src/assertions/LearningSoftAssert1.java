package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert1 {
	@Test
	public void demo() {
		String url="http:www.google";
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com");
		String currentUrl=driver.getCurrentUrl();
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(currentUrl,url,"URL not matching");
		Reporter.log("URL is launched",true);
		driver.quit();
		Reporter.log("Browser closed",true);
		softAssert.assertAll();
	}
}
