import java.util.Date;

public class Reader {
    private String fullName;
    private int ticketNumber;

    private int className;
    private Date birthDate;

    private long phoneNumber;

    public void takeBook(int number){
        System.out.println(fullName + "take "+ number+ " books.");
    }
    public void takeBook(String... books){
        System.out.println(fullName + "take books: ");
        int counter=1;
        for(String book : books){
            System.out.println(counter + ". "+ book);
            counter++;
        }
    }
    public void takeBook(Book... books){
        System.out.println(fullName + "take books: ");
        int counter=1;
        for(Book book : books){
            System.out.println(counter + ". "+ book.getName()+ ", name: "+ book.getBookName());
            counter++;
        }
    }

}
