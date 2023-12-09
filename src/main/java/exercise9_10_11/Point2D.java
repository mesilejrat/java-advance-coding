package exercise9_10_11;


public class Point2D implements Movable {
    private Double x;
    private Double y;

    public Point2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.setY(this.y + moveDirection.getY());
        this.setX(this.x + moveDirection.getX());
    }
}

