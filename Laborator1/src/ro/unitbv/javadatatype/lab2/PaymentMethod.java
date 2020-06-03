package ro.unitbv.javadatatype.lab2;

public class PaymentMethod {
	String type ;

	public String getType() {
		return type;
	}
	
	public PaymentMethod(String t) {
		this.type = t ;
	}
	
	void getPaymentMethod() 
    { 
	   System.out.println();	
       System.out.println("Cash sau card?:"+getType());
    }

	public static void main(String[] args) {		
		Address ad = new Address("Codlea","Liliacului",15);
		ad.getFullAddress();
	
		Customer ct1 = new Customer("Draghiciu","Raisa",21);
		ct1.getCompleteName();
		
		
		PaymentMethod pm = new PaymentMethod("Card");
		pm.getPaymentMethod();
		
		Customer ct3 = new Customer("Zoe","Ziri",22,ad,pm);
		ct3.getCustomerWithPayment();

	}
}
