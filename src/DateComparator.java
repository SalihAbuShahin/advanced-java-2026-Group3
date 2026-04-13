import java.util.Comparator;

public class DateComparator implements Comparator<Book> {

    public int compare(Book b1, Book b2){
        return b1.getDate().compareTo(b2.getDate());
    }
}
