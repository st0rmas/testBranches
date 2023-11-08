public class Book {
    private String name;
    private String bookName;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(String name, String bookName) {
        this.name = name;
        this.bookName = bookName;
    }
}
