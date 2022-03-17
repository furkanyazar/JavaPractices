public enum Book {

    History1(100, 2012, "History1", "Abdullah"),
    History2(50, 2018, "History2", "Beril"),
    History3(300, 2015, "History3", "Canan"),
    History4(400, 2014, "History4", "Çağatay"),
    History5(50, 2016, "History5", "Deniz"),
    History6(600, 2017, "History6", "Emre"),
    History7(700, 2013, "History7", "Ferhat"),
    History8(80, 2019, "History8", "Gamze"),
    History9(900, 2020, "History9", "Hazal"),
    History10(1050, 2011, "History10", "İbrahim");

    private int page;
    private int year;
    private String name;
    private String author;

    private Book(int page, int year, String name, String author) {
        this.page = page;
        this.year = year;
        this.name = name;
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

}
