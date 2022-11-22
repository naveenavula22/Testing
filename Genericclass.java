package GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is a generic class for data driven testing 
 * @author Asus
 *
 */

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
public class Genericclass<intRow> {
	/**
	 * 	
	 * @param key
	 * @return String 
	 * @throws IOException
	 */


	public String getpropertydata(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property.txt");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * 
	 * @param sheetname
	 * @param intcell
	 * @param i 
	 * @return String 
	 * @throws IOException
	 */
	public String getexceldata(String sheetname,intRow intcell, int i) throws IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String data = book.getSheet("testscript").getRow(1).getCell(6).getStringCellValue();
		return data;
	}
	/**
	 * 
	 * @param sheetname
	 * @param intcell
	 * @param i 
	 * @param value
	 * @throws IOException
	 */
	public void setexceldata(String sheetname,intRow intcell,int i, String value) throws IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		book.getSheet("testscript").getRow(1).getCell(11).setCellValue("pass");
		FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
		book.write(fos);
		book.close();

	}
public static void main(String[] args) throws IOException {
	Genericclass g = new Genericclass();
	System.out.println(g.getpropertydata("URL"));
	g.setexceldata("testscript", 1,11, "fail");
	System.out.println(g.getexceldata("testscript", 1,4));

}
}


