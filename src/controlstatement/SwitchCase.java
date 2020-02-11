package controlstatement;

import java.util.Scanner;

public class SwitchCase 
{
    void switchCaseDemo(int ch,int a, int b)
    {
        switch(ch)
        {
            case 1:
            {
                System.out.println("Addition "+(a+b));
                break;
            }
            case 2:
            {
                System.out.println("Substraction "+(a-b));
            break;
        }
            case 3:{
                System.out.println("Multiplication "+(a*b));
                break;
            }
            case 4:
            {
                System.out.println("Division "+(a/b));
                break;
            }
            default:
            System.out.println("Invalid input");
        }
    }
    
    public static void main(String args[])
    {
        SwitchCase obj=new SwitchCase();
        Scanner scan=new Scanner(System.in);
        System.out.println("Choose a number: \n1)Addition\n2)Substraction\n3)Multiplication\n4)Division");
        int ch=scan.nextInt();
        System.out.println("Enter two operands");
        int x=scan.nextInt();
        int y=scan.nextInt();
        obj.switchCaseDemo(ch,x,y);
    }
}
