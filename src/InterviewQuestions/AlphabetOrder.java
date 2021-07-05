package InterviewQuestions;

import java.util.Arrays;

public class AlphabetOrder {
    /**
     Have the function AlphabetSoup(str) take the str string parameter being passed and
     return the string with the letters in alphabetical order (ie. hello becomes ehllo).
     Assume numbers and punctuation symbols will not be included in the string.
     Examples
     Input: "coderbyte"
     Output: bcdeeorty
     Input: "hooplah"
     Output: ahhloop */
    public static void main(String[]args){
        String str = "hooplah";
        alphabet(str);
    }
    public static void alphabet(String str){
       char []c = str.toCharArray();
       Arrays.sort(c);
       String str1="";
        for(int i=0;i<c.length;i++){
            str1=str1+c[i];
        }
        System.out.println(str1);
    }
    //using for loop(swap)
    public static String alphabetSoup( String str){
        char [] arrChar = str.toCharArray();//{z,m,d,z}
        char swap;
        String str1="";
        for(int i = 0;i<arrChar.length;i++){// i=0 == z ,
            for (int j =i+1;j<arrChar.length;j++){//j=0+1 ==m,
                if(arrChar[j]<arrChar[i]){
                    swap = arrChar[i];//z
                    arrChar[i]= arrChar[j];// //i == m
                    arrChar[j]=swap;//j == z
                }

            }
            str1=str1+arrChar[i];
        }


        return str1;
    }
    public static String alphabetSoup1(String str){

        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String (arr);
    }
}
