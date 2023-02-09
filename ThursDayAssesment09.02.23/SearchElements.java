package assignment;

import java.util.Scanner;

public class SearchElements {

	public static void main(String[] args) {
		 
				int s,i;
				Scanner sc= new Scanner (System.in);
				
				boolean flag =false;    
				System.out.println("Enetr size of array:");
				s=sc.nextInt();
				int ar[]= new int[s];
				System.out.println("enter "+ s+" elements");
				for(i=0;i<s;i++)
				{
					ar[i]=sc.nextInt();
					}
				System.out.println("Enetr which element you want to search:");
				int search=sc.nextInt();
				
				
				for(i=0;i<s;i++)
				{
					if(ar[i]==search)      
					{
						flag= true;     
						break;  
					}
				}
				
				if(flag==true)
				{
					System.out.println("The element "+ search+" is present in: "+ (i+1)+" position");
				}
				else
				{
					System.out.println("Data not found in array!");
				}
			}
	}


