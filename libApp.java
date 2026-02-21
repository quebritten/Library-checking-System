import java.util.ArrayList;
import java.util.Scanner;
public class libApp {
        public static void Menu(){
            libSys library = new libSys();//libSys is combined arraylist of members and book
            library.setBooks(fileManager.loadBooks());
            library.setMembers(fileManager.loadMembers());
            Scanner scanner = new Scanner(System.in);

            int choice = 0;

            do{
                System.out.println("---MENU---");
                System.out.println("1.Add book to cart");
                System.out.println("2.Remove book from cart");
                System.out.println("3.Add member");
                System.out.println("4.Borrow book");
                System.out.println("5.Return book");
                System.out.println("6.Search book");
                System.out.println("7.Display checked out books");
                System.out.println("8. Exit");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid option");
                scanner.next();
            }
            choice= scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Selected option 1: ");
                    System.out.println("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    //prompts to find book
                    library.addBook(new Book(title, author, isbn));
                    System.out.println("Book added to cart!");
                    break;
                //add book to users "library"cart
                case 2:
                    System.out.println("Selected option 2: ");
                    System.out.println("Enter ISBN to remove from cart!: ");
                    String removeIsbn = scanner.nextLine();
                    //enter params to find book
                    library.removeBook(removeIsbn);
                    System.out.println("Book removed from cart!");
                    break;
                //remove book exit
                case 3:
                    System.out.println("Selected option 3: ");
                    System.out.println("Enter Member name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Member's ID: ");
                    String memberID = scanner.nextLine();
                    //take member params
                    library.registerMember(new member(name, memberID));
                    System.out.println("Member added!");
                    break;//add
                case 4:
                    System.out.println("Selected option 4: ");
                    System.out.println("Enter MemberID: ");
                    String borrowID = scanner.nextLine();
                    System.out.println("Enter ISBN to check out: ");
                    String borrowIsbn = scanner.nextLine();
                    //params to checkout
                    library.borrowBook(borrowID, borrowIsbn);
                    System.out.println("Have a nice day!");
                    break;//
                case 5:
                    System.out.println("Selected option 5: ");
                    System.out.println("Selected option 4: ");
                    System.out.println("Enter MemberID: ");
                    String returnID = scanner.nextLine();
                    System.out.println("Enter ISBN to check out: ");
                    String returnIsbn = scanner.nextLine();
                    //params to return book
                    library.returnBook(returnID, returnIsbn);
                    System.out.println("Have a nice day!");
                    break;
                case 6:
                    System.out.println("Selected option 6: ");
                    System.out.println("Enter ISBN to search: ");
                    String searchIsbn = scanner.nextLine();
                    //param to find book
                    Book found = library.searchBookByISBN(searchIsbn);
                    //if book in database adds it to a list
                    if (found != null)
                        System.out.println(found + ": is available");
                    else
                        System.out.println("Book not found");
                    break;//if finds anything show it;nothing not there
                case 7:
                    System.out.println("Selected option 7: ");
                    library.displayBooks();
                    break;
                case 8:
                    fileManager.saveBooks(library.getBooks());
                    fileManager.saveMembers(library.getMembers());
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option");
            }//end switch
            }while(choice!=8);//end while
            scanner.close();
        }//end do
}//end all

    /**This contains:
 •	Scanner
 •	Menu loop
 •	User input
 •	Calls to Library methods

menu
 1. Add Book
 2. Remove Book
 3. Register Member
 4. Borrow Book
 5. Return Book
 6. Search Book
 7. Display All Books
 8. Exit
 **/

