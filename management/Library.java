package library.management;

import library.models.*;
import library.user.User;

import java.util.ArrayList;

public class Library { //Library class (encapsulation) managing books and users.
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<DVD> dvds;
    private ArrayList<Magazine> magazines;
    public Library() { //List of books and users creation of instance.
        books = new ArrayList<>();
        users = new ArrayList<>();
        dvds = new ArrayList<>();
        magazines = new ArrayList<>();
    }
//    - Methods: addBook, addUser, issueBook, showBooks, showUsers, getBooks, showUsers, showBooks.
 
    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
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
            System.out.println(books);
    }

    public void showUsers() {
            System.out.println(users.toString());
    }
    public void showDVDs() {
            System.out.println(dvds.toString());
    }
    public void showMagazines() {
            System.out.println(magazines.toString());
    }
}
