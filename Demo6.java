import java.util.ArrayList;
public class Book{
    private String title;
    private String author;
    private String ISBN;

    private static ArrayList<Book> booksCollection = new ArrayList<Book>();

    public Book(String title, String author, String ISBN){
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    
    }
    
    public String getTitle(){
    return title;
    }
    
    public void setTitle(String title){
    this.title = title;    
    }

    public void setAuthor(String author){
    this.author = author;
    }
    
    public String getAuthor(){
    return author;
    }

    public void setISBN(String ISBN){
    this.ISBN = ISBN;    
    }
    
    public String getISBN(){
    return ISBN;    
    }

    public static void addBook(Book book){
    booksCollection.add(book);    
    }

    public static void removeBook(Book book){
    booksCollection.remove(book);
    }

    public static ArrayList<Book> getBookCollection(){
    return booksCollection;    
    }
    @Override
    public String toString(){
    return title + " " + author + " " + ISBN;    
    }



}

public class Demo6{
    public static void main(String[]args){
    
    Book book1 = new Book("Monstar", "Tobi", "849848585NUY");
    Book book2 = new Book("Kole the Hero", "Femi", "555548585NUY");

    Book.addBook(book1);
    Book.addBook(book2);
        
    ArrayList<Book> booksCollection = Book.getBookCollection();

    for(Book book : booksCollection){
        System.out.println(book);
    
    }
    }


}
