package writingAutomationScriptUsingPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import learningPOM.HomePage;
import learningPOM.LoginPage;
import learningPOM.StartingPage;
import readigDataFromFiles.DataUtilityClass;

public class TC_DWS_CommunityPoll_006 {
	@Test
	public void communityPoll() throws EncryptedDocumentException, IOException {
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

		StartingPage start = new StartingPage(driver);
		start.getLoginLink().click();
		LoginPage login = new LoginPage(driver);
		softAssert.assertEquals(login.getLoginButton().isDisplayed(), true, "Cannot click on login link");
		Reporter.log("Login page displayed", true);

		login.getEmailTextField().sendKeys(data[1][0]);
		String emailID = login.getEmailTextField().getAttribute("value");
		softAssert.assertEquals(emailID, data[1][0], "Username is not matching");

		login.getPasswordTextField().sendKeys(data[1][1]);
		String password = login.getPasswordTextField().getAttribute("value");
		softAssert.assertEquals(password, data[1][1], "Password is not matching");

		login.getLoginButton().click();
		HomePage home = new HomePage(driver);
		softAssert.assertEquals(home.getUsernameLink().isDisplayed(), true, "Login failed");

		home.getExcellentRadioButton().click();
		boolean excellentIsSelected=home.getExcellentRadioButton().isSelected();
		softAssert.assertEquals(excellentIsSelected,true,"Excellent rating is not selected");
		Reporter.log("User selected his vote",true);
		
		home.getVoteButton().click();
		boolean votingPercentage=home.getExcellentVotingPercentage().isDisplayed();
		softAssert.assertEquals(votingPercentage,true,"Vote was not cast");
		Reporter.log("User voted successfully",true);
	}
}
