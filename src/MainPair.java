import java.util.ArrayList;
import java.util.Collections;

public class MainPair {

    public static void main(String[] args) {
        ArrayList<Pair<Integer,String>> arr = new ArrayList<>();
        arr.add(new Pair<>(4, "Hello"));
        arr.add(new Pair<>(8, "world"));
        arr.add(new Pair<>(12, "how"));
        arr.add(new Pair<>(1, "are"));
        arr.add(new Pair<>(12, "you?"));
        System.out.println(arr.contains(new Pair<>(8, "how")));
        System.out.println(arr.contains(new Pair<>(12, "how")));
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);






    }
}
