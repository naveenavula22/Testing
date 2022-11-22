package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File file = new File("./data/testdata.xlsx");
		 
		FileInputStream fis = new FileInputStream(file);
		
		Workbook book = WorkbookFactory.create(fis);
		
		book.getSheet("testscript").getRow(5).getCell(11).setCellValue("fail");
		
		//System.out.println();
		
		FileOutputStream fos = new FileOutputStream(file);
		
		book.write(fos);
		
		book.close();
	}

}


