package readigDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleRowFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/MultipleRows.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Practice");
		
		int rowNum=sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowNum;i++) {
			String data=sheet.getRow(i).getCell(0).toString();
			System.out.println(data);
		}
	}
}
