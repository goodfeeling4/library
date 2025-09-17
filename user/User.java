// ===============================
// Library Management System - Code Flow & OOP Usage
//
// 1. LibraryMain (main class):
//    - Shows interactive menu for user actions (add book/user, issue/return, view lists).
//    - Uses Scanner for input and calls Library methods for logic.
//
// 2. Library (management/Library.java):
//    - Aggregates (has) lists of Book and User objects.
//    - Methods: addBook, addUser, issueBook, showBooks, showUsers, getBooks, showUsers, showBooks.
//    - Encapsulation: private fields, public methods.
//    - Uses polymorphism when calling user.getRole().
//
// 3. Book (models/Book.java):
//    - Encapsulates book data (title, author, issued).
//    - toString() override for display (polymorphism).
//
// 4. User (models/User.java):
//    - Abstract class (abstraction), base for Student/Faculty.
//    - Encapsulates user data (name, userId).
//    - Abstract method getRole() (must be implemented by subclasses).
//
// 5. Student & Faculty (models/Student.java, Faculty.java):
//    - Inherit from User (inheritance).
//    - Implement getRole() (polymorphism).
//
// Usage Example:
//    - User chooses 'Add Book' -> LibraryMain calls lib.addBook(new Book(...))
//    - User chooses 'Add User' -> LibraryMain creates Student/Faculty and calls lib.addUser(...)
//    - User chooses 'Issue Book' -> LibraryMain calls lib.issueBook(...)
//    - User chooses 'Return Book' -> LibraryMain finds book in lib.getBooks() and sets issued=false
//    - User chooses 'Show Users' -> LibraryMain calls lib.showUsers(), which uses polymorphism for getRole()
// ===============================
package library.user;

public abstract class User {//Abstract class (abstraction), base for Student/Faculty.
    private String name;
    private int userId;
    //setter
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getUserId() {
        return userId;
    }

    //abstract 
    public abstract String getRole();
      public String toString() {
        
        return "ID: " + userId + ", Name: " + name + ", Role: " + getRole();
    }
}
