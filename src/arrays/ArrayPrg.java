package arrays;

public class ArrayPrg
{
    void oneDArray()
    {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    void twoDArray()
    {
        int arr[][]={{1,2,3},{4,5,6,},{7,8,9}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=(arr.length-1);j>=0;j--)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String args[])
    {
        ArrayPrg obj=new ArrayPrg();
        obj.oneDArray();
        obj.twoDArray();
    }
}
