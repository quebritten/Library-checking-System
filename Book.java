

public class Book {
    //fields
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    /**
     * Responsibility:
     * Represents a single book.
     * Methods:
     * public void borrowBook()
     * public void returnBook()
     * public boolean isBorrowed()
     * public String toString()
     **/
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed=false;
    }//end book constructor

    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed=true;
            System.out.println(title+ " has been borrowed.");
        }else{
            System.out.println(title+ " has already been borrowed.");
        }
    }

    public void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println(title+ " has been returned.");
        }else{
            System.out.println(title+ " unable to return.");
        }

    }//end return book

    public boolean isBorrowed(){
     return isBorrowed;
    }
    public void setBorrowed(boolean status){
        isBorrowed=status;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return title+" by "+author+ " | ISBN: "+isbn;
    }

}//end book class
