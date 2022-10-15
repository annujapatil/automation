package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class paramiterised {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream File = new FileInputStream("C:\\Users\\abhi\\Downloads\\annujafarande.xlsx");
			double data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
			//System.out.println(data);
			//String s = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
			//System.out.println(s);
			//boolean b =WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
			//System.out.println(b);
		//String d = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(d);
			
          //Date dt=WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getDateCellValue();
	}

	}



