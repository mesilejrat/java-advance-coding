package exercise6;

import java.util.Scanner;
import java.util.TreeMap;

public class Exercise6 {

    public static void main(String[] args) {
        TreeMap <Integer,String> treeMap = new TreeMap<>();
        populateTree(treeMap);
        firsLastTreeValue(treeMap);
    }

    private static void firsLastTreeValue(TreeMap< Integer,String> treeMap) {
        System.out.println("First: " + treeMap.firstEntry());
        System.out.println("Last: " + treeMap.lastEntry());
    }

    private static void populateTree(TreeMap< Integer,String> treeMap) {
        Scanner in = new Scanner(System.in);
        System.out.println("Put the length of the map ");
        int length = in.nextInt();
        for(int i =0 ; i<length; i++){
            System.out.println("Put key");
            Integer key = in.nextInt();
            System.out.println("Put value");
            String value  = in.next();
            treeMap.put(key , value);
        }
    }
}







