package basic;

import java.util.Scanner;

public class divisable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.println("The number is divisable by both 5 and 11");
		}
		else {
			System.out.println("The number is not divisable by 5 and 11");
		}
				
	}

}
