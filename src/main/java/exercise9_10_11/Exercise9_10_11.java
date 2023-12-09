package exercise9_10_11;

import java.util.List;

public class Exercise9_10_11 {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point2D(0d,0d), new Point2D(2d,2d));
        MoveDirection newPoint = new MoveDirection(1D,14D);
        System.out.println(circle.findRadius());
        circle.getArea();
        circle.getPerimeter();
        List<Point2D> point2DList = circle.getSlicePoints();
        for (Point2D point : point2DList){
            System.out.println("x : " + point.getX() + " y : " + point.getY());
        }

        System.out.println("_____________________________________");

        circle.move(newPoint);
        System.out.println(circle.getPoint().getX());
        System.out.println(circle.getPoint().getY());

        circle.resize(10D);
        System.out.println(circle.getRadius());
        circle.move(new MoveDirection(10D,10D));
    }
}
