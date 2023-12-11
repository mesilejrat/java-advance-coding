package exercise15;

public enum Car {
    FERRARI(10000,985),
    PORSCHE(19874512,26548),
    MERCEDES(1,1),
    BMW(12312312, 67890333);

    public final int price;
    public final int power;
    

    Car(int price, int power){
       this.price = price;
       this.power = power;
    }


    public boolean isPremium(int power){
        return !isRegual(power);
    }

    public boolean isRegual(int power) {
        if(power > 300){
            return false;
        }

        return true;
    }

    public boolean isFasterThan(Car secondCar){

        if(this.compareTo(secondCar) == 1){
            return true;
        }

        return false;
    }




}
