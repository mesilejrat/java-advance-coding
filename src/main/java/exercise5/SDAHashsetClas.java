package exercise5;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*Exercise 5.
Implement the SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
• add
• remove
• size
• contains
• clear*/
public class SDAHashsetClas {
    // Adding elements
    public static void addElement(LinkedHashSet<String> map ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni numrin e elementeve :");
        int size=scanner.nextInt();
        System.out.println("Jepni elementin : " );
        for (int i=0 ; i<size;i++) {
            String element = scanner.next();
            map.add(element);
        }
        System.out.println(map);
    }
    //remove elemente
    public static void removeElement(LinkedHashSet<String> map){
        System.out.println("Vendosni elementin qe do hiqni : ");
        Scanner scanner = new Scanner(System.in);
        String element=scanner.nextLine();
        if (map.contains(element)){
            map.remove(element);
        }
        else System.out.println("Elementi nuk ndodhet ne HashSet");
        System.out.println(map);
    }
    //size
    public static void sizeOfHashSet(LinkedHashSet<String> map){
        System.out.println("Permasa e Hashset eshte : " + map.size());
    }
    //contain
    public static void containElement(LinkedHashSet<String> map){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vendosni elementin per te bere Check : ");
        String element=scanner.nextLine();
        if (map.contains(element)){
            System.out.println(true);
        }
        else System.out.println("Elementi nuk eshte ne HashSet!");

    }
    //clear
    public static void clearHashSet(LinkedHashSet<String> map){
        map = new LinkedHashSet<>();
        System.out.println("\nHashSet pas metodes clear :" + map);
    }

    //Main
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        addElement(hs);
        removeElement(hs);
        sizeOfHashSet(hs);
        containElement(hs);
        clearHashSet(hs);
    }


}
