package oops;
public class Address {
	int pincode;
	String city, state, country;
	
	
	public Address() {
		super();
		
		
	}
	
	
	public Address(int pincode, String city, String state, String country) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
//getter method from source

	public int getPincode() {
		return pincode;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	
}


