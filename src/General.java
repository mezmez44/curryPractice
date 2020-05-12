import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.sql.SQLOutput;
import java.util.Arrays;
public class General {
    public static void main(String[]args){
        int [] grades = {20,19,18,17};
        String results = Arrays.toString(grades);
        System.out.println("results are -> "+results);
        System.out.println("*************************");

        System.out.println("using for loop-> ");
        for(int i=0; i<grades.length;i++){
            System.out.println(grades[i]);
        }
        System.out.println("*************************");

        char[][] symbols ={{'A','B'}, {'C','D'}};
        String rate = Arrays.deepToString(symbols);
        System.out.println("rates are -> "+rate);
        System.out.println("*************************");

        System.out.println("using for loop-> ");
        for(int i=0; i<symbols.length;i++){
            for(int k=0;k<symbols[0].length;k++){
                System.out.println(symbols[i][k]);

                XSSFWorkbook read = new XSSFWorkbook();
            }
        }
    }
}
