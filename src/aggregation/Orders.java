package aggregation;

public class Orders 
{
    int id;
    String orderid;    
    String product;
    User userid;
    
    Orders(int id, String orderid, String product, User userid)
    {
        this.id=id;
        this.orderid=orderid;
        this.product=product;
        this.userid=userid;
    }
    
    private void showData()
    {
        System.out.println("id: "+id+"\nOrderid: "+orderid+"\nProduct: "+product+"\nUser name: "+userid.name);
    }
    
    public static void main(String args[])
    {
        User user=new User(1,"Devanshi");
        Orders obj=new Orders(1,"ABC12","Soap",user);
        obj.showData();
    }
}
