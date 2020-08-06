package helloWorld;

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class helloWorld {
    public static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to print:");
        String s = sc.next();
        return s;
    }
    public static String print(String s){
        System.out.println(s);
        return s;
    }
//    public static void main(String [] Args){
//        String printmain =
//                print();
//        //String S = printmain();
//        System.out.println(printmain);
//
//
//    }
}
