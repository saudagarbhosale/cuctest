package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {

	@DataProvider(name="scenarioDataProvider")
	public Object [][] getScenarioData()
	{
		return new Object[][]{
            {"Admin", "Admin123"},
           
	};
	}
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//String datafile = System.getProperty("user.dir")+"/data.xlsx";
	FileInputStream file=new FileInputStream("C:/Users/Saudagar.Bhosale/Documents/cuc/data.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
}

}
