package exercise12_13;

import java.util.ArrayList;

public class MainClassForTheseExercise {
    public static void main(String[] args) {
        Manufacturer manufacturer1=new Manufacturer("audi" , 2008,"germany");
        Manufacturer manufacturer2=new Manufacturer("audi" , 2006,"germany");
        if (manufacturer1.equals(manufacturer2)){
            System.out.println("JAne te barabarta 2 manufactur sepse kane emrin e njejte");
            if (manufacturer1.hashCode() == manufacturer2.hashCode()){
                System.out.println("Kushti hashCode per manufacture eshte true");
            }
            else System.out.println("Kushti hashCode per manufacture eshte false");
        }
        else {
            System.out.println("Kushti per equals  nuk plotesohet");
        }

        ArrayList<Manufacturer> arraylistManufacture =new ArrayList<>();
        arraylistManufacture.add(manufacturer1);
        ArrayList<Manufacturer> manufacturers= new ArrayList<Manufacturer>();
        manufacturers.add(manufacturer1);
        manufacturers.add(manufacturer2);
        Car car1=new Car("veture" , "audi",1233564,2006,EngineType.S3, arraylistManufacture,800);
        Car car2=new Car("foristrade" ,"audi",5421245,2006,EngineType.S3, arraylistManufacture,80);
        if (car1.equals(car2)) {
            System.out.println("Jane te barabarta sepse kane te njejtin model");
            if (car1.hashCode() == car2.hashCode()){
                System.out.println("Kushti hashCode per Car eshte true");
            }
            else System.out.println("Kushti hashCode per Car eshte false");
        }
        else
            System.out.println("Kushti equals per Car nuk plotesohet");
    }
}
