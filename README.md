# LIBRARY MANAGEMENT SYSTEM
A Java console application for managing books, members, borrowing, returning, and persistent file storage.

PROJECT STRUCTURE
Book- Represents a single book with title, author, ISBN, and borrow state.
member- Represents a library member and their borrowed books list.
libSys- Core library logic that manages all books and members.
fileManager- Saves and loads books and members to and from text files.
libApp.java- Entry point that runs the interactive menu.

MENU OPTIONS
1. Add book to cart
2. Remove book from cart
3. Add member
4. Borrow book
5. Return book
6. Search book
7. Display all books checked out
8. Exit

FILE STORAGE
When you exit, your data is automatically saved to two files in the same folder.

Books.txt stores each book on one line in this format:
    Title|Author|ISBN|isBorrowed
    Example: The Hobbit|Tolkien|978-0261102217|false
Members.txt stores each member on one line in this format:
    Name|MemberID
    Example: Alice|M001

Members.txt stores each member on one line in this format:
    Name|MemberID
    Example: Alice|M001
