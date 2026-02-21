import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class fileManager {
    /**
     * Use:
     * 	•	FileWriter
     * 	•	BufferedWriter
     * 	•	Scanner for reading
     * Save Format Example:
     * Books.txt
     *
     * Title|Author|ISBN|true
     * Members.txt
     *
     * Name|MemberID
     */
    public static void saveBooks(ArrayList<Book> books){
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("Books.txt"));

            for(Book b:books){
                //formatted title|author|isbn|borrowed or not
                bw.write(b.getTitle()+"|"+b.getAuthor()+"|"+b.getIsbn()+"|"+b.isBorrowed());
                bw.newLine();
            }
            bw.close();
            System.out.println("Books saved!");
        }catch(IOException e){
            System.out.println("Error saving books: "+e.getMessage());
        }
    }//end save book
    public static void saveMembers(ArrayList<member> members){
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("Members.txt"));

            for(member m:members){
                //formatted title|author|isbn|borrowed or not
                bw.write(m.getName()+"|"+ m.getMemberID());
                bw.newLine();
            }
            bw.close();
            System.out.println("Members saved!");
        }catch(IOException e){
            System.out.println("Error saving members: "+e.getMessage());
        }
    }
    public static ArrayList<Book> loadBooks(){
        ArrayList<Book> books =new ArrayList<>();
        try{
            File file=new File("Books.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()) {
                String line=scanner.nextLine();
                String[] parts=line.split("\\|");
                Book b =new Book(parts[0],parts[1],parts[2]);
                b.setBorrowed(Boolean.parseBoolean(parts[3]));
                books.add(b);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No saved books fouond, Creating new...");
        }//end catch
        return books;
    }
    public static ArrayList<member> loadMembers(){
        ArrayList<member> members =new ArrayList<>();
        try{
            File file=new File("Members.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()) {
                String line=scanner.nextLine();
                String[] parts=line.split("\\|");
                members.add(new member(parts[0],parts[1]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No saved members fouond, Creating new account");
        }//end catch
        return members;
    }
}//end all


