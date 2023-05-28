package Module2;

import Modul1.Account;

public class Debitcard 
{
       int pinNumber;
       int cvv;
       String expDate;
       double productamt;
       Account a1;
       public Debitcard()
       {
    	   
       }
       public void generatePin(int pinNumber)
       {
    	   this.pinNumber=pinNumber;
    	   System.out.println("Generated Pin is: "+pinNumber);
       }
       public void updatedetails(int cvv,String expDate)
       {
    	   this.cvv=cvv;
    	   this.expDate=expDate;
    	   System.out.println("Updated Cvv is: "+cvv);
    	   System.out.println(" "+expDate);
       }
       public void onlinePayment(double productamt,int pinNumber)
       {
    	   if(this.pinNumber==pinNumber)
    	   {
    		   if(productamt==a1.bankBal)
    		   {
    			   System.out.println("Buy Product");
    		   }
    		   else
    		   {
    			   System.out.println("Invalid Transaction");
    		   }
    	   }
    	   else
    	   {
    		   System.out.println("Wrong Pin");
    	   }
       }
}
