package controlstatement;

import java.util.Scanner;

public class IfElseDemo 
{
  void IfElse(int x)    
  {
      if(x%2==0)
      {
          System.out.println(x+" is an even number");
      }
      else
      {
          System.out.println(x+"is an odd number");
      }
  }
  void ElseIf(int x)
  {
      if(x<35)
          System.out.println("Result: Fail!!");
      else if(x>=35&&x<60)
          System.out.println("Result: Pass!!");
      else if(x>=60&&x<75)
          System.out.println("Result: Second Class!!");
      else if(x>=75&&x<100)
          System.out.println("Result: First Class!!");
      else
          System.out.println("Wrong Input");
  }
  
  public static void main(String args[])
  {
      IfElseDemo obj=new IfElseDemo();
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the marks");
      int marks=scan.nextInt();
      obj.IfElse(marks);
      obj.ElseIf(marks);
      
  }
}
