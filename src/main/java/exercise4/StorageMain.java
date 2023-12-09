package exercise4;

public class StorageMain {
    public static void main(String[] args) {
       Storage1 storage1 = new Storage1();
       storage1.addToStorage("Java", "17");
       storage1.addToStorage("Java", "16");
       storage1.addToStorage("Java", "15");
       storage1.addToStorage("Java", "14");
       storage1.addToStorage("Java", "13");
       storage1.addToStorage("Java", "12");
       storage1.addToStorage("Java", "11");
       storage1.addToStorage("Java", "10");
       storage1.addToStorage("Protik", "17");
       storage1.addToStorage("Protik", "1444");
       storage1.addToStorage("Protik", "2347");
       storage1.addToStorage("Protik", "12342347");
       storage1.addToStorage("Protik", "11237");
       storage1.findValues("17");
       storage1.printValues("Java");
       storage1.printValues("Protik");
       storage1.printValues("Servete");
    }
}
