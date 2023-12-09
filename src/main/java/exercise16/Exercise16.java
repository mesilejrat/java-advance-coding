package exercise16;

public enum  Exercise16 {
    BEGINNER(5.50001, 9999D),
    INTERMEDIATE(2.50001, 5.5),
    ADVANCED(0D, 2.5);

    private final Double minTime;
    private final Double maxTime;

    Exercise16(Double minTime, Double maxTime){
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Exercise16 getFitnessLevel(Double timeResult){
        if(timeResult >= 0D && timeResult <= 2.5){
          //  System.out.println("ADVANCED !");
            return ADVANCED;
        }
        else if(timeResult >= 2.50001 && timeResult <= 5.5){
            System.out.println("INTERMEDIATE !");
            return INTERMEDIATE;
        }
        else{
           // System.out.println("BEGINNER !");
            return BEGINNER;
        }
    }

    public static void main(String[] args) {
        //Menyra e pare e deklarimit
        Exercise16 newRunner = Exercise16.ADVANCED;
        //Menyra e dyte e deklarimit
        Exercise16 test = getFitnessLevel(22D);
        System.out.println(test);
        getFitnessLevel(3D);
        Exercise16 test2 = getFitnessLevel(1D);
        System.out.println(test2);
    }
}
