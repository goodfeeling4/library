
package library;

import library.models.*;
import library.user.Faculty;
import library.user.Student;
import library.user.User;
import library.management.*;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library(); // instense creation
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Add DVD");
            System.out.println("4. Add Magazine");
            System.out.println("5. Show Books");
            System.out.println("6. Show Users");
            System.out.println("7. Show DVDs");
            System.out.println("8. Show Magazines");
            System.out.println("9. Issue Book");
            System.out.println("10. Return Book");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    lib.addBook(new Book(title, author));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    // addUser
                    System.out.print("Enter type of user (1 - Student, 2 - Faculty): ");
                    int userType;
                    try {
                        userType = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                        break;
                    }
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter user ID (integer): ");
                    int userId;
                    try {
                        userId = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid user ID.");
                        break;
                    }
                    User user = null;
                    if (userType == 1) {
                        user = new Student(name, userId);// student instense created
                    } else if (userType == 2) {
                        user = new Faculty(name, userId); // faculty instense created
                    } else {
                        System.out.println("Invalid type of user ."); // invalid type of user
                        break;
                    }
                    lib.addUser(user);
                    System.out.println("User added successfully.");
                    break;
                case 3:// add dvd
                    System.out.println("Enter DVD title: ");
                    String dvdTitle = scanner.nextLine();
                    System.out.println("Enter DVD director: ");
                    String dvdDirector = scanner.nextLine();
                    lib.addDVD(new DVD(dvdTitle, dvdDirector));
                    System.out.println("DVD added successfully.");
                    break;
                case 4: // add magazine
                    System.out.println("Enter Magazine title: ");
                    String Title = scanner.nextLine();
                    System.out.println("Enter Magazine publisher: ");
                    String magPublisher = scanner.nextLine();
                    lib.addMagazine(new Magazine(Title, magPublisher));
                    System.out.println("Magazine added successfully.");
                    break;

                // showBooks
                case 5:
                    System.out.println("\nLibrary Books:");
                    lib.showBooks();
                    break;
                // showUsers
                case 6:
                    System.out.println("\nLibrary Users:");
                    lib.showUsers();
                    break;
                case 7: // showDVDs
                    System.out.println("\nLibrary DVDs:");
                    lib.showDVDs();
                    break;
                case 8: // showMagazines
                    System.out.println("\nLibrary Magazines:");
                    lib.showMagazines();
                    break;
                case 9: // issueBook
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    int issueUserId;
                    try {
                        issueUserId = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid user ID.");
                        break;
                    }
                    lib.issueBook(issueTitle, issueUserId);
                    break;
                case 10: // returnBook
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book book : lib.getBooks()) {
                        if (book.getTitle().equals(returnTitle) && book.isIssued()) {
                            book.setIssued(false);
                            System.out.println("Book returned successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found or not issued.");
                    }
                    break;
                case 11: // exit
                    running = false;
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
