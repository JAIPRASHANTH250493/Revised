package SeleniumRevised;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivern_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\New\\Desktop\\jaiexcel.xlsx");

		XSSFWorkbook book=new XSSFWorkbook(file);

		XSSFSheet sheet=book.getSheet("jaisheet");
		
		int rownum=sheet.getLastRowNum();
		System.out.println(rownum);
		int colnnum=sheet.getRow(1).getLastCellNum();
		System.out.println(colnnum);

		for(int i=1;i<=rownum;i++) {
			
				String s=sheet.getRow(i).getCell(0).getStringCellValue();
				int s1=(int) sheet.getRow(i).getCell(1).getNumericCellValue();
				int s2=(int) sheet.getRow(i).getCell(2).getNumericCellValue();
				//int s3=(int) sheet.getRow(i).getCell(3).getNumericCellValue();
				System.out.println(s);
				System.out.println(s1);
				System.out.println(s2);}

	}

}
