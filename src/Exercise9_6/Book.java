package Exercise9_6;

public class Book {
    private String title;
    private int yearOfPublication;
    private String author;

    public Book (String title, int yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author =author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book Details: \n" +
                "Title: " + title + "\n" +
                "Year Of Publication: " + yearOfPublication + "\n" +
                "Author: " + author;
    }
}
