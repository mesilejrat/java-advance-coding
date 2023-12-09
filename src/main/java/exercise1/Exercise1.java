package exercise1;

import java.util.List;
import java.util.ArrayList;

/*
Shkruani nje aplikacion qe
krahason bashkesine e numrave tek me ate cift ne nje array qe vlerat e tij jepen nga perdoruesi
*/
public class Exercise1 {
    public static List<String> reverseIgnoreCase(List<String> list) {
        System.out.println("List elements before reversed order " + list + "\n");
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("List elements after reversed ignorin case" +list);
        return list;
    }

    public static void main(String[] args) {
        // ReverseCaseInsensitive reverseCaseInsensitive = new ReverseCaseInsensitive();
        List<String> list = new ArrayList<>();
        list.add("ast");
        list.add("bsz");
        list.add("Asa");
        list.add("Asy");
        reverseIgnoreCase(list);
    }
}
