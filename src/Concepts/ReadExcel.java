package Concepts;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {
    static String filePath = "/Users/mezibena/Documents/ReadWriteXLSFile.xlsx";

    public static void main(String[] args) {
        //This is How To Read A File fROM Excel File
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(1);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
               /*if (cell.getCellType()== CellType.NUMERIC){
                   System.out.println(cell.getNumericCellValue());
               }else if(cell.getCellType()==CellType.STRING){
                   System.out.println(cell.getStringCellValue());
               }*/
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                    }
                }
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("FileNotFoundException");


        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("IOException");
        }


    }

}
