import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<Book> bookList = new ArrayList<>();

        bookList.add(Book.History1);
        bookList.add(Book.History2);
        bookList.add(Book.History3);
        bookList.add(Book.History4);
        bookList.add(Book.History5);
        bookList.add(Book.History6);
        bookList.add(Book.History7);
        bookList.add(Book.History8);
        bookList.add(Book.History9);
        bookList.add(Book.History10);

        HashMap<String, String> booksAndAuthor = new HashMap<>();
        bookList.forEach(book -> booksAndAuthor.put(book.getName(), book.getAuthor()));

        List<Book> booksOver100Pages = bookList.stream().filter(t -> t.getPage() > 100).toList();

        booksAndAuthor.forEach((k, v) -> System.out.println("Book: " + k + "\tAuthor: " + v));
        System.out.println("--------------------");
        booksOver100Pages.forEach(t -> System.out.println(t.getName() + " has\t" + t.getPage() + " pages"));
    }

}
