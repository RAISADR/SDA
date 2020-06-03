package ro.unitbv.javadatatype.lab2;

public class Customer {
	private String nume;
	private String prenume;
	private int age;
	private Address address;
	private PaymentMethod type;
	
	public Customer (String num, String pre, int a) {
		this.nume = num;
		this.prenume = pre; 
		this.age = a ;	
	}
	
	
	
	public Customer(String num, String pre, int a, Address add, PaymentMethod t) {
		this.nume = num;
		this.prenume = pre; 
		this.age = a;	
		this.address = add;
		this.type = t ;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	void getCompleteName() 
    { 
	
       System.out.println("Numele:"+getNume()+",prenumele:"+getPrenume() + ",varsta:"+getAge());
    }
	
	void getCustomer() {  

		System.out.println("Numele:"+nume+",prenumele:"+prenume+",varsta:"+age);  
		address.getFullAddress();  
	}
	
	void getCustomerWithPayment() {  

		System.out.println("Numele:"+nume+",prenumele:"+prenume+",varsta:"+age);  
		address.getFullAddress();
		type.getPaymentMethod();
	}
	
	void test() {
		address.getFullAddress();
	}
}
