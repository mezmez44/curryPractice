package InterviewQuestions;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Trials {
    public static void main(String[]args){
        int nbr=2;
       m(nbr);
        //System.out.println(m(nbr));
    }
    public static void m(int nbr) {
     int rem =nbr%2;
     if(rem==0){
         System.out.println(nbr+" is even");
     }else{
         System.out.println(nbr+" is odd");
     }


    }
}

