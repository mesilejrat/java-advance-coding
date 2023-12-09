package exercise32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Item defItem = new Item();
        ItemWriter itemWriter = new ItemWriter();
        List<Item> itemList = new ArrayList<>();

        boolean check = true;
        while (check) {
            System.out.println("Chose the option that you want to do \n -Read (R/r) \n -Write(W/w) \n -Close(C/c)");
            String option = in.next();

            if (option.equalsIgnoreCase("w")) {
                System.out.println("Enter item details that you want to write:");
                itemWriter.giveItemDetails(itemList);
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("userOut.txt"));
                    int i = 1;
                    for (Item x: itemList)
                    {
                        bufferedWriter.write(i+":"+x.toString()+"\n");
                        i++;
                    }
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (option.equalsIgnoreCase("r")) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("userOut.txt"));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else if(option.equalsIgnoreCase("c")){
                check= false;
            }
        }

    }
}