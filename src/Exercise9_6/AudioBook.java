package Exercise9_6;

public class AudioBook extends Book {
    private String bookSize;
    private String playLength;
    private String playbackArtistName;


    public AudioBook(String title, int yearOfPublication, String author, String bookSize, String playLength, String playbackArtistName) {
        super(title, yearOfPublication, author);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.playbackArtistName = playbackArtistName;
    }

    public String getBookSize() {
        return bookSize;
    }

    public String getPlayLength() {
        return playLength;
    }

    public String getPlaybackArtistName() {
        return playbackArtistName;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Book Size: " + bookSize + "\n" +
                "Play Length: " + playLength + "\n" +
                "Playback Artist Name: " + playbackArtistName;
    }
}
