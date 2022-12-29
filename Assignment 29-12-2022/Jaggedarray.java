package arrayexamples;

import java.util.Scanner;

public class Jaggedarray {

	public static void main(String[] args) {
		int arr[][]=new int [3][];
		Scanner  sc= new Scanner (System.in);
		arr[0]=new int [3]; //1st row and 3 columns
		arr[1]=new int [4]; //2nd row and 4 columns
		arr[2]=new int [2];  //3rd row and 2 columns
		
		
		//initializing the jagged array
		//int count =0;
				System.out.println("Enetr the elements of jagged array:");
				for (int i=0;i<arr.length;i++)//row
				{
					for (int j=0;j<arr[i].length;j++)  //columns
					{
						arr[i][j]=sc.nextInt();
						//arr[i][j]=count++;					
						}
					}
			
		//printing jagged array
		System.out.println("jagged array");
		for (int i=0;i<arr.length;i++)//row
		{
			for (int j=0;j<arr[i].length;j++)  //columns
			{
				System.out.print(arr[i][j]+"  ");
				}
			System.out.println(); //new line
		}
	}
}
