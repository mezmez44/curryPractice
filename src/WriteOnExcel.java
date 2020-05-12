import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOnExcel {

    static String path = "/Users/mezibena/Desktop/milo.xlsx";

    public static void main(String[]args) throws IOException {
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("info");
        Object [][] milo = {
                {"raja","jsk"},{"wac","cinqo","mca"}
        };
        int row=0;
        System.out.println("Excel File Created");
        for (Object [] mez : milo) {
            Row row1 = sheet.createRow(row++);
            int col=0;
            for(Object aghiles: mez){
                Cell cell = row1.createCell(col++);
                if(aghiles instanceof String ){
                    cell.setCellValue((String)aghiles);
                }else if(aghiles instanceof Integer){
                    cell.setCellValue((Integer)aghiles);
                }


            }

        }try{
            FileOutputStream outputStream = new FileOutputStream(new File(path));
            workbook.write(outputStream);
            outputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();

        }

    }

}
