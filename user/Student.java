package library.user;
// inheritance from main user
public class Student extends User {
    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
