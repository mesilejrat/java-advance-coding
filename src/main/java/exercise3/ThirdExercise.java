package exercise3;

import java.util.HashMap;
import java.util.Scanner;

//Create a method that takes the map as a parameter,
// where the key is string and the value number,
// and then prints each map element to the console in the format:
// Key: , Value: .
// There should be a comma at the end of every line except the last, and a period at the last.
// Example:
// Key: Java, Value: 18,
// Key: Python, Value: 1,
// …
// Key: PHP, Value: 0.
public class ThirdExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap < String,Integer> map = new HashMap<String,Integer>();
        System.out.println("Put the length of the map ");
        int length = in.nextInt();
        for(int i =0 ; i<length; i++){
            String key = "";
            System.out.println("Put key");
            key = in.next();
            Integer value ;
            System.out.println("Put value");
            value = in.nextInt();
            map.put(key , value);
        }
        afishoMapin(map);
    }

    private static void afishoMapin(HashMap<String, Integer> map) {
        int i = 0;
        for (HashMap.Entry<String, Integer> x: map.entrySet()) {
            String k = x.getKey();
            Integer v = x.getValue();
            System.out.print("\n"+"key: " + k + ", value: " + v);

            if(i == map.entrySet().size()-1) {
                System.out.print(".");
            }
            else System.out.print(",");
            i++;
        }
    }
}
