package writingAutomationScriptUsingPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import learningPOM.HomePage;
import learningPOM.LoginPage;
import learningPOM.StartingPage;
import readigDataFromFiles.DataUtilityClass;

public class TC_DWS_Login_001 {

	@Test
	public void loginAndLogout() throws EncryptedDocumentException, IOException
	{
		DataUtilityClass dataUtility=new DataUtilityClass();
		String[][] credentials=dataUtility.readingDataFromMultipleRowColumn("./TestData/Login.xlsx", "Practice");
		
		WebDriver driver=new ChromeDriver();
		driver.get(credentials[1][2]);
		driver.manage().window().maximize();
		
		StartingPage start=new StartingPage(driver);
		start.getLoginLink().click();
		
		LoginPage login=new LoginPage(driver);
		login.getEmailTextField().clear();
		login.getEmailTextField().sendKeys(credentials[1][0]);
		login.getPasswordTextField().clear();
		login.getPasswordTextField().sendKeys(credentials[1][1]);
		login.getLoginButton().click();
		
		HomePage home=new HomePage(driver);
		home.getLogoutLink().click();
	}
}
