package exercise20_21_22;

public class Rectangle extends Shape{
    @Override
    public double calculatePerimeter(Integer... params) {
        int width = params[0];
        int length = params[1];
        return 2 * (width + length);
    }

    @Override
    public double calculateArea(Integer... params) {
        int width = params[0];
        int length = params[1];
        return width * length;
    }
}
