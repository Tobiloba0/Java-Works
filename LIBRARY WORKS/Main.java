public class Main{
    public static void main(String[]args){
    Library library  = new Library();
    
    Book book1 = new Book("Adventures of Tom Sawyer", "Mak Twain");
    Book book2 = new Book("Ben Hur", "Lewis Wallace");
    Book book3 = new Book("Time Machine", "H.G. Wells");
    Book book4 = new Book("Anna Keranina", "Leo Tolstoy");

    library.addBook(book1);
    library.addBook(book2);   
    library.addBook(book3);    
    library.addBook(book4);

    System.out.println("Books in library.");
    
        for(Book book : library.getBooks()){
            System.out.println(book.getTitle() + " by " + book.getAuthor());    
        }
    
        library.removeBook(book2);
    
        for(Book book : library.getBooks()){
            System.out.println(book.getTitle() + " by " + book.getAuthor());    
        }
        
        System.out.println(library.getBookByTitle("Time Machine"));
        
        
    }

}
