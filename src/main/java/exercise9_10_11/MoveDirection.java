package exercise9_10_11;

public class MoveDirection {
    private Double x;
    private Double y;

    public MoveDirection(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public MoveDirection() {

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
    public String toString() {
        return "MoveDirection{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
