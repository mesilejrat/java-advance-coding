package exercise20_21_22;


public class Cube extends ThreeDShape implements ISFillable {
    @Override
    public double calculatePerimeter(Integer... params) {
        int side = params[0];
        double perimeterOfCube = 12 * side;
        return perimeterOfCube;
    }

    @Override
    public double calculateArea(Integer... params) {
        int edge = params[0];
        double areaOfCube = 6 * Math.pow(edge,2);
        return areaOfCube;
    }

    @Override
    public double calculateVolume(Integer... param) {
        int edge = param[0];
        double volumeOfCube = Math.pow(edge,3);
        return volumeOfCube;
    }

    @Override
    public void fill(Integer... param) {
        if (calculateVolume(param[0]) > 8) {
            System.out.println("Cube is overflown with water");
        } else if (calculateVolume(param[0]) == 8) {
            System.out.println("Cube is filled with water to the brim");
        } else {
            System.out.println("Cube is not pouring enough water");
        }
    }
}
