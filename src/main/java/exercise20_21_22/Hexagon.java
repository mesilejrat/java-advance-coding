package exercise20_21_22;

public class Hexagon extends Shape {
    @Override
    public double calculatePerimeter(Integer... params) {
        int side = params[0];
        double perimeterOfHexagon = 6 * side;
        return perimeterOfHexagon;

    }

    @Override
    public double calculateArea(Integer... params) {
        int side = params[0];
        double areaOfHexagon = ((3 * Math.sqrt(3)) / 2) * side * side;
        return areaOfHexagon;
    }
}
