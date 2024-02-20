package writingAutomationScriptUsingPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import learningPOM.RegisterPage;
import learningPOM.StartingPage;
import readigDataFromFiles.DataUtilityClass;

public class TC_DWS_Register_002 {
	@DataProvider(name = "Register")
	public String[][] readingRegisterData() throws EncryptedDocumentException, IOException {
		DataUtilityClass data = new DataUtilityClass();
		String[][] registerData = data.readingDataFromSecondRowColumn("./TestData/RegisterTestData.xlsx", "Practice");
		return registerData;
	}

	@Test(dataProvider = "Register")
	public void method_To_Register(String[] values) throws EncryptedDocumentException, IOException
	{
		DataUtilityClass dataUtility=new DataUtilityClass();
		String[][] credentials=dataUtility.readingDataFromMultipleRowColumn("./TestData/Login.xlsx", "Practice");
		
		WebDriver driver=new ChromeDriver();
		driver.get(credentials[1][2]);
		driver.manage().window().maximize();
			
		StartingPage start=new StartingPage(driver);
		start.getRegisterLink().click();
		
		RegisterPage register=new RegisterPage(driver);
		
		if(values[0].equalsIgnoreCase("male")) {
			register.getMaleRadioButton().click();
		}else if(values[0].equalsIgnoreCase("female")) {
			register.getFemaleRadioButton().click();
		}
		
		register.getFirstNameTextField().sendKeys(values[1]);
		register.getLastNameTextField().sendKeys(values[2]);
		register.getEmailTextField().sendKeys(values[3]);
		register.getPasswordTextField().sendKeys(values[4]);
		register.getConfirmPasswordTextField().sendKeys(values[5]);
		register.getRegisterButton().click();
		
		driver.quit();
	}
}
