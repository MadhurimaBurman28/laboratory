package basic;

import java.util.Scanner;

public class banktransfer {
	public static double Deposit(double a, double b) {
		double result=a+b;
		return result;
	}
	public static double Withdraw(double a, double b) {
		double c;
		if (a>b) {
			c=a-b;
			}
		else {
			c=b-a;
			}
		return c;
	}

	public static void main(String[] args) {
		double num1,num2,num3, num4, result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Which option you want to choice:");
		System.out.println("1)Deposit \n2)Withdraw");
		int choice= sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(" Enter your current balance:");
			num1= sc.nextDouble();
			System.out.println("Enter your deposited ammount:");
			num2=sc.nextDouble();
			result=banktransfer.Deposit(num1,num2);
			System.out.println("Your a/c XX6749 is credited for INR:" +result);
			break;
		case 2:
			System.out.println("Enter your current balance:");
			num3= sc.nextDouble();
			System.out.println("Enter your withdraw ammount:");
			num4=sc.nextDouble();
			result=banktransfer.Withdraw(num3 , num4);
			System.out.println("Your a/c XX6749 is debited INR:"+result);
			break;
			}
	}

}
