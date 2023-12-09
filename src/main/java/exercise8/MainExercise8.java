package exercise8;

public class MainExercise8 {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(30,15,2, 40.0F,false);
        Parcel parcel2 = new Parcel(31,40,200, 40F,false);
        Parcel parcel3 = new Parcel(31,40,200, 25F,false);
        parcel1.validate(parcel1);
        parcel2.validate(parcel2);
        parcel3.validate(parcel3);
    }
}
