package Book;

public class Book {
    private String title;
    private String genre;
    private String author;
    private int yearOfPublishing;
    private int numberOfPages;
    Book(){}
    Book(String title, String genre, String author, int yearOfPublishing, int numberOfPages){
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\ngenre: " + genre
                + "\nauthor: " + author + "\nthe year of publishing: " + yearOfPublishing
                + "\nnumber of pages: " + numberOfPages;
    }
}
