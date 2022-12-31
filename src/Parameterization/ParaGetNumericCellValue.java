package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParaGetNumericCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream file=new FileInputStream("D:\\TechMax Data(14-10-22)\\Parameterization.xlsx");
	     double data= WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
		 System.out.println(data);
		 

	}

}
