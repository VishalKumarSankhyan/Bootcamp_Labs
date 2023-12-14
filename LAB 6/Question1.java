// Importing the ArrayList class from the java.util package.
import java.util.ArrayList;

// Book class with private fields bookId, bookName, and authorName
class Book{
    private int bookId;
    private String bookName;
    private String authorName;
    
    // Constructor to initialize the fields
    public Book(int bookId, String bookName, String authorName){
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    
    // Overriding toString() method to return a string representation of the object
    @Override
    public String toString(){
        return "[Book Id = " + bookId + ", Book Name = "+ bookName + ", Author Name = " + authorName + "]";
    }
}

public class Question1
{
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		// Creating two Book objects and adding them to the ArrayList
		Book book1 = new Book(101,"Let Us C","Yashvant P Kanitkar");
		Book book2 = new Book(102,"Head First Java","Kathy Sierra");
		bookList.add(book1);
		bookList.add(book2);
		
		// Iterating over the ArrayList and printing each Book object using its toString() method
		for(Book book : bookList){
		    System.out.println("Book "+ book);
		}
		
	}
}
