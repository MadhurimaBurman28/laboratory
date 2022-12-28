package abstraction;

import java.util.Scanner;


//concrete method
abstract class Vaccine{
	Scanner sc= new Scanner(System.in);
	 String citizen, name;
	 int age, price;
	 
	 
	 public void firstdose() 
	 {
		// sc.nextLine();
		 System.out.println("Please Enter your Name:  ");
		 name = sc.nextLine();
		 sc.nextLine();
		 System.out.println("Enter your Citizenship:  ");
		 citizen= sc.nextLine();
		 
		 if (citizen.equalsIgnoreCase("Indian"))
				 {
			 System.out.println("Enetr your age:  ");
			 age=sc.nextInt();
			 if (age>18){
				 System.out.println("Enter the price: ");
				 price=sc.nextInt();
				 
				 if (price==250) 
				 {
					 System.out.println("First Dose Vaccinated Successfully.");
				 }
				 else
				 {
					 System.out.println("Amount should be Rs.250.");
					 }
				 } 
			 else 
				 {
				 System.out.println("Age must be above 18 years.");
				 }
			 } 
		 else
		 {
			System.out.println("Only for Indian citizen. "); 
		 }
		 
	 }
	 
	 public void seconddose() 
	 {
		 System.out.println("First dose done??");
		 System.out.println("Select an option:\n1)Y \n2)N");
		 char c;
		 c=sc.next().charAt(0);
		 if ((c=='y')||(c=='Y'))
		 {
			 System.out.println("Has it been 90 days since your First Dose?? ");
			 System.out.println("Select an option: \nY \nN");
			  c=sc.next().charAt(0);
			 if ((c=='y')||(c=='Y'))
			 {
				 System.out.println("Enter The Amount:");
				 price=sc.nextInt();
				 if(price==300)
				 {
					 System.out.println("Second Dose Vaccinated successfully.");
					 }
				 else 
				 {
					 System.out.println("Amount should be Rs.300.");
					 }
				 }
			 else 
			 {
				 System.out.println("Please come after 90 days. \nThank You. ");
				 }
			 }
		 else
		 {
			 System.out.println("Please take the FirstDose at first.\nThank You. ");
			 }
		 }
	 //abstract method
	 abstract public void booster();	
}

class VaccinationSuccess extends Vaccine{

	@Override
	public void booster()
	{
		System.out.println("First dose and Second Dose both are done??");
		System.out.println("Select an option:\nY \nN");
		char c;
		c=sc.next().charAt(0);
		
		
		if ((c=='y')||(c=='Y'))
		{
		 System.out.println("Has it been 90days since your Second Dose?? ");
		 System.out.println("Please select an option: \nY \nN");
		  c=sc.next().charAt(0);
		  if ((c=='y')||(c=='Y'))
		  {
			  System.out.println("Enter the amount:");
			 price=sc.nextInt();
			 if(price==300)
			 {
				 System.out.println("Congratulattions!!  \nBooster Dose Vaccinated Successfully.");
				 }
			 else
			 {
				 System.out.println("Amount should be Rs.300");
				 }
			 }
		  else
		  {
			  System.out.println("Please come after this period. \nThank you.");
			  }
		}
		else
		{
			System.out.println("Please Come after getting the Second Dose.\nThank You.");
			}
		}
	}


public class Vaccination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		VaccinationSuccess vac =new VaccinationSuccess();
		
		
		do
		{
		System.out.println("Welcome to Vaccination Center ");
		System.out.println("1)First dose ,\n2)Second Dose,\n3)Third Dose , \n4)Exit");
		int choice= sc.nextInt();
		switch (choice)
		{
		case 1:
			vac.firstdose();
			System.out.println("-------------");
			
			break;
		case 2:
			vac.seconddose();
			System.out.println("--------------");
			break;
		case 3 :
			vac.booster();
			System.out.println("---------------");
			break;
		case 4:
			System.exit(0);
			default :
				System.out.println("Wrong Input!!");
			
		}
		} while (true);

	}

}
