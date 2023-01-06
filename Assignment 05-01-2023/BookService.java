package bookmanagement;

import java.util.Scanner;

public class BookService {
	
	static Book book[]=new Book[10];
	static Scanner sc= new Scanner(System.in);
	static int index=0;
	
	
	//create book method 
	public static  void creatBook()
	{
		System.out.println("Enter Book ID:");
		int id =sc.nextInt();
		
		sc.nextLine();                           //it will consume the next line
		System.out.println("Enter Book Name:");
		String bname=sc.nextLine();
		
		//sc.nextLine();
		System.out.println("Enter Author's Name:");
		String author= sc.nextLine();
		
		System.out.println("Enter Book Price:");
		double price =sc.nextDouble();
		
		book[index]= new Book(id,bname,author,price);
		index++;
		
		System.out.println("Book details added!!");
		}
	
	//get all book details
	public static void getAllBookDetails()
	{
		for (int i=0;i<index;i++)
		{
			System.out.println();
			System.out.println("Book ID          :"+book[i].getBookId());
			System.out.println("Book Name        :"+book[i].getBookname());
			System.out.println("Book Author Name :"+book[i].getAuthor());
			System.out.println("Book Price       :"+book[i].getBookprice());
			System.out.println("==========================================");
		}
	}
	
	//get book details using ID
	public static void getBookDetailsUsingId()
	{
		boolean flag=false;
		System.out.println("Enter Book ID to Search:");
		int id =sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if (id==book[i].getBookId())
			{
				System.out.println();
				System.out.println("Book ID          :"+book[i].getBookId());
				System.out.println("Book Name        :"+book[i].getBookname());
				System.out.println("Book Author Name :"+book[i].getAuthor());
				System.out.println("Book Price       :"+book[i].getBookprice());
				System.out.println("==========================================");
				flag=true;
				break;
				}
			}
		if(flag==false)
		{
			System.out.println("Book Not Found!! Please Try Again.");
			System.out.println("****************************************");
			}
		}

	//get book details using name
	public static void getBookDetailsUsingBookName() 
	{
		boolean flag1=false;
		System.out.println("Enter Book Name to Search:");
		sc.nextLine();
		String bname=sc.nextLine();
		for(int i=0;i<index;i++)
		{
			if(bname.equalsIgnoreCase(book[i].getBookname()))
			{
				System.out.println();
				System.out.println("Book ID          : "+book[i].getBookId());
				System.out.println("Book Name        : "+book[i].getBookname());
				System.out.println("Book Author Name : "+book[i].getAuthor());
				System.out.println("Book Price       : "+book[i].getBookprice());
				System.out.println("===========================================");
				flag1=true;
				break;
				}
		}
		
		if(flag1==false)
		{
			System.out.println("Book Not Found!! Please Try Again.");   //press enter two times
			System.out.println("****************************************");
			
			}
		}
	
	//getting book details by  author name
	public static void getBookDetailsUsingBookAuthor() 
	{
		boolean flag2=false;
		System.out.println("Enter Book Author Name to Search:");
		sc.nextLine();		
		String author=sc.nextLine();
		for(int i=0;i<index;i++)
		{
			if(author.equalsIgnoreCase(book[i].getAuthor()))
			{
				System.out.println();
				System.out.println("Book ID          : "+book[i].getBookId());
				System.out.println("Book Name        : "+book[i].getBookname());
				System.out.println("Book Author Name : "+book[i].getAuthor());
				System.out.println("Book Price       : "+book[i].getBookprice());
				System.out.println("===========================================");
				flag2=true;
				break;
				}
			}
		if(flag2==false)
		{
			System.out.println();
			System.out.println("Book Not Found!! Please Try Again.");   //press enter two times
			System.out.println("****************************************");
			}
		}
}
	
		
	

