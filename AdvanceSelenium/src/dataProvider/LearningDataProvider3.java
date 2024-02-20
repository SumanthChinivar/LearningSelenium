package dataProvider;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider3 {
	@DataProvider
	public String[][] readingFromExcel() throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/Login.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheetName=workbook.getSheet("Practice");
		
		int rowNum=sheetName.getPhysicalNumberOfRows();
		int colNum=sheetName.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=1;i<rowNum;i++)
		{
			for(int j=0;j<colNum;j++)
			{
				data[i-1][j]=sheetName.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "readingFromExcel")
	public void login(String[] credentials)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(credentials[2]);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(credentials[0]);
		driver.findElement(By.id("Password")).sendKeys(credentials[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}
}
