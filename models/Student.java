package library.models;

public class Student extends User {
    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
