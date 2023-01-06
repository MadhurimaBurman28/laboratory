package bookmanagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookService bService =new BookService();
		
		do {
			System.out.println("Welcome to Book Management System");
			System.out.println("1)Create Book Details.\n"
					+ "2)Get Book Details Using ID.\n"
					+"3)Get Book Details Using Book Name.\n"
					+"4)Get Book Details Using Book author Name.\n"
					+"5)Get All Book Details.\n"
					+"6)Exit.");
			
			System.out.println("======================");
			System.out.println("Enetr your choice:");
			 int ch =sc.nextInt();
			switch(ch)
			{
			case 1:
				bService.creatBook();
				System.out.println();
				break;
			case 2:
				bService.getBookDetailsUsingId();
				System.out.println();
				break;
			case 3:
				bService.getBookDetailsUsingBookName();
				System.out.println();
				break;
				
			case 4: 
				bService.getBookDetailsUsingBookAuthor();
				System.out.println();
				break;
			case 5:
				bService.getAllBookDetails();
				System.out.println();
			case 6:
				System.exit(0);
				default:
					System.out.println("Wrong Input!!");
			}
			
		} while(true);
	}

}
