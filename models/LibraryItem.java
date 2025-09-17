package library.models;

public class LibraryItem {
    private String title;
    private String author;
    private boolean issued;
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
    }
    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    @Override // override is a command to tell to java that you are replacing method from supperclass
    public String toString() {
        return title + " by " + author + (issued ? " (Issued) \n" : " (Available) \n");
    }
}
