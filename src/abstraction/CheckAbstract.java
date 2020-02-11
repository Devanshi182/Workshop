package abstraction;

public class CheckAbstract extends AbstractDemo implements InterfaceDemo 
{
    public void showData()
    {
        System.out.println("Inside showData");
    }
    
    public static void main(String args[])
    {
        CheckAbstract obj=new CheckAbstract();
        obj.showData();
    }
    
    public void add
    {}
}
