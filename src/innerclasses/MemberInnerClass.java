package innerclasses;

public class MemberInnerClass
{
 private String password="abcd@123";
 
 class CheckInnerMemberClass
 {
     String showPassword()
     {
         return password;
     }
 }
 
 public static void main(String args[])
 {
     MemberInnerClass member1=new MemberInnerClass();
     MemberInnerClass.CheckInnerMemberClass member12=member1.new CheckInnerMemberClass();
     System.out.println(member12.showPassword());
 }
}
