package encapsulation;

import java.util.Scanner;

class CheckEncap
{
 int id;
 String name,address;
 void setter(int ID, String Name, String Add)
 {
     id=ID;
     name=Name;
     address=Add;
 }
 void getter()
 {
     System.out.println("Details:\n ID: "+id+"\nName: "+name+"\nAddress: "+address);
 }
}

public class EncapsulationDemo 
{
    public static void main(String args[])
    {
        int ID;
        String Name, Add;
        CheckEncap checkEncap=new CheckEncap();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the id, name and address respectively.\n");
        ID=scan.nextInt();
        Name=scan.next();
        Add=scan.next();
        checkEncap.setter(0, Name, Add);
        checkEncap.getter();
    }
}
