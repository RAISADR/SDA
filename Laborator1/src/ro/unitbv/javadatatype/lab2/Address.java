package ro.unitbv.javadatatype.lab2;

public class Address {

	private String city ;
	private String street;
	private int number;
	
	public Address(String str ,String ct ,int nr) {
		this.city = ct;
		this.street = str;
	    this.number = nr;
	  }
	
	public Address() {
		
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

    public void getFullAddress() { 
       System.out.println("Orasul:"+getStreet()+",Strada:"+getCity()+",numarul: "+getNumber());
    } 
    
}
