package basic;

import java.util.Scanner;

public class banktransfer {
	public static double deposit(double a, double b)
	{
		double result=a+b;
		return result;
	}
	public static double withdraw (double w, double b)
	{
		double c=0;                        //c=new balance
		if (b<=w)            //getting new balance b=Available Balance, w= Withdraw balance
		{
			c=b-w;            //getting new balance
			System.out.println("WithDraw Succesfull");
			System.out.println("Balance: "+c);
			}
		else {    //if withdraw amount greater than the balance
			System.out.println("Insufficient Balance:");
		}return c;
		}
	public static void main(String[] args)
	{
		double num1,num2,num3, num4, result;
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
			do
			{
			System.out.println("Which option you want to choose:");
			System.out.println("1)Deposit \n2)Withdraw \n3)Exit");
			choice= sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println(" Enter your Current balance: ");
				num1= sc.nextDouble();
				System.out.println("Enter your deposited amount: ");
				num2=sc.nextDouble();
				result=banktransfer.deposit(num1,num2);
				System.out.println("Your a/c XX6749 is credited for INR: " +result);
				break;
			case 2:
				System.out.println("Enter your current balance: ");
				num3= sc.nextDouble();
				System.out.println("Enter your withdraw amount: ");
				num4=sc.nextDouble();
				result=banktransfer.withdraw(num3 , num4);
				System.out.println("Your a/c XX6749 is debited INR: "+result);
				break;
			case 3:
				System.exit(0);
				default:
					System.out.println("Wrong Input!!");
				}
			
			} while(choice!=3);
		}
		}

}
