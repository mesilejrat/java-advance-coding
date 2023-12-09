package exercise17;

import java.util.Scanner;

public class Main {

    public static Double convert(Double value, ConversionType conversionType) {

        Double conv = value * conversionType.getConverter();

        return conv;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the amount in meters you want to convert to yards");
        Double meters = scanner.nextDouble();
        System.out.println(convert(meters, ConversionType.METERS_TO_YARDS) + "  yards");
        System.out.println("please enter the amount in inches you want to convert to centimeters");
        Double inches = scanner.nextDouble();
        System.out.println(convert(inches, ConversionType.INCHES_TO_CENTIMETERS) + " centimeters");
        System.out.println("please enter the amount in yards you want to convert to meters");
        Double yards = scanner.nextDouble();
        System.out.println(convert(yards, ConversionType.YARDS_TO_METERS) + " meters");

        System.out.println("please enter the amount in kilometers you want to convert to miles");
        Double kilometers = scanner.nextDouble();
        System.out.println(convert(kilometers, ConversionType.KILOMETERS_TO_MILES) + "miles");
    }


}
