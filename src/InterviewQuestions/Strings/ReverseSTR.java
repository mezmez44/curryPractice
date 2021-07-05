package InterviewQuestions.Strings;

public class ReverseSTR {
    public static void main(String[]args){
        String str = "meziane benamrouz";
        System.out.println(revStr(str));
        System.out.println("*****************");
        System.out.println(revStr1(str));
        System.out.println("*****************");
        System.out.println(revStr2(str));
        System.out.println("*****************");
        System.out.println(revStr3(str));
    }
    //using charAt
    public static String revStr(String str){
        String str1 = str.trim();
        String myStr = "";
        for(int i = str1.length()-1; i>=0;i--){
            myStr = myStr + str1.charAt(i);
        }
        return myStr;
    }
    //using .split
    public static String revStr1(String str){
        String str2="";
        String[]str1=str.trim().split("");
        int i;
        for(i=str1.length-1;i>=0;i--){
            str2= str2+str1[i];
        }
        return str2;
    }
    //using toCharArray
    public static String revStr2(String str) {
        char[] str1= str.toCharArray();
        String str2="";
        for(int i=str1.length-1;i>=0;i--){
            str2=str2+str1[i];
        }
        return str2;
    }
    //using stringBuffer
    public static StringBuffer revStr3(String str){
        StringBuffer sb = new StringBuffer();
        return sb.append(str).reverse();
    }
    // reverse string without changing word positions
    public static String rev4(String str){
        String[]str2=str.split(" ");
        String str3="";
        for(int i=0;i<str2.length;i++){
            for(int j=str2[i].length()-1;j>=0;j--){
                str3=str3+str2[i].charAt(j);
            }
            str3= str3+" ";
        }
        return str3;
    }


}
