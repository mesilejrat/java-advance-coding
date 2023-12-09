package exercise23;

public class MainClass {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimals("Fox", 5);
        zoo.addAnimals("Panda", 3);
        zoo.addAnimals("Bear", 10);

        System.out.println(zoo.getAnimalByName("Bear"));
        System.out.println(zoo.getAnimalsCountSorted());
        System.out.println("Total number of animals is: " + zoo.getNumberOfAllAnimals());
    }

}
