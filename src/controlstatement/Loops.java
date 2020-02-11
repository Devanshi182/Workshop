package controlstatement;

public class Loops 
{
    public void forLoop()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(i+""+j);
            }
        }
    }
    void whileLoop()
    {
        int i=0;
        while(i<4)
        {
            System.out.println(i);
            i++;
        }
        i=0;
        do
        {
            System.out.println(i);
            i++;
        }while(i<4);
    }
    public static void main(String args[])
    {
        Loops obj=new Loops();
        obj.forLoop();
        obj.whileLoop();
    }
    
}
