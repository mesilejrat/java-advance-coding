package exercise14;
import java.util.*;
import java.util.stream.Collectors;

public class Ushtrimi14 {
    private static Integer[] myArray = new Integer[10];
    private static Random random = new Random();
    private static Integer bound = 3;

    public static void main(String[] args) {
        populateArray();
        System.out.println("List of unique elements:");
        listOfUniqueElements();
        System.out.println("Elements repeated at least once:");
        findDuplicates();
        System.out.println("25 most frequent elements:");
        kMostFrequent(25);
        System.out.println("Deduplicate items:");
        deduplicateItems();

    }

    private static void deduplicateItems() {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < myArray.length; i++) {
            if (!uniqueSet.add(myArray[i])) {
                myArray[i] = getRandomUniqueElement(uniqueSet);
            }
        }

        Arrays.asList(myArray).forEach(System.out::println);
    }

    private static int getRandomUniqueElement(Set<Integer> uniqueSet) {
        int replacement;
        do {
            replacement = random.nextInt(bound);
        } while (uniqueSet.contains(replacement));
        return replacement;
    }

    public static void populateArray() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(bound);
        }
    }

    public static void listOfUniqueElements() {
        Set<Integer> uniqueElements = new HashSet<>(Arrays.asList(myArray));
        uniqueElements.forEach(System.out::println);
    }

    public static void findDuplicates() {
        Map<Integer, Long> frequencyMap = Arrays.stream(myArray)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        Map<Integer, Long> frequency = new HashMap<>();
        for (int i = 0; i< myArray.length; i++){
            if(frequency.containsKey(myArray[i])){
                Long value = frequency.get(myArray[i]);
                value += 1L;

                frequency.put(myArray[i], value);
            } else {
                frequency.put(myArray[i], 0L);
            }
        }
        frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        for (Map.Entry<Integer, Long> pair : frequencyMap.entrySet()){
            if(pair.getValue() > 1) {
                System.out.println(pair);
            }
        }
    }

    public static void kMostFrequent(int k) {
        Map<Integer, Long> frequencyMap = Arrays.stream(myArray)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        frequencyMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(k)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        int i =1;
        for (Map.Entry<Integer, Long> pair : frequencyMap.entrySet()){
            if(i <= 25) {
                System.out.println(pair);
                i++;
            }
        }
    }
}