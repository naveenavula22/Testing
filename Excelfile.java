package automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		int rowcount = book.getSheet("testscript").getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			String un = book.getSheet("testscript").getRow(i).getCell(0).getStringCellValue();
			String pw = book.getSheet("testscript").getRow(i).getCell(1).toString();
			System.out.println(un+"      "+pw);
		}

	}
}
