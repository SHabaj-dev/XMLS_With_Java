package XMLS_to_DB;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class InsertIntoDB {

    public static void main(String[] args) throws IOException {
        XSSFRow row;
        Structure st = new Structure();


        final String fileLocation = ".//datafiles//country.xlsx";
        FileInputStream fileInputStream = new FileInputStream(fileLocation);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet spreadsheetRead = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = spreadsheetRead.iterator();
        while (rowIterator.hasNext()) {
            row = (XSSFRow) rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                cell.setCellType(CellType.STRING);
                switch (cell.getColumnIndex()) {
                    case 0:
                        System.out.print(cell.getStringCellValue() + " \t\t");
                        break;
                    case 1:
                        System.out.print(cell.getStringCellValue() + " \t\t");
                        break;
                    case 2:
                        System.out.print(cell.getStringCellValue() + " \t\t");
                        break;
                    case 3:
                        System.out.print(cell.getStringCellValue() + " \t\t");
                        break;
                    case 4:
                        System.out.print(cell.getStringCellValue() + " \t\t");
                        break;
                    default:
                        break;
                    }
                }
            System.out.println();
            st.Rank = Integer.parseInt(row.getCell(0).getStringCellValue());
            st.country = (row.getCell(1).getStringCellValue());
            st.population = (row.getCell(2).getStringCellValue());
            st.date = (row.getCell(3).getStringCellValue());
            st.percentage = (row.getCell(4).getStringCellValue());
            
            InsertRowInBD(st.getRank(), st.getCountry(), st.getPopulation(), st.getDate(), st.getPercentage());
        }
    }

    private static void InsertRowInBD(int rank, String country, String population, String date, String percentage) {

        
    }
}
