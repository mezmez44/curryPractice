package ProblemSolving.Arraypblms;

import static java.lang.Character.toUpperCase;
/*Letter Changes
        Have the function LetterChanges(str) take the str parameter being passed and
        modify it using the following algorithm.
        Replace every letter in the string
        with the letter following it in the alphabet (ie. c becomes d, z becomes a).
        Then capitalize every vowel in this new string (a, e, i, o, u)
        and finally return this modified string.
// inPut is fun times!
outPut is gvO Ujnft!

        1. For input "123456789ae"
        the output was incorrect.
        The correct output is 123456789bf

        2. For input "a confusing /:sentence:/[ this is not!!!!!!!~"
        the output was incorrect.
        The correct output is b dpOgvtjOh /:tfOUfOdf:/[ UIjt jt OpU!!!!!!!~

//inPut is hello*3
outPut is Ifmmp*3
        */

public class LetterChange {
    public static String letterChanges(String str) {
        String strLetter = str.replaceAll("[^a-zA-Z-\\s]","");
        String strNoLetter =str.replaceAll("[a-zA-Z-\\s]","");
        char [] strletterChar = strLetter.toCharArray();
//        System.out.println("strLetter " + Arrays.toString(strLetter));
//        System.out.println("strNoLetter " + Arrays.toString(strNoLetter));
        char newStrChar ;
        String name = "";
        int value = 0;
        for (int i = 0; i < strletterChar.length; i++) {
            value = strletterChar[i];
            newStrChar=(char)value;
            if(newStrChar!=' '){
                if(strletterChar[i]=='z'){
                    strletterChar[i]='a';
                    value = strletterChar[i];
                    newStrChar =(char) value;
                }else if(strletterChar[i]=='Z'){
                    strletterChar[i]='A';
                    value = strletterChar[i];
                    newStrChar =(char) value;
                }else {
                    value = strletterChar[i]+1;
                    newStrChar=(char) value;
                }
            }if(newStrChar =='a' || newStrChar =='e' || newStrChar =='o'|| newStrChar =='u' || newStrChar =='i'){
                newStrChar = toUpperCase(newStrChar);
            }
            name = name+newStrChar;

        }
        String str1=name+strNoLetter;
        return str1;

    }
    public static  void main(String[]args){
     String str ="a confusing /:sentence:/[ this is not!!!!!!!~";
        System.out.println(letterChanges(str));
    }
}
//b dpOgvtjOh /:tfOUfOdf:/[ UIjt jt OpU!!!!!!!~