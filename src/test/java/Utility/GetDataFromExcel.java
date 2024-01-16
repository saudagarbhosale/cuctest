package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {

	public  void getrowcount() throws EncryptedDocumentException, IOException {
		
		File file=new File("");
		int  rowcount = WorkbookFactory.create(file).getSheet("").getLastRowNum();
		int cellcount= WorkbookFactory.create(file).getSheet("").getRow(0).getLastCellNum();
		
		
	}
	public static String getData(String sheetname, int rono, int cellno) throws EncryptedDocumentException, IOException {
		String datafile = System.getProperty("user.dir")+"/data.xlsx";
		File file=new File(datafile);
		String data = WorkbookFactory.create(file).getSheet(sheetname).getRow(rono).getCell(cellno).getStringCellValue();
		return data;
	}
	
}
