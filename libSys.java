import java.util.ArrayList;
/*
   Core Methods:
     Book Methods

   public void addBook(Book book)
   public void removeBook(String isbn)
   public Book searchBookByISBN(String isbn)
   public void displayAllBooks()
Member Methods

   public void registerMember(Member member)
   public Member findMember(String memberId)
Borrow / Return

   public void borrowBook(String memberId, String isbn)
   public void returnBook(String memberId, String isbn)
       **/
public class libSys {

  //  Fields:
    private ArrayList<Book> books;
    private ArrayList<member> members;
public libSys(){
    books=new ArrayList<>();
    members=new ArrayList<>();
}

public void addBook(Book b){
    books.add(b);//single book given(b) then added to arraylist books
}

public void removeBook(String isbn){
    books.removeIf(b -> b.getIsbn().equals(isbn));
}

public Book searchBookByISBN(String isbn){
    for(Book b:books){
        if(b.getIsbn().equals(isbn))
            return b;
    }
    return null;
}

public void displayBooks(){
    for(Book b:books){
        System.out.println(b);
    }
}
public void registerMember(member member){
    members.add(member);
}
public member findMember(String memberID){
    for(member m: members){
        if(m.getMemberID().equals(memberID))
            return m;
    }
    return null;
}

public void borrowBook(String memberID, String isbn){
    member m=findMember(memberID);
    Book b=searchBookByISBN(isbn);

    if(m==null){
        System.out.println("Member not found.");
        return;
    }
    if(b==null){
        System.out.println("Book not found.");
        return;
    }
    m.borrowBook(b);
    b.setBorrowed(true);
}

public void returnBook(String memberID, String isbn){
    member m=findMember(memberID);
    Book b=searchBookByISBN(isbn);
    if(m!=null && b!=null& b.isBorrowed()){
        m.returnBook(b);
        b.setBorrowed(false);
    }
}
    public ArrayList<Book> getBooks(){
    return books;
}
    public ArrayList<member> getMembers(){
    return members;
}
    public void setBooks(ArrayList<Book> books){
    this.books = books;
}
    public void setMembers(ArrayList<member> members){
    this.members = members;
}
}//end all
