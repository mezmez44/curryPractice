package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class AlphabetSearching {
    /**
     * Alphabet Searching
     * Have the function AlphabetSearching(str) take the str parameter
     * being passed and return the string true if every single letter
     * of the English alphabet exists in the string, otherwise return
     * the string false. For example:
     * if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv" then your program
     * should return the string true because every character in the alphabet
     * exists in this string even though some characters appear more than once.
     * Examples
     * Input: "abcdefghijklmnopqrstuvwxyyyy"
     * Output: falseInput: "abc123456kmo"
     * Output: false
     */
    public static void main(String[]args){
        String str="zacxyjbbkfgtbhdaielqrm45pnsowtuv";

    }
    public static String alphabetSearching1(String str){
        String []strReg=str.replaceAll("[^a-z]","").split("");
        String newString=""; //"zacxyjbbkfgtbhdalieqrmpnsoowtuv"
        int i,k;
        for( i=0;i<strReg.length;i++){//z
            for( k=0;k<strReg.length;k++){
                if(strReg[i].equalsIgnoreCase(strReg[k])){
                    break;
                }
            }if(i==k){
                newString=newString+strReg[i];
            }
        }if(newString.length()==26){
            return "true";
        }
        return "false";
    }

}
