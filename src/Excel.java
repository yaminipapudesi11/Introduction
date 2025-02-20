import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\anilk\\Desktop\\Yamini\\FakeTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		System.out.println("I'm here");
//Sheet is a combination of rows, so using an iterator to move to next row on condition 
		Iterator<Row> rows = sheet1.iterator();
		Row firstrow = rows.next();
		Iterator<Cell> ce = firstrow.cellIterator();
		int i = 0;
		int column = 0;
		while(ce.hasNext()) {
			
			Cell value = ce.next();
			if(value.getStringCellValue().equals("Test Data")) {
				System.out.println("Found my column");
				column = i;
				break;
			}
			i++;
			
		}
		while(rows.hasNext()) {
			Row rw = rows.next();
			if(rw.getCell(column).getStringCellValue().equals("YaminiPapudesi")) {
				Iterator<Cell> cv = rw.cellIterator();
				while(cv.hasNext()) {
					Cell c = cv.next();
					System.out.println(c.toString());
				}
			}
		}
		//XSSFRow row2 = sheet1.getRow(2);
		//String username = row2.getCell(0).toString();
		//String password = row2.getCell(1).toString();
		
		
	}

}
