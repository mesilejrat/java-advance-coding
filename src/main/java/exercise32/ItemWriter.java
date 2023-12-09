package exercise32;

import java.util.List;
import java.util.Scanner;

public class ItemWriter {
     private Scanner in = new Scanner(System.in);

    public void giveItemDetails(List<Item> itemList){
        Item defItem = new Item();
        System.out.println("Write the name of the item");
        defItem.setItemName(in.next());
        System.out.println("Write the function of the item");
        defItem.setItemFunction(in.next());
        System.out.println("Write the price of the item");
        defItem.setPrice(in.nextDouble());
        itemList.add(defItem);

    }



}
