package exercise12_13;

import java.util.*;

public class CarService {

    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void addCarIntoList(Car car){
        carList.add(car);
    }

    public void removeCars(List<Car> cars, String nameOfCar, Scanner scanner) {
        System.out.println("Vendos makinen qe do te heqesh");
        int indexRemove = scanner.nextInt();
        cars.remove(indexRemove-1);

    }

    public void returnV12Engine(List<Car> cars){
        List<String> resultV12Engine = new ArrayList<>();
        for (Car c : cars){
            if (c.getEngineType() == EnginType.V12){
                resultV12Engine.add(c.getName());
            }
        }

        resultV12Engine.stream().forEach(System.out::println);
    }

    public void returnCarsBefore1999(List<Car> cars){
        List<String> carsBefore1999 = new ArrayList<>();
        for (Car c : cars){
            if (c.getYearOfManufacture() < 1999){
                carsBefore1999.add(c.getName());
            }
        }

        carsBefore1999.stream().forEach(System.out::println);
    }


    public void returnTheMostExpensiveCar(List<Car> cars){

        if(cars.size() <1 ){
            System.out.println("Lista eshte bosh ");
            return;
        }

        if(cars.size() == 1){
            System.out.println("Makina me e shtrente eshte " + carList.get(0));
        }

        Car mostExpensiveCar = cars.get(0);
        for (int i =1 ;i < cars.size(); i++){
            if (cars.get(i).getPrice() > mostExpensiveCar.getPrice()){
                mostExpensiveCar = cars.get(i);

            }
        }

        System.out.println("Makina me e shtrenjte eshte " + mostExpensiveCar);
    }

    public void returnTheLeastExpensiveCar(List<Car> cars){

        if(cars.size() <1){
            System.out.println("Lista eshte bosh ");
            return;
        }

        if(cars.size() == 1){
            System.out.println("Makina me e lire eshte " + carList.get(0));
        }

        Car mostCheaperCar = cars.get(0);
        for (int i =0 ;i < cars.size(); i++){
            if (cars.get(0).getPrice() < mostCheaperCar.getPrice()){
                mostCheaperCar = cars.get(i);

            }
        }

        System.out.println("Makina me e lire eshte " + mostCheaperCar);
    }


    public void kerkesa8(){

        if(carList.size() <1){
            System.out.println("Lista eshte bosh ");
            return;
        }

        if(carList.size() == 1 && carList.get(0).getManufacturer().size() >=3){
            System.out.println("Makina qe ka me shumes e 3 manufacturer eshte " + carList.get(0));
        }

        for (Car car: carList) {
            if(car.getManufacturer().size() >= 3){
                System.out.println("Makina qe ka me shumes e 3 manufacturer eshte " + carList.get(0));
            }
        }

    }


    public void kerkesa9(String rend){

        if(carList.size() < 1){
            System.out.println("Lista eshte bosh ");
            return;
        }

        if(rend.equalsIgnoreCase("rrites")){
            Collections.sort(carList, Comparator.comparingInt(Car::getPrice));

        } else if(rend.equalsIgnoreCase("zbrites")){
            Collections.sort(carList, Comparator.comparingInt(Car::getPrice).reversed());
        }

        printoListen();

    }

    private void printoListen() {
        carList.forEach(System.out::println);
    }


    public void kerkesa10(Car wantedCar){

        if(carList.size() < 1){
            System.out.println("Lista eshte bosh ");
            return;
        }

        for (Car c : carList){
            if (c.equals( wantedCar)){
                System.out.println("Makina  ndodhet ne liste");
            }
        }
    }



    public void kerkesa11(Manufacturer nameOfManufacturer){
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturer().contains(nameOfManufacturer)) {
                result.add(car);
            }
        }


        result.stream().forEach(System.out::println);
    }

    private boolean compareYears(int carYear, String comparison, int year) {
        switch (comparison) {
            case "<":
                return carYear < year;
            case ">":
                return carYear > year;
            case "<=":
                return carYear <= year;
            case ">=":
                return carYear >= year;
            case "==":
                return carYear == year;
            case "!=":
                return carYear != year;
            default:
                throw new IllegalArgumentException("Invalid comparison operator");
        }
    }

}
