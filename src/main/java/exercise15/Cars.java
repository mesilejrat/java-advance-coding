package exercise15;

import exercise12_13.Car;

public enum Cars {
    BMW( 720, Brands.BMW),
    Benz(320, Brands.BENZ),
    AUDI(550, Brands.AUDI);

    private final Brands price;
    private final int power;

    Cars(int power,Brands price ) {
        this.power = power;
        this.price = price;

    }

    public boolean isPremium(Integer power){
        return !isRegular(power);
    }

    public boolean isRegular(Integer power){

        if(power > 300){
            return  false;
        }
        return true;
    }

    public boolean isFaster(Car car){
        Integer count = 0;
        if(car.getPower() > BMW.power){
            System.out.println("BMW eshte me e vogel ne motorr se makina juaj");
            count++;
        } else{
            System.out.println("BMW eshte me e madhe ne motorr se makina juaj");
        }
        if(car.getPower() > AUDI.power){
            System.out.println("AUDI eshte me e vogel ne motorr se makina juaj");
            count++;
        } else{
            System.out.println("Audi eshte me e madhe ne motorr se makina juaj");
        }
        if(car.getPower() > Benz.power){
            count++;
            System.out.println("BENZ eshte me e vogel ne motorr se makina juaj");
        } else{
            System.out.println("BMW eshte me e madhe ne motorr se makina juaj");
        }

        if (count == 3 ){
            return true;
        }
        return false;
    }

    public int getPower() {
        return power;
    }

    public Brands getPrice() {
        return price;
    }

}
