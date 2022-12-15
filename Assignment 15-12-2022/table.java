package basic;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int  i,j,result;
         j=sc.nextInt();
         for(i=0;i<=10;i++)
         {
        	 result=j*i;
        	 System.out.println(j+"*"+i+"="+result);
         }
         
	}

}
