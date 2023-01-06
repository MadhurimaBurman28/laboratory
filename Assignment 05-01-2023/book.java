package bookmanagement;

public class Book {
	private int bookId;
	private String bookname;
	private String author;
	private double bookprice;
	
	
	
//getter setter method
	public int getBookId() {
		return bookId;
	}




	public void setBookId(int bookId) {
		this.bookId = bookId;
	}




	public String getBookname() {
		return bookname;
	}




	public void setBookname(String bookname) {
		this.bookname = bookname;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public double getBookprice() {
		return bookprice;
	}



  //constructor using fields
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public Book(int bookId, String bookname, String author, double bookprice) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.author = author;
		this.bookprice = bookprice;
	}
	//constructor using superclass
	public Book() {
		super();
	}
}
