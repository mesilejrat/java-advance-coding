package exercise20_21_22;

public class Cone extends ThreeDShape implements ISFillable {
    @Override
    public double calculatePerimeter(Integer... params) {
        int radius = params[0];
        double perimeterOfCone = 2 * Math.PI * radius;
        return perimeterOfCone;
    }

    @Override
    public double calculateArea(Integer... params) {
        int height = params[0];
        int radius = params[1];
        double areaOfCone = Math.PI * radius * (radius + Math.sqrt(Math.pow(height , height) + Math.pow(radius , 2)));
        return areaOfCone;
    }

    @Override
    public double calculateVolume(Integer... param) {
        int height = param[0];
        int radius = param[1];
        double volumeOfCone = Math.PI * Math.pow(radius,2) * height / 3;
        return volumeOfCone;
    }

    @Override
    public void fill(Integer... param) {
        if (calculateVolume(param[0], param[1]) > 1047.1975511965977) {
            System.out.println("Cone is overflown with water");
        } else if (calculateVolume(param[0], param[1]) == 1047.1975511965977) {
            System.out.println("Cone is filled with water to the brim");
        } else {
            System.out.println("Cone is not pouring enough water");
        }
    }
}
