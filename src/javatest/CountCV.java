package javatest;

public class CountCV 
{
    public static void main(String args[])
    {
        CountCV obj=new CountCV();
        String str="ones";
        obj.count(str);
    }
    
    void count(String str)
    {
        int cons=0;
        int vow=0;
        char[] str1=str.toCharArray();
        for(int i=0;i<str1.length;i++)
         {
            if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u')
            {
                vow++;
            }
            else
            {
                    cons++;
             }
         }
        System.out.println("Number of Vowels="+vow+"\nNumber of consonants="+cons);
        
    }
}
