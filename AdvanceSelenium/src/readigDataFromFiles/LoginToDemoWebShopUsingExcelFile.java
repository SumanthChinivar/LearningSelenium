package readigDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToDemoWebShopUsingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Creating object for file and fileinput stream
		File file=new File("./TestData/Login.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		//Creating work book
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Practice");	
		
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//Click on login button
		driver.findElement(By.linkText("Log in")).click();
		
		//reading username and entering it in username text field
		String username=sheet.getRow(1).getCell(0).toString();
		driver.findElement(By.id("Email")).sendKeys(username);
		
		//reading password and entering it in password test field
		String password=sheet.getRow(1).getCell(1).toString();
		driver.findElement(By.id("Password")).sendKeys(password);
		
		//Clicking on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
