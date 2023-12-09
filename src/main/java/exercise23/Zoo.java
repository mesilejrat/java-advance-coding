package exercise23;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
    private Map<String, Integer> animalsMap;

    public Zoo() {
        this.animalsMap = new HashMap<>();
    }

    public void addAnimals(String animalName, int numberOfAnimals) {
        if(animalsMap.containsKey(animalName)){
            Integer animalNumber = animalsMap.get(animalName);
            animalNumber += numberOfAnimals;
            this.animalsMap.put(animalName,animalNumber);
        } else {
            this.animalsMap.put(animalName, numberOfAnimals);
        }

    }

    public Map<String, Integer> getAnimalByName(String name) {
        Map<String, Integer> animalCount = new HashMap<>();
        for (String animal : animalsMap.keySet()) {
            String animalName = animal.toString();
            int animalNum = animalsMap.get(animalName);
            if (animalName.equals(name)) {
                animalCount.put(animalName, animalNum);
            }
        }
        return animalCount;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return animalsMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,((integer, integer2) -> integer), LinkedHashMap::new));
    }

    public Integer getNumberOfAllAnimals() {
        Integer count = 0;
        for (int animal : animalsMap.values()) {
            count += animal;
        }
        return count;
    }
}
