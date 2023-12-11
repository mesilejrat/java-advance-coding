package exercise15;

public class MAinCar {
    public static void main(String[] args) {
        Car car = Car.BMW;
        Car secondCar = Car.MERCEDES;

        System.out.println("Makina BMW eshte premium ? " + car.isPremium(car.power));
        System.out.println("Makina MERCEDES eshte premium ? " + secondCar.isPremium(secondCar.power));
        System.out.println("Makina BMW eshte eshte regular ? " + car.isRegual(car.power));
        System.out.println("Makina MERCEDES eshte regular ? " + secondCar.isRegual(secondCar.power));
        System.out.println("Makina BMW eshte me e shpejte se MERCEDES ? " + car.isFasterThan(secondCar));

        System.out.println("Makina BMW compare to MERCEDES" + car.compareTo(secondCar));

    }
}
