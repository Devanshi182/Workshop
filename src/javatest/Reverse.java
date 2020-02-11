package javatest;

import java.util.Scanner;

public class Reverse 
{
    public static String revStr(String str)
    {
        if (str.isEmpty())
            return str;
        return revStr(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=scan.next();
        String reversed = revStr(string);
        System.out.println("The reversed string is: " + reversed);
    }

    
}