public class Book{
    private String title;
    private String author;
    
    public Book(String title, String author){
      this.title = title;
      this.author = author;
    }

    public void setTitle(String Title){
      this.title = title;   
    }
    
    public String getTitle(){
      return title;    
    }
    
     public void setAuthor(String Author){
      this.author = author;   
    }
    
    public String getAuthor(){
      return author;    
    }
    @Override    
    public String toString(){
    return "Title: " + title + ", Author: " + author;
    
    }

}
