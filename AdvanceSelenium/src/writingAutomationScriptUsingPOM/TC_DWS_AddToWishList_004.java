package writingAutomationScriptUsingPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import learningPOM.HomePage;
import learningPOM.LoginPage;
import learningPOM.ProductDetailsPage;
import learningPOM.StartingPage;
import readigDataFromFiles.DataUtilityClass;

public class TC_DWS_AddToWishList_004 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	DataUtilityClass readingData=new DataUtilityClass();
	String[][] data=readingData.readingDataFromMultipleRowColumn("./TestData/Login.xlsx", "Practice");
	
	driver.get(data[1][2]);
	
	StartingPage start=new StartingPage(driver);
	start.getLoginLink().click();

	LoginPage login=new LoginPage(driver);
	login.getEmailTextField().sendKeys(data[1][0]);
	
	login.getPasswordTextField().sendKeys(data[1][1]);
	login.getLoginButton().click();
	
	Actions action=new Actions(driver);
	action.scrollByAmount(0,600).perform();
	
	HomePage home=new HomePage(driver);
	home.getAddToCartButton().click();
	
	ProductDetailsPage details=new ProductDetailsPage(driver);
	details.getRecipientNameTextField().sendKeys(data[1][3]);
	details.getReceipientEmailTextField().sendKeys(data[1][4]);
	
	details.getAddToWishList().click();
}
}
