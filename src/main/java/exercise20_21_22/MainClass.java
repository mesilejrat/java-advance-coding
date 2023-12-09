package exercise20_21_22;

public class MainClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();
        Cone cone = new Cone();
        Cube cube = new Cube();

       /* System.out.println("Perimeter of Rectangle with is: " + rectangle.calculatePerimeter(10, 10) + "m");
        System.out.println("Area of Rectangle is: " + rectangle.calculateArea(10, 10) + "m²");
        System.out.println("Perimeter of Triangle is: " + triangle.calculatePerimeter(10, 10, 10) + "m");
        System.out.println("Area of Triangle is: " + triangle.calculateArea(10, 10) + "m²");
        System.out.println("Perimeter of Hexagon is: " + hexagon.calculatePerimeter(10) + "m");
        System.out.println("Area of Hexagon is: " + hexagon.calculateArea(10) + "m²");
        System.out.println("Perimeter of Cone is: " + cone.calculatePerimeter(10) + "m");
        System.out.println("Area of Cone is: " + cone.calculateArea(10, 10) + "m²");
        System.out.println("Volume of Cone is: " + cone.calculateVolume(10, 10) + "m³");
        System.out.println("Perimeter of Cube is: " + cube.calculatePerimeter(10) + "m");
        System.out.println("Area of Cube is: " + cube.calculateArea(10) + "m²");
        System.out.println("Volume of Cube is: " + cube.calculateVolume(2) + "m³");

        */

        cube.fill(9);
        cone.fill(10, 10);
    }
}
