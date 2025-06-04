package week2.day1;

public class Library {
	
	public String addBook(String bookTitle){
		System.out.println("Book added Successfully");
		return bookTitle;
	}
	public String issueDate(String Date) {
		System.out.println("31.05.2025");
		return Date;
	}
public static void main(String[]args)
{
	 Library bookstatus=new Library();
	 bookstatus.addBook("bookTitle");
	 bookstatus.issueDate("Date");
	 
	}
}
