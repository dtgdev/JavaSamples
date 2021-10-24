package domain;

public class Book {

    String title;
    String genre;
    int number_pages;


    public Book(String title, String genre, int number_pages) {
        this.title = title;
        this.genre = genre;
        this.number_pages = number_pages;
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

    public int getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(int number_pages) {
        this.number_pages = number_pages;
    }
}
