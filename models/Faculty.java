package library.models;

public class Faculty extends User {
	public Faculty(String name, int userId) {
		super(name, userId);
	}

	@Override
	public String getRole() {
		return "Faculty";
	}
}
