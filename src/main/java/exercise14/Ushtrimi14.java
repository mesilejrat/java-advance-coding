package exercise14;

import java.util.*;

public class Ushtrimi14 {
    private static Map<Integer, Integer> repeatedElements = new HashMap<Integer, Integer>();
    private static Integer[] myArray = new Integer[100];
    private static Random random = new Random();
    private static Integer bound = 30;
    private static ArrayList<Integer> duplicateArrayList = new ArrayList<>();

    public static void main(String[] args) {
        fillRetunUniqeNrOnMyArray();
        System.out.println(duplicateNumbers(myArray));


        System.out.println("25 mmost frequent");
        System.out.println(Arrays.toString(kMostFrequent(myArray, 25)));


    }

    public static Set<Integer> fillRetunUniqeNrOnMyArray() {
        Set<Integer> myUniqueElements = new HashSet<>();
        //mbushim arrayin
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(bound);
            //kopjojm vlerat unike ne set
            myUniqueElements.add(myArray[i]);
        }
        //kalojm vlerat dupplicate ne nje map
        for (int i = 0; i < myArray.length; i++) {
            Integer key = myArray[i];
            if (repeatedElements.containsKey(key)) {
                Integer value = repeatedElements.get(key);
                repeatedElements.put(key, value + 1);
            } else repeatedElements.put(key, 1);
        }

        System.out.println("Array me vlera random");
        System.out.println(Arrays.toString(myArray));
        System.out.println("reapeted elements");
        System.out.println(repeatedElements);

        System.out.println("unique elements");
        System.out.println(myUniqueElements);

        return myUniqueElements;
    }

    public static int[] kMostFrequent(Integer[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        //Variable  for maximum frequency of any number
        int maxFreq = 0;

        for (int i = 0; i < nums.length; i++) {

            int freq = countMap.getOrDefault(nums[i], 0) + 1;

            countMap.put(nums[i], freq);

            maxFreq = Math.max(maxFreq, freq);
        }
        List<Integer>[] bucket = new ArrayList[maxFreq + 1];

        for (int n : countMap.keySet()) {
            int freq = countMap.get(n);

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(n);
        }
        int[] resultArr = new int[k];
        int count = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    resultArr[count++] = n;
                    if (count == k)
                        return resultArr;
                }
            }
        }
        return resultArr;
    }


    public static ArrayList<Integer> duplicateNumbers(Integer[] myArray) {
        ArrayList<Integer> trash = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            duplicateArrayList.add(myArray[i]);
            duplicateArrayList.add(myArray[i]);
        }
        System.out.println("duplikimi listes");
        System.out.println(duplicateArrayList);

        for (int i = 0; i < duplicateArrayList.size(); i++) {
            if (duplicateArrayList.contains(duplicateArrayList.get(i))) {
                Integer replacedNr = duplicateArrayList.get(i);
                duplicateArrayList.set(replacedNr, random.nextInt(bound));
            }
        }
        System.out.println("trying to replace duplicate with random nr");

        return duplicateArrayList;
    }


}
