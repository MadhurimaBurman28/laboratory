package basic;

import java.util.Scanner;

public class calculatormuldiv {
	public static int multiplication(int a,int b) {
				int result= a*b;
				return result;
			}
			public static float division(float a, float b) {
				float c = a/b;
				return c;
				}

		public static void main(String[] args) {
			int choice,num1,num2,res;
			float num3, num4,result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Which operation do you want to perform");
			System.out.println("1) multiplication\n2) division");
			choice= sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter first digit:");
				num1= sc.nextInt();
				System.out.println("Enter second digit:");
				num2=sc.nextInt();
				res= calculatormuldiv.multiplication(num1,num2);
				System.out.println(num1+" * "+num2+" = "+res);
				break;
			case 2:
				System.out.println("Enter first digitr:");
				num3=sc.nextFloat();
				System.out.println("Enter  second digit:");
				num4=sc.nextFloat();
				result=calculatormuldiv.division(num3, num4);
				System.out.println(num3+"/"+num4+"="+result);
				break;
		
				
			}
		}

	}


	

	

