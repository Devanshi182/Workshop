package javatest;

public class Pattern 
{
    void Pyramid()
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=5-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
            
    }
    
    public static void main(String args[])
    {
        Pattern obj=new Pattern();
        obj.Pyramid();
    }
    
}
