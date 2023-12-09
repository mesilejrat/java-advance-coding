package exercise31;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise31 {

    public void createFile() throws IOException {
        File file = new File("words.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("words.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text;
        System.out.println("Jepni tekstin qe do te shkruhet ne file: ");
        text = bufferedReader.readLine();
        writer.write(text);
        writer.close();
    }

    public void findOcurrencesWords() throws IOException {
        File file = new File("words.txt");
        File newFile = new File("wordsCounted.txt");
        BufferedWriter writerNew = new BufferedWriter(new FileWriter("wordsCounted.txt"));
        Scanner scanner = new Scanner(file);
        Scanner scanner1 = new Scanner(newFile);
        Map<String, Integer> words = new HashMap<>();

        String str;
        while (scanner.hasNext()){
            str = scanner.next().toLowerCase();
            words.put(str, words.containsKey(str)?words.get(str)+1:1);
        }

        String text = "";
        for (String s : words.keySet()){
            if (text != "") text += "\n";
            text += s+" "+words.get(s);
        }
        writerNew.write(text);
        writerNew.close();
        scanner.close();
        scanner1.close();
    }

    public static void main(String[] args) throws IOException {
        Exercise31 exercise31 = new Exercise31();
        exercise31.createFile();
        exercise31.findOcurrencesWords();
        System.out.println("Shikoni filen words Counted.txt");
    }
}






