package arrayexamples;

import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		
				Scanner  sc=new Scanner(System.in);  //creating object of scanner
				System.out.println("Enter the size of array:");
				int s=sc.nextInt(); //taking the number of a array during run time
				int a[]=new int[s];  //declaring  an array
				int sum=0,evencount=0,oddcount=0,oddsum=0,evensum=0;//taking input
				
				
				System.out.println("Enter the elements  the array:");
				for (int i=0; i<a.length;i++) 
				{
					a[i]= sc.nextInt();
				}
				
				//finding odd or even and sum of them
				for (int i=0;i<a.length;i++)
				{
					if (( ( a[i] %2)==0))
					{
						evencount= evencount+1;
						evensum= evensum+a[i];
					
					}
				
					else
					{
						oddcount=oddcount+1;
						oddsum=oddsum+a[i];
						
					}
				}
					
					for (int i=0;i<a.length;i++)
					{
					//total sum
					sum=sum+a[i];
				}
					System.out.println("Sum of all the elements of the array:"+ sum);
					System.out.println();
					//printing total even number and even sums
					System.out.println("Total even numbers="+evencount);
					System.out.println("Sum of even numbers="+evensum);
					System.out.println("----------------");
					//printing total odd numbers and odd sums
					System.out.println("Total odd Numbers="+oddcount);
					System.out.println("Sum of odd numbers="+oddsum);
			
				
				
	}
}
				

		

