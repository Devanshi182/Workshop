package exceptionhandling;

public class ExceptionDemo 
{
    private void checkNullPointerException()
    {
        try
        {
            String s=null;
            int length=s.length();
            System.out.println(length);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
          System.out.println("This block will always get executed");
        }
    }
    public static void main(String args[])
    {
        ExceptionDemo t=new ExceptionDemo();
        t.checkNullPointerException();
    }
    
}
