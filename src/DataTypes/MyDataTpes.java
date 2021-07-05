package DataTypes;

import java.io.FileOutputStream;
import java.util.Scanner;

public class MyDataTpes {
    /*
    byte = 1 byte(8 bit) [0]  [2sqr0] [2sqr1]  [2sqr2]  [2sqr3]  [2sqr4]  [2sqr5]  [2sqr6]
                          0     1        2         4        8        16       32      64      = 127
                          max value = +127
                          min value = -128
     */
    byte b =10; // --> valid declaration
    byte c= 127; // --> valid declaration
    byte a = -128;
    // byte d= 128; // compile time error (provided int required type is byte)
    //byte e =10.5;  // compile time error (provided double required type is byte)
    //byte f = true; //compile time error (provided boolean required type is byte)
    //byte g ="mez"; //compile time error (provided String required type is byte)

    /*******************************************************/

    short h = 32767; //--> max value = 2sqr15 -1
    short i =- 32768; //--> min value = - 2sqr15
    // short = 2 bytes (16 bit)

    /*******************************************************/

    static int j = 2147483647; //--> max value 2 sqr 31 -1
    int k = - 2147483648;  //--> max value -2 sqr 31
    int l = 0xBeef9;
    /*
    int = 4 bytes (32 bit)
     */
    public static void m (int... z){
        System.out.println("m");
    }

    public static void main(String[] args) {
        //System.out.println(args.length);
        //System.out.println("Hello"+ "\n"  +"mezi");
       m(0,19);
       m(45,76);
byte o =4;
byte x =3;
byte h=o++;
long s =6;
long  v = s+o;

    }
}
