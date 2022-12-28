package abstraction;

 interface GovInstitute{
	 void display();
	 void govcollege();
 }
 
 interface PrivateInstitute{
	 void display ();
	 void privatecollege();
 }

 
class Institutes implements GovInstitute, PrivateInstitute{

	@Override
	public void display() {
		System.out.println("There are so many colleges in West Bengal");
		
	}


	@Override
	public void privatecollege() {
		System.out.println("1)Private collge");
		
	}

	@Override
	public void govcollege() {
		System.out.println("2)Goverment collge");
	}

	
}
 class University extends Institutes{
	  public void university() {
		  System.out.println("There are 33 Universities in WestBengal");
	  }
 }



public class HybridInheritance {

	public static void main(String[] args) {
		University university= new University();
		university.university();
		university.display();
		university.govcollege();
		university.privatecollege();

	}

}
