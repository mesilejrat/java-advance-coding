package exercise28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise28 {
    static ArrayList<String> element = new ArrayList<>();
    public static void main(String[] args) {

        getEveryNthElement(2, 4);
        partOf(element);
        printArray(element.toArray(), "5" );
    }



    public static void getEveryNthElement(Integer startIndex, Integer skip) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sa elemente do vendosni? ");
        Integer numra = scanner.nextInt();
        System.out.println("Jepni elementet per te mbyshur ArrayListen: ");
        for (int i = 0; i < numra; i++) {
            element.add(scanner.next());
        }

        if (startIndex + skip + 1 > element.size()) {
            System.out.println("Elementi startindex eshte : " + element.get(startIndex) + " dhe nuk ka element pas " + skip + " elementesh.");
        } else
            System.out.println("Elementi i index " + startIndex + " eshte : *** " + element.get(startIndex) + " *** dhe elementi pas " + skip + " elementesh,eshte : " + element.get(startIndex + skip + 1));


    }

    public static  <T> void partOf(List<T> array){
        int count = 0;
        for (T elements : array){
            if(elements instanceof String){
                count++;
            }
        }
        System.out.println((((double) count/ (double) array.size())*100) + "%");
    }


    public  static <E> void printArray(E[] array, String item){
        Integer count =0;
        for (int i=0; i<array.length;i++){
            if (Integer.parseInt(String.valueOf(array[i])) ==  Double.parseDouble(item))
                count++;
        }
        System.out.println(count);
    }

}
