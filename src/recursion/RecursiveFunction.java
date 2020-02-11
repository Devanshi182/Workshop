package recursion;

public class RecursiveFunction 
{
    static int count=0;
    
    void showArray(int arr[])
    {
        if(count<arr.length)
        {
            count++;
            showArray(arr);
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    
    static int[] getArray()
    {
        int arr[]={1,2,3,4,5};
        return arr;
    }
    
    public static void main(String args[])
    {
        RecursiveFunction obj=new RecursiveFunction();
        obj.showArray(obj.getArray());
    }
}
