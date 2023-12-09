package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private static Map<String, List<String>> map = new HashMap<>();

    public Storage(Map map){
        this.map = map;
    }

    public static void addToStorage(String key,String value)
    {
        List<String> values = new ArrayList<>();
        if(map.containsKey(key)){ // ky key qe ne kemi ekziston dhe ne i bejme update
            values = map.get(key);
            values.add(value);

        } else{
            //ndersa kur key nuk gjendet brenda mapit atehere ne nuk e kemi si key dhe duhet
            //ta vendosim
            values.add(value);
        }
        map.put(key,values);
    }

    public static void printValues(String key){
       if(map.containsKey(key)){
           System.out.println(key);
       } else{
           System.out.println("Key " + key + " nuk ekziston ne mapin e programit tone");
       }
    }
    public static void findValues(String value){
        for (Map.Entry<String, List<String>> i: map.entrySet()){
            if(i.getValue().contains(value)){
                System.out.println(i.getKey());
            }
        }
    }

    public static void main(String[] args) {
        addToStorage("1","Mercedes");
        addToStorage("2","Audi");
        addToStorage("1","Golf");
        addToStorage("1","Toyota");
        addToStorage("5","Porsche");
        addToStorage("6","Fiat");
        addToStorage("7","Renault");
        System.out.println("Printo elementin me key 4: ");
        printValues("4");
        System.out.println("Printo key qe kane vleren Fiat: ");
        findValues("Golf");
    }

}
