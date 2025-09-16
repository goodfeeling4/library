package library.management;

import library.models.*;
import java.util.ArrayList;

public class Library { //Library class (encapsulation) managing books and users.
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() { //List of books and users creation of instance.
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
//    - Methods: addBook, addUser, issueBook, showBooks, showUsers, getBooks, showUsers, showBooks.
 
    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(String title, int userId) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book issued to user ID: " + userId);
                return;
            }
        }
        System.out.println("Book not available!");
    }


    public ArrayList<Book> getBooks() {
        return books;
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showUsers() {
        for (User user : users) {
            System.out.println(user.getRole() + ": " + user.getName() + " (ID: " + user.getUserId() + ")");
        }
    }
}
