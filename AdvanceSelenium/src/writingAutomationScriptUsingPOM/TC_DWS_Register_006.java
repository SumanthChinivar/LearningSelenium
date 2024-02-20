package writingAutomationScriptUsingPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import learningPOM.RegisterPage;
import learningPOM.StartingPage;
import readigDataFromFiles.DataUtilityClass;

public class TC_DWS_Register_006 {
	@Test
	public void clickOnRegister() throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		SoftAssert softAssert = new SoftAssert();

		DataUtilityClass readingData = new DataUtilityClass();
		String[][] data = readingData.readingDataFromMultipleRowColumn("./TestData/Login.xlsx", "Practice");

		driver.get(data[1][2]);
		Reporter.log("DemoWebShop is launched", true);
		
		StartingPage start=new StartingPage(driver);
		start.getRegisterLink().click();
		RegisterPage register=new RegisterPage(driver);
		boolean registerButtonVisibility=register.getRegisterButton().isDisplayed();
		softAssert.assertEquals(registerButtonVisibility, true,"Register link was not clicked");
		Reporter.log("User clicked on register link successfully",true);
	}
}
