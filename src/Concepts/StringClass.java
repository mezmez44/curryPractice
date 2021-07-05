package Concepts;

import org.apache.commons.codec.binary.StringUtils;

import java.util.*;
public class StringClass {

    public static void main(String[]args){
        String x ="hello";
         char y= x.charAt(2);// returns the character at a specific index
         System.out.println("the character at index 2: "+y);
         try {
             y = x.charAt(5);// returns StringIndexOutOfBoundException
         }catch(StringIndexOutOfBoundsException e) {
             System.out.println("Exception raised");
         }
         x+=" caleb";
         System.out.println("concat usig + :"+x);

         int length = x.length();
         System.out.println("length of the String : "+length);
         char lastChar= x.charAt(x.length()-1);
         System.out.println("Last Character : "+lastChar);
         String question = x+" ,How Are You?";
         System.out.println("concat : "+question);
         System.out.println("question contains : "+question.contains("How"));
         System.out.println(question.indexOf("How"));
         System.out.println("ask the question in uppercase:"+question.toUpperCase());
         System.out.println("ask the question in lowercase:"+question.toLowerCase());
         System.out.println("ask the question only :"+question.substring(13));
         System.out.println("show from index 0 to 11: "+ question.substring(0,11));
         System.out.println("Check if its's Empty: "+ question.isEmpty());
         System.out.println("String starts with h"+question.startsWith("h"));
         System.out.println("concat method: "+question.concat(" i'm fine"));
         System.out.println("replace method: "+question.replace("hello caleb","hey mez"));
        System.out.println("equals method :"+question.equals(x));
    }
}
