package ProblemSolving.Arraypblms;

import java.util.Arrays;

public class Assignment {

    public static void main(String[]args){
        int [] a ={10,20,30,40,50};
        int c=54321;
        //System.out.println(sum(a));
        System.out.println(revint(c));
    }
    public static int sum(int[]a){
        int b=0;
        for(int i =0;i<a.length;i++){
            b = b+a[i];
        }
        return  b;
    }
    public static int revint(int c){
        int rev=0;
        while(c!=0) {
            int rem = c % 10;
            rev=rev*10+rem;
            c = c/10;

        }
        return rev;
    }
}
