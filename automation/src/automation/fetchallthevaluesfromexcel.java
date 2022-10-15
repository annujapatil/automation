package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchallthevaluesfromexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\abhi\\Downloads\\annujafarande.xlsx");
		double data = WorkbookFactory.create(file).getSheet("book1").getRow(0).getCell(0).getNumericCellValue();
		int rowcount= WorkbookFactory.create(file).getSheet("book1").getLastRowNum(); // count-1
		Cell c= WorkbookFactory.create(file).getSheet("book1").getRow(0).getCell(0);
		for(int i=0;i<=rowcount;i++)
		{
			int Cellcount = WorkbookFactory.create(file).getSheet("book1").getRow(i).getLastCellNum();		
			for(int j=0;j<=Cellcount-1;j++)
			{
				if(c.equals(CellType.BOOLEAN))
				{
					c.getBooleanCellValue();
					}else if(c.equals(CellType.NUMERIC))
					{
						c.getNumericCellValue();
						
					}else if(c.equals(CellType.STRING))
							{
						c.getStringCellValue();
					}
			}
			}
		}
	}

}
