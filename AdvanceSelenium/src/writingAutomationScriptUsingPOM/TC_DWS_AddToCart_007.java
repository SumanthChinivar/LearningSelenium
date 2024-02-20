package writingAutomationScriptUsingPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import learningPOM.HomePage;
import learningPOM.LoginPage;
import learningPOM.ProductDetailsPage;
import learningPOM.StartingPage;
import readigDataFromFiles.DataUtilityClass;

public class TC_DWS_AddToCart_007 {
	@Test
	public void addingProductToCartAndLogout() throws EncryptedDocumentException, IOException {
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
		
		Actions action=new Actions(driver);
		action.scrollByAmount(0,600).perform();
		
		home.getAddToCartButton().click();
		ProductDetailsPage details=new ProductDetailsPage(driver);
		boolean addToCartIsDisplayed = details.getAddToCartButton().isDisplayed();
		softAssert.assertEquals(addToCartIsDisplayed, true,"Products details page is not displayed");
		Reporter.log("User clicked on add to cart button",true);
		
		details.getRecipientNameTextField().sendKeys(data[1][3]);
		String recipientName = details.getRecipientNameTextField().getAttribute("value");
		softAssert.assertEquals(recipientName, data[1][3],"recipeientName mismatch");
		Reporter.log("Recepient name entered",true);
		
		details.getReceipientEmailTextField().sendKeys(data[1][4]);
		String recipientEmail = details.getReceipientEmailTextField().getAttribute("value");
		softAssert.assertEquals(recipientEmail,data[1][4],"Recipient email mismatch");
		Reporter.log("Recipient email mismatch",true);
		
		details.getAddToCartButton().click();
		boolean addedToCartMessage = details.getAddedToCartMessage().isDisplayed();
		softAssert.assertEquals(addedToCartMessage,true,"Product is not added to cart");
		Reporter.log("Product added to cart successfully",true);
		
		driver.quit();
	}
}
