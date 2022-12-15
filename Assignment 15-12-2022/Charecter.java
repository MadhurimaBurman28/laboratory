package basic;

import java.util.Scanner;

public class Charecter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter a charecter:");
		c=sc.next().charAt(0);
		if((c>='a'&& c<='z')||(c>='A'&&c<='Z')) {
			System.out.println("The charecter is an Alphabet");
		}
		else if (c>='0'&&c<='9') {
			System.out.println("The Charecter is a Digit");
		}
		else {
			System.out.println("The charecter is a Special Chrecter");
		}
		
	}
	

}
