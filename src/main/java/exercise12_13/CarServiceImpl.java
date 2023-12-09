package exercise12_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CarServiceImpl implements CarService {
    private static ArrayList<Car> cars;
    private Car car;
     private Scanner scanner;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public ArrayList<Car> addCars(ArrayList<Car> cars){
        for(int i = 1 ; i< 3; i++) {
            Car car = new Car();
            String name;
            String model;
            Integer price;
            Integer yearOfManufacture;
            ArrayList<String> manufacturer = new ArrayList<>();
            String emriIProdhuesit;
            String engine;
            scanner = new Scanner(System.in);
            System.out.println("Jepni emrin e makines: ");
            name = scanner.nextLine();
            car.setName(name);
            System.out.println("Jepni modelin e makines: ");
            model = scanner.nextLine();
            car.setModel(model);
            System.out.println("Jepni cmimin e makines: ");
            price = scanner.nextInt();
            car.setPrice(price);
            System.out.println("Jepni vitin e prodhimit: ");
            yearOfManufacture = scanner.nextInt();
            car.setYearOfManufacture(yearOfManufacture);
            System.out.println("Jepni prodhuesin : ");
            for (int ki = 0; ki < 2; ki++) {
                Manufacturer manufactur = new Manufacturer();
                emriIProdhuesit = scanner.next();
                manufactur.setName(emriIProdhuesit);
                System.out.println("Jep vitin e prodhimit");
                manufactur.setYearofestablishment(scanner.nextInt());
                System.out.println("Jepni vendin ku eshte prodhuar");
                manufactur.setCountry(scanner.next());
            }
            System.out.println("Jepni modelin e motorrit, nje nga modelet: V12,V8,V6,S6,S4,S3 : ");
            engine = scanner.next();
            car.setEngineType(EngineType.valueOf(engine));
            cars.add(car);

        }
        System.out.println("Makina u shtua me sukses !!");
        return cars;

    }

    @Override
    public void removeCars(ArrayList<Car> cars, String nameOfCar) {
            getAllCars(cars);
            System.out.println("Vendos makinen qe do te heqesh");
            int indexRemove = scanner.nextInt();
            cars.remove(indexRemove-1);

        }

        public static void getAllCars(ArrayList<Car>car){
            for(int i=0 ; i< car.size();i++ ){
                System.out.println((i+1)+")" +car.get(i));
            }
        }


    @Override
    public ArrayList<String> returnList(ArrayList<Car> cars){
        ArrayList<String> listOfCars = new ArrayList<>();
        for (Car nameOfCar : cars){
            listOfCars.add(String.valueOf(nameOfCar));
        }
        return listOfCars;
    }

    @Override
    public void returnV12Engine(ArrayList<Car> cars){
        ArrayList<String> resultV12Engine = new ArrayList<>();
        for (Car c : cars){
            if (c.getEngineType() == EngineType.V12){
                resultV12Engine.add(c.getName());
            }
        }
    }

    @Override
    public ArrayList<String> returnCarsBefore1999(ArrayList<Car> cars){
        ArrayList<String> resultBefore1999 = new ArrayList<>();
        for (Car c : cars){
            if (c.getYearOfManufacture() < 1999){
                resultBefore1999.add(String.valueOf(c));
            }
        }
        return resultBefore1999;
    }

    @Override
    public String mostExpensiveCar(ArrayList<Car> cars){
        Integer mostExp = cars.get(0).getPrice();
        String nameOfCar =null;
        for (Car car : cars){
            if (car.getPrice() > mostExp){
                mostExp = car.getPrice();
                nameOfCar = car.getName();
            }
        }
        return nameOfCar;
    }

    @Override
    public String cheapestCar(ArrayList<Car> cars){
        Integer mostCheap =cars.get(0).getPrice();
        String nameOfCheapestCar =null;
        for (Car c : cars){
            if (c.getPrice() < mostCheap){
                mostCheap = c.getPrice();
                nameOfCheapestCar = c.getName();
            }
        }
        return nameOfCheapestCar;
    }

    @Override
    public String carWithThreeManufactures(ArrayList<Car> cars){
        for (Car c : cars){
            if (c.getManufacture().size() > 3){
                return c.getName();
            }
        }
        return null;
    }


    public static ArrayList<String> carsSortedAccordingParameter(ArrayList<Car> cars, String rend){
        if(rend.equalsIgnoreCase("rrites")){
            Collections.sort(cars, new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return o1.getPrice() - o2.getPrice();
                }
            });
        } else if(rend.equalsIgnoreCase("zbrites")){
            Collections.sort(cars, new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return o1.getPrice() + o2.getPrice();
                }
            });
        }

        return null;
    }


    @Override
    public void checkCarInTheList(ArrayList<Car> cars, String nameOfCar){
        for (Car c : cars){
            if (c.getName() == nameOfCar){
                System.out.println("Makina  ndodhet ne liste");
            }
        }
    }

    public static void main(String[] args) {
        CarServiceImpl carService = new CarServiceImpl();
        ArrayList<Car> carsAsString = new ArrayList<>();
       // carService.addCars(carsAsString);

        carsSortedAccordingParameter(carService.addCars(carsAsString),"rrites");
        carService.cheapestCar(carsAsString);
    }
}