package customer;

public class Customer 
{
	String name="manjunath";
    int customerid=1023;
    String customerpw="manju2123";
    public void displayCustomerDetails()
    {
        System.out.println(name);
        System.out.println(customerid);
        System.out.println(customerpw);
    }
    public void orderprodut()
    {
    	System.out.println("tea");
    }
    public static void main(String[] args) 
    {
        Customer a=new Customer();
        a.displayCustomerDetails();
        a.orderprodut();
    }
}
