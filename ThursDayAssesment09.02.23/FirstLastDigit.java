package assignment;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int num,temp,last_digit=0,first_digit=0;
		System.out.println("Enter the number: ");

		num=sc.nextInt(); 

		temp=num;
		
		last_digit=num%10;

		System.out.println("The last digit is:"+last_digit);

		for(;num>=10;)

		{
	num=num/10;
	first_digit=num;

		}

		System.out.println("The first digit is:"+first_digit);


	}
}
