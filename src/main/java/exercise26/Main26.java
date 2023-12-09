package exercise26;

import java.util.ArrayList;
import java.util.List;

public class Main26 {
     public static void main(String[] args) {
         List<Manufacturer> manufacturerList= new ArrayList<>();
         List<Car> carList = new ArrayList<>();
         carList.add(new Car("Ferrari", "Motor 6.3", CarType.COUPE));
         carList.add(new Car("Benz", "Motor 6.1", CarType.SEDAN));
         carList.add(new Car("BMW", "Motor 5.3", CarType.COUPE));
         carList.add(new Car("Audi", "Motor 2.0", CarType.COUPE));
         carList.add(new Car("Passat", "Motor 1.3", CarType.COUPE));
         carList.add(new Car("Golf", "Motor 2.3", CarType.COUPE));
         carList.add(new Car("Bentley", "Motor 3.3", CarType.COUPE));
         carList.add(new Car("Lambo", "Motor 4.3", CarType.COUPE));
         carList.add(new Car("Rolls", "Motor 5.3", CarType.COUPE));
         carList.add(new Car("Ionic", "Motor 12.3", CarType.COUPE));
         carList.add(new Car("Tesla", "Motor 7.3", CarType.COUPE));
         List<Model> models = new ArrayList<>();
         models.add(new Model("F40",2002, carList));
         models.add(new Model("S class",2020, carList));
         models.add(new Model("F90",2121, carList));
         models.add(new Model("ionic 5",2012, carList));
         models.add(new Model("tesla",2022, carList));
         manufacturerList.add(new Manufacturer("Ferrari", 2002, models));
         manufacturerList.add(new Manufacturer("Benz", 2009, models));
         manufacturerList.add(new Manufacturer("Tesla", 2022, models));
         manufacturerList.add(new Manufacturer("Golf", 2012, models));
         manufacturerList.add(new Manufacturer("Passat", 2019, models));

         //Print all models.
        // manufacturerList.stream().forEach(m -> m.models.forEach(model -> System.out.println(model.name)));

         // List of all cars
        // manufacturerList.stream().forEach(m -> m.models.forEach(model -> model.cars.forEach(car -> System.out.println(car.name))));

         //List of manifacturer name
        // manufacturerList.stream().forEach(m -> System.out.println(m.name));
         //List of manifacturer year
         manufacturerList.stream().forEach(m -> System.out.println(m.yearOfCreation));
     }
}
