public class Book {
    private final String title;
    private final Author author;
    private int publishingYear;
    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
