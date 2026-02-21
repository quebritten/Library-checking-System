import java.util.ArrayList;

public class member {
    /**Responsibility:
     Represents a library member.


     public void borrowBook(Book book)
     public void returnBook(Book book)
     public String getMemberId()
     public String toString()
     **/
    private String name;
    private String memberID;
    private ArrayList<Book> borrowedBooks;

    public member(String name, String memberID){
        this.name=name;
        this.memberID=memberID;
        this.borrowedBooks=new ArrayList<>();
    }
    public void borrowBook(Book book){
     //add to borrowed books array
        if(!book.isBorrowed()) {
            borrowedBooks.add(book);
            book.setBorrowed(true);
            System.out.print(book.getTitle()+"Has been borrowed");
        }else
            System.out.print("Book is already borrowed");
    }//emd borrow book

    public void returnBook(Book book){
       //take from borrowed book array
        if(book.isBorrowed()) {
            borrowedBooks.remove(book);
            book.setBorrowed(false);
            System.out.print(book.getTitle()+"Has been returned");
        }else{
            System.out.print("Book is available");
        }
    }

    public String getMemberID(){
        return memberID;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "User: " + name + " (ID: " + memberID + ") | Checked out: " + borrowedBooks;
    }
}
