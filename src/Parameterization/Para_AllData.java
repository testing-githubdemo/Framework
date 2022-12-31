package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para_AllData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="D:\\TechMax Data(14-10-22)\\Parameterization.xlsx";
		FileInputStream file=new FileInputStream(path);
	org.apache.poi.ss.usermodel.Sheet data=	WorkbookFactory.create(file).getSheet("Sheet1");
	int lastrowNum=data.getLastRowNum();
	System.out.println(lastrowNum);
	for(int i=0;i<data.getLastRowNum();i++)
	{
	//int col=data.getRow(i).getLastCellNum();
		for(int j=0;j<data.getRow(i).getLastCellNum();j++)
		{
		String value=data.getRow(i).getCell(j).getStringCellValue();	
		System.out.print(value +"|");
		}
		System.out.println();
	}


	}
	

}
