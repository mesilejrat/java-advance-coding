package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class Storage1 {
    private Map<String, List<String>> stringListMap;
    public Storage1(){
        stringListMap = new HashMap<>();
    }

    public void  addToStorage(String key, String value){
        List<String> values = new ArrayList<>();

        if(stringListMap.containsKey(key)) {
            values = stringListMap.get(key);
        }

        values.add(value);
        stringListMap.put(key, values);
    }

    public void printValues(String key){
        if(stringListMap.containsKey(key)) {
            System.out.println(stringListMap.get(key).toString());
        } else{
            System.out.println("Key" + key + " nuk eshte ne mapin e programit tone");
        }

    }

    public void findValues(String value){
        for(Map.Entry<String,List<String>> element: stringListMap.entrySet()){
            List<String> elementValue = element.getValue();
            if(elementValue.contains(value)){
                System.out.println(element.getKey());
            }
        }
    }
}
