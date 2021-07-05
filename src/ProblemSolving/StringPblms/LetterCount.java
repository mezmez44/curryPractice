package ProblemSolving.StringPblms;

import java.util.*;

/*
Letter Count I
Have the function LetterCountI(str) take the str parameter being passed and return the first word with the greatest number of repeated letters.
 For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's.
  If there are no words with repeating letters return -1. Words will be separated by spaces.
 */

public class LetterCount {
    public static void main(String[] args) {


        String str = "Today, is the great day ev!";
        System.out.println(letterCount(str));
        System.out.println(letterCount1(str));

    }

           public static String letterCount(String str) {
               String myString = "-1";
               int count = 0;
               String[] str2 = str.toLowerCase().split(" ");
               for (
                       int i = 0;
                       i < str2.length; i++) {
                   int count1 = 0;
                   for (int j = 0; j < str2[i].length(); j++) {
                       for (int k = j + 1; k < str2[i].length(); k++) {
                           if (str2[i].charAt(j) == str2[i].charAt(k)) {
                               count1++;
                           }
                       }
                   }
                   if (count1 > count) {
                       count = count1;
                       myString = str2[i];
                   }
               }
               return myString;

           }
       public static String letterCount1(String str) {
    String[] strArr = str.split(" ");
    int[] count = new int[strArr.length];
    int maxCount = count[0];
    int index = 0;
    for (int i = 0; i < strArr.length; i++) {
        Set<Character> MySet = new HashSet<>();
        for (int j = 0; j < strArr[i].length(); j++) {
            if (!MySet.add(strArr[i].charAt(j))) {
                count[i]++;
            }
        }
        if (count[i] > maxCount) {
            maxCount = count[i];
            index = i;
        }
    }
    System.out.println(Arrays.toString(strArr));
    System.out.println(Arrays.toString(count));
    if (maxCount == 0) {
        return "-1";
    }
    return strArr[index];
}

    }



