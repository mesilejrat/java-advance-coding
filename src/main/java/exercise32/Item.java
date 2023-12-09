package exercise32;

public class Item {
    private String itemName;
    private String itemFunction;
    private Double price;

    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemFunction() {
        return itemFunction;
    }

    public void setItemFunction(String itemFunction) {
        this.itemFunction = itemFunction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item => " +
                "Name of item: " + itemName +
                ", Function of item: " + itemFunction +
                ", Price: " + price +"$" ;
    }
}