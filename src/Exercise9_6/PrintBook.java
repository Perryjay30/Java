package Exercise9_6;

public class PrintBook extends Book {
    private String publisher;
    private int ISBN;

    public PrintBook(String title, int yearOfPublication, String author, String publisher, int ISBN) {
        super(title, yearOfPublication, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Publisher: " + publisher + "\n" +
                "ISBN: " + ISBN;
    }
}
