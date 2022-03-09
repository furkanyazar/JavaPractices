public class Book implements Comparable<Book> {

    private final String name;
    private final int pageNumber;
    private final String writerName;

    public Book(String name, int pageNumber, String writerName) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

}
