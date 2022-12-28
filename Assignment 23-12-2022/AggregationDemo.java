package oops;

class Company{
	int comId;
	String comName;
	Address address; //entity reference
	public Company (int comId, String comName, Address address) {
		super();
		this.comId=comId;
		this.comName=comName;
		this.address=address;
	}
	//getter method
	
public int getComId() {
		return comId;
	}
	public String getComName() {
		return comName;
	}
	public Address getAddress() {
		return address;
	}
}
public class AggregationDemo {
	

	public static void main(String[] args) {
		Address address1= new Address(70005,"Kolkata","WestBengal","INdia");
		Address address2=new Address(10005,"NewYork City","New York", "USA");
		
		
		Company company1=new Company(121, "Anudip Foundation", address1);
		Company company2=new Company(101, "AnudipFoundation", address2);
		
		
		System.out.println("First company Name:"+company1.getComName()+"\nCompany ID:" +  company2.getComId());
		System.out.println("Address:"+company1.getAddress().getCity());
		
		System.out.println();
		
		
		System.out.println("Second Company:" +company2.getComName()+ "\nCompany ID:"+    company2.getComId());
		System.out.println("Address:"+company2.getAddress().getCity());
	} 

}

