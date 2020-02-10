package constructor;

public class ConstructorPrg 
{
    private ConstructorPrg()
    {
        System.out.println("Default constructor is called");
    }
    
    ConstructorPrg(int a)
    {
        System.out.println("Parameterized constructor is called : "+a);
    }
    
    public static void main(String args[])
    {
        ConstructorPrg obj1=new ConstructorPrg();
        ConstructorPrg obj2=new ConstructorPrg(1);
    }
}
