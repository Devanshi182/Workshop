package javatest;

import java.util.Scanner;

public class Fact 
{
    Fact obj=new Fact();
    int Fact(int n)
    {
        int ans;
        if(n==0)
        {
            ans=1;
        }
        else 
        {
            ans=n.(obj.Fact(n-1));
        }
        return ans;
    }
    
    public static void main(String args[])
    {
        Fact obj2=new Fact();
        System.out.println("Enter the number for factorial");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int ans=obj2.Fact(num);
        System.out.println("The factorial of "+num+" is "+ans);
    }
}
