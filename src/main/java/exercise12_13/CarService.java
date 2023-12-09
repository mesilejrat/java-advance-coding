package exercise12_13;

import java.util.ArrayList;

public interface CarService {
    ArrayList<Car> addCars(ArrayList<Car> cars);
    void removeCars(ArrayList<Car> cars, String nameOfCar);
    ArrayList<String> returnList(ArrayList<Car> cars);
    void returnV12Engine(ArrayList<Car> cars);
    ArrayList<String> returnCarsBefore1999(ArrayList<Car> cars);
    String mostExpensiveCar(ArrayList<Car> cars);
    String cheapestCar(ArrayList<Car> cars);
    String carWithThreeManufactures(ArrayList<Car> cars);
   // ArrayList<String> carsSortedAccordingParameter(ArrayList<Car> cars, String rend);
    void checkCarInTheList(ArrayList<Car> cars, String nameOfCar);
}
