package utlities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderUtility {
	
	@Test(dataProvider = "logindata")
	public void demo(String username,String password) {
		System.out.println(username +" |" +password);
		//System.out.println(password);
		
	}

	@DataProvider(name="logindata")
	public Object[][] logindata() throws Exception {
		
		   FileInputStream fis = new FileInputStream(".//Testdata//Testdata.xlsx");
	       XSSFWorkbook wb = new XSSFWorkbook(fis);
	       XSSFSheet sheet = wb.getSheet("Login");
	       int row=sheet.getLastRowNum();
	       //System.out.println(row);
	       int col = sheet.getRow(0).getLastCellNum();
		   Object[][] data = new Object[row][col];
		   for(int i=0;i<row;i++) {
	    	   XSSFRow row1 = sheet.getRow(i+1);
	    	   for(int j=0;j<col;j++) {
	    		   XSSFCell cell = row1.getCell(j);
	    		   //System.out.print(cell);
	    		   CellType celltype = cell.getCellType();
	    		   switch(celltype) {
	    		   case STRING:
	    			   data[i][j]= cell.getStringCellValue();
	    			   break;
	    		   case NUMERIC:
	    			   data[i][j]= Integer.toString((int)cell.getNumericCellValue());
				
	    		   }
	    		  
	    		   
	    	   }
	    	
	    	 
	       }
	     return data;  
		}
		   
	}
	

