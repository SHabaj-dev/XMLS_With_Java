package XMLS_to_DB;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class ReadXMLS {

    public static void main(String[] args) throws IOException {

        final String sheetPath = ".//datafiles//country.xlsx";

        FileInputStream fileInputStream = new FileInputStream(sheetPath);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c <= cols; c++) {
                XSSFCell cell = row.getCell(c);

                try {

                    switch (cell.getCellTypeEnum()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            break;

                        default:
                            break;
                    }
                }catch (Exception e){
                    
                }

                System.out.println();
            }
        }

    }
}
