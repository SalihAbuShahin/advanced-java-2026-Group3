import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainComparable {
    public static void main(String[] args) {
        /*
        String s1 = "Avi", s2 = "Ave", s3 = "Avy";

        System.out.println( s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println( (s1.compareTo(s2)));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.compareTo(s1));
        System.out.println(s1.compareTo(s3));

         */
        ArrayList<Person> lst = new ArrayList<>();
        lst.add(new Person(17,"Bob"));
        lst.add(new Person(15,"Malice"));
        lst.add(new Person(16,"Alice"));
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
        ArrayList<Integer> intLst = new ArrayList<>();
        intLst.add(5);
        intLst.add(-8);
        intLst.add(51);
        System.out.println(intLst);
        Collections.sort(intLst);
        System.out.println(intLst);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Thinking in Java", "Bruce Akel", 200, "15/5/2010"));
        books.add(new Book ("Activity Book", "Rony Oren", 150, "2/5/1990"));
        books.add(new Book ( "The Facebook Effect", "David Kirkpatrick", 290, "1/1/2010"));
        books.add(new Book("Windows 7 the missing manual", "David Pogue", 50, "7/7/2010"));
        books.add(new Book("Windows XP Pro: the missing manual", "David Pogue", 50, "7/7/2010"));
        System.out.println(books);
        Collections.sort(books,new TitleComparator());
        System.out.println(books);



    }
}
