package abstraction;

import java.util.Scanner;

interface LibraryUser{
	Scanner sc= new Scanner(System.in);
	void registerAccount();
	void requestBook();
	
}


class KidUser implements LibraryUser{
	
	int age;
	String bookType;
	
	@Override
	public void registerAccount() {
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account.");
			System.out.println();
			}
		else
		{
			System.out.println("Sorry, Age must be less then 12 to register as a Kid. ");
			System.out.println();
		}
		
	}

	@Override
	public void requestBook() {
		System.out.println("Enter your booktype: ");
		bookType=sc.next();
		if(bookType.equalsIgnoreCase("kids"))
		{
			System.out.println("Book issued successfully,\nPlease return the book within 10 days.");
			System.out.println();
			
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books.");
			System.out.println();
		}
	}
	
}


class AdultUser implements LibraryUser
{
	int age;
	String bookType;

	@Override
	public void registerAccount() {
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age>=12)
		{
			System.out.println("You have successfully registered under an Adult Account.");
			System.out.println();
			}
		else
		{
			System.out.println("Sorry, Age must be greater then 12 to register as an Adult. ");
			System.out.println();
		}
		
	}

	@Override
	public void requestBook() {

		System.out.println("Enter your booktype: ");
		bookType=sc.next();
		if(bookType.equalsIgnoreCase("Fiction"))
		

		{
			System.out.println("Book issued successfully,\nPlease return the book within 7 days.");
			System.out.println();
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
			System.out.println();
		}
	}
		
	}
	

public class LibraryInterfaceDemo {

	public static void main(String[] args) 
	{
          Scanner sc=new Scanner(System.in);
		
		KidUser kid=new KidUser();
		AdultUser adult=new AdultUser();
		do
		{
		System.out.println("Welcome to the Library.");
		System.out.println("Which book you want to choose?? \n1)Kid \n2)Fiction \n3)Exit");
		int choice= sc.nextInt();
		switch (choice)
		{
		/*case 1:
			kid.registerAccount();
			kid.requestBook();
			break;
		case 2:
			adult.registerAccount();
			adult.requestBook();
			break;*/
		case 1:                                 //nested SwitchCase
			System.out.println("Choose an option:\n1)Resister \n2)Borrow");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				kid.registerAccount();
				break;
			case 2:
				kid.requestBook();
				break;
				
			}				System.out.println();		
			break;
		case 2:
			System.out.println("Choose an option: \n1)Resister \n2)Borrow");
			int chi=sc.nextInt();
			switch(chi) {
			case 1:
				adult.registerAccount();
				break;
			case 2:
				adult.requestBook();
				break;
			}				System.out.println();		
			break;

		case 3 :
			System.exit(0);
			default :
				System.out.println("Wrong Input!!");
			
		}

	}while (true);
}
}
