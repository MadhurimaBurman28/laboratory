package arrayexamples;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int s=sc.nextInt();
		int arr1[]=new int[s];
	
		//taking the elements of arrays
		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<s;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		
		int[] copyarr1=new int [arr1.length]; //copying arr1 to copyarra1
		
			System.out.println("copy arrays are=");
		for (int i=0;i<arr1.length;i++)
		{
			
			 copyarr1[i]= arr1[i]; 
			
		}
		for (int i=0;i<arr1.length;i++)
		System.out.println(copyarr1[i] );
		
		}

}
