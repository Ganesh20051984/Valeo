package common_utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelUtility {
	
	public String readDataFromEXcel(String sheetname ,int rownum,int cellnum) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Ganesh J\\.eclipse\\Sdet12336\\src\\main\\resources\\DataStorage\\testData.xlsx");
		
		Workbook book= WorkbookFactory.create(fis);

		
		return book.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		}
	
	
	public String getDataFromExcel(String sheetname,String TestcaseId,String ColumHeader) throws Exception
	
	{
		int expectedRownum=0;
		int expectedCellvalue=0;
	FileInputStream fis = new FileInputStream("./src/main/resources/DataStorage/testData.xlsx");

		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh =book.getSheet(sheetname);
		
	
		int lastRownum=sh.getLastRowNum();
		for(int i= 0;i<lastRownum;i++)
		{
			
			String actualid = sh.getRow(i).getCell(0).getStringCellValue();
			if (actualid.equals(TestcaseId))
			{
				expectedRownum=i;
				break;
			}
			
		}
		int lastcellnum = sh.getRow(expectedRownum).getLastCellNum();
		for (int j = 0;j<lastcellnum;j++)
		{
			String actualHeader =sh.getRow(0).getCell(j).getStringCellValue();
			if(actualHeader.equals(ColumHeader))
			{
				expectedCellvalue=j;
				break;
			}
		}
		
		
		
		
		return sh.getRow(expectedRownum).getCell(expectedCellvalue).getStringCellValue();
		
		
			
	}
	public static void main(String[] args) throws Exception {
	
		String org =new ExelUtility().getDataFromExcel("SheetOrg", "Oragname","Contact Name");
		String Org1=new ExelUtility().getDataFromExcel("SheetOrg", "TC_02", "Oragname");
		
		System.out.println(org);
		System.out.println(Org1);
		
	}
	

}
