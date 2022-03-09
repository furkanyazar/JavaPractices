import java.util.Comparator;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) throws Exception {
        Book book1 = new Book("Pride and Prejudice", 345, "Jane Austen");
        Book book2 = new Book("Crime and Punishment", 671, "Fyodor Dostoyevski");
        Book book3 = new Book("The Brothers Karamazov", 840, "Fyodor Dostoyevski");
        Book book4 = new Book("The Metamorphosis", 58, "Franz Kafka");
        Book book5 = new Book("The Count of Monte Cristo", 640, "Alexandre Dumas");

        TreeSet<Book> books = new TreeSet<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books)
            System.out.println("Book: " + book.getName() + " Page: " + book.getPageNumber());

        System.out.println();

        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        }.reversed());

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        for (Book book : books2)
            System.out.println("Book: " + book.getName() + " Page: " + book.getPageNumber());
    }

}
