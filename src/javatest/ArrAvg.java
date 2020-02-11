package javatest;

import java.util.Scanner;

public class ArrAvg 
{ 
    int ArrAdd(int[] arr)
    {
        int add2=0,add=0;
        for(int i=0;i<arr.length;i++)
        {
            add=add+arr[i];
            add2=add;
        }
        return add2;
    }
    public static void main(String args[])
    {
        ArrAvg obj=new ArrAvg();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=scan.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
        }
        int ans=obj.ArrAdd(array);
        System.out.println("The sum of the array is="+ans);
    }
}
