package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookManager {


    List<Author> authors = new ArrayList<Author>();
    List<Book> books = new ArrayList<Book>();

    public void load() throws IOException {
        FileReader fd = new FileReader("/Users/dawitgebremichael/hcc/javaII/src/main/java/domain/book.txt");
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine(); //This read the first line

        Book book; //variable declaration


        boolean head = true;
        while (line != null) {

            if (head) {
                head = false;

            } else {
                String[] data = line.split(",");
                String[] splitData = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                System.out.println();
                book = new Book(splitData[1], splitData[2], Integer.parseInt(splitData[3]));
                books.add(book);
                String authorName = splitData[4].trim();
                Author author = getAuthorByName(authorName);
                if (author == null) {
//                    author = new Author(authorName, new ArrayList<>());
                    authors.add(author);
                }
                author.getBooks().add(book);


            }
            line = br.readLine();
        }


    }

    private Author getAuthorByName(String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getName().equalsIgnoreCase(authorName)) {
                return authors.get(i);
            }
        }
        return null;
    }

    private void searchAuthorByName(String authorName) {
        Author author = getAuthorByName(authorName);
        if (author == null) {
            System.out.println("Author not found");
        } else {
            System.out.printf("Author %s found", authorName);
            for (int i = 0; i < author.getBooks().size(); i++) {
                Book book = author.getBooks().get(i);
                System.out.printf("Book title: %s%nBook Genre: %s%nBook Page count:%d%n%n", book.getTitle(), book.getGenre(), book.getNumber_pages());
            }
        }
    }

    private Book getBookByTitle(String bookTitle) {
        for (int i = 0; i < authors.size(); i++) {
            Author author = authors.get(i);
            for (int j = 0; j < author.getBooks().size(); j++) {
                Book book = author.getBooks().get(j);
                if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                    return book;
                }
            }
        }
        return null;
    }

    private void searchByBookTitle(String bookTitle) {
        Book book = getBookByTitle(bookTitle);
        if (book == null) {
            System.out.println("Book Title not found");
        } else {
            System.out.printf("Book title: %s%nBook Genre: %s%nBook Page count: %d%n%n", book.getTitle(), book.getGenre(), book.getNumber_pages());
        }
    }

    private void test() throws FileNotFoundException {
        try {


            Integer num = Integer.parseInt("a22");
            FileReader fr = new FileReader("test.txt");


        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File doesn't exist");
        } catch (NumberFormatException e){
            throw new NumberFormatException("parsing error");
        }
    }

    public static void main(String[] args) throws IOException {
        BookManager bookManager = new BookManager();
        bookManager.load();
    }

}
