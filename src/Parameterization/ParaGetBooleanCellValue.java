package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParaGetBooleanCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file=new FileInputStream("D:\\TechMax Data(14-10-22)\\Parameterization.xlsx");
		boolean data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(2).getBooleanCellValue();
		System.out.println(data); 
		 
	}

}