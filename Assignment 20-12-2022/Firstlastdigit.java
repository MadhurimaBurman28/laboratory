package basic;

import java.util.Scanner;

public class Firstlastdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //ctrl+space after scanner to declaring object for scanner
		int num,temp,last_digit=0,first_digit=0;//declaring the variable to store the data
		System.out.println("Enter the number: ");
		num=sc.nextInt(); //scanning the number and storing it in num
		temp=num;// storing the num into temp
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
