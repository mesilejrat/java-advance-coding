package exercise9_10_11;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Circle implements Movable, Resizeable {
    private Point2D center;
    private Point2D point;
    private double radius;


    public Circle(Point2D center, Point2D point){
        this.center = center;
        this.point = point;
    }

    public Double findRadius(){
        Double diameter =Math.sqrt(Math.pow(point.getX() - center.getX(),2) + Math.pow(point.getY() - center.getY(),2 ));
        radius = diameter/2;
        return radius;
    }

    public Double getPerimeter(){
        Double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    public Double getArea(){
        Double area = Math.PI*radius*radius;
        return area;
    }

    public List<Point2D> getSlicePoints(){
        List<Point2D> points = new ArrayList<>();
        for(int i =1; i<= 3; i++){
            Point2D newPoint = getNewPointCoordinate(point);
            points.add(newPoint);
            point.setX(newPoint.getX());
            point.setY(newPoint.getY());
        }
        return points;
    }

    public Point2D getNewPointCoordinate(Point2D point){
        Double newPointX = null;
        Double newPointY = null;
        if (point.getX() >= 0 && point.getY() > 0)
        {
            newPointX = point.getX();
            newPointY = -(point.getY());
        }
        else if (point.getX()>0 && point.getY() <= 0){
            newPointX = -(point.getX());
            newPointY = point.getY();
        }
        else if (point.getX() <= 0 && point.getY() < 0){
            newPointX = point.getX();
            newPointY = -(point.getY());
        }
        else if (point.getX() < 0 && point.getY() >= 0){
            newPointX = -(point.getX());
            newPointY = point.getY();
        }

        return new Point2D(newPointX,newPointY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return center.equals(circle.center) && Objects.equals(point, circle.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center);
    }

    public Boolean isOutsideOfCycle(Point2D point){
        // Menyra per te pare se nese pika eshte brenda apo  jashte rrethit eshte :
        // (x - center_x)² + (y - center_y)² <= radius²
        Double xCoordinate = Math.pow(point.getX() - center.getX(), 2);
        System.out.println(xCoordinate + " xCordinate");
        Double yCoordinate = Math.pow(point.getY() - center.getY(), 2);
        System.out.println(yCoordinate + "ycordinate");
        System.out.println(Math.pow(radius,2) + " rrezja");
        System.out.println((xCoordinate + yCoordinate ) <= Math.pow(radius,2));
        if((xCoordinate + yCoordinate ) <= Math.pow(radius,2)){
            return false;
        }
        return true;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        point.move(moveDirection);
        if(!isOutsideOfCycle(point)){
            System.out.println("Pika u zhvendos sipas ketyre kordinatave" + moveDirection.toString());
        } else {
            System.out.println("Pika nuk u zhvendos sepse do te dali nga rrethi ");
        }
    }

    @Override
    public void resize(Double resizeFactor) {
        radius = radius*resizeFactor;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public Double getRadius(){
        return radius;
    }
}
