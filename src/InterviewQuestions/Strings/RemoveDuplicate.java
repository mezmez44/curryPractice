package InterviewQuestions.Strings;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String []args){
        String str = "mezmez";
        System.out.println(deleteDuplicate(str));
        //System.out.println(deleteDuplicate1(str));
    }
// using set
    public static String deleteDuplicate(String str){
        String str1 ="";
        Set myset = new LinkedHashSet();
        for(int i=0;i<str.length();i++){
           if( myset.add(str.charAt(i))){
               str1 = str1+str.charAt(i);
           }
        }
        return str1;
    }

    //using for loop
    public static String deleteDuplicate1(String str){
        String [] mystr=str.split("");
        String str2 = "";
        int duplicatecount=0;
        for(int i=0;i<mystr.length;i++){
            for(int j=0;j<mystr.length;j++){
                if(mystr[i].equalsIgnoreCase(mystr[j])){
                    str2 = mystr[i];
                }else{

                }
            }
        }
        return  str2;
    }
}
