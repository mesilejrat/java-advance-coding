package exercise17;

public enum ConversionType {
    METERS_TO_YARDS(1.0936133),
    YARDS_TO_METERS(0.91),
    CENTIMETERS_TO_INCHES(0.393700787),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.62137119),
    MILES_TO_KILOMETERS(1.609);


    public final double conv;

    ConversionType(double converter) {

        this.conv = converter;
    }

    public double getConverter() {
        return conv;
    }
}
