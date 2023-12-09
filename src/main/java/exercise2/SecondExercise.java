package exercise2;//Create a method that takes a string list as a parameter,
// then returns that list sorted alphabetically from Z to A case-insensitive.


import java.util.ArrayList;
import java.util.List;

public class SecondExercise {
    public static List<String> reverseIgnoreCase(List<String> list) {
        System.out.println("List elements before reversed order " + list + "\n");
        list.sort(String.CASE_INSENSITIVE_ORDER.reversed());
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
