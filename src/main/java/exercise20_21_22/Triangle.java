package exercise20_21_22;

public class Triangle extends Shape{
        @Override
        public double calculatePerimeter(Integer... params) {
            int sideA = params[0];
            int baseB = params[1];
            int sideC = params[2];

            int perimeterOfTriangle = sideA + baseB + sideC;
            return perimeterOfTriangle;
        }

        @Override
        public double calculateArea(Integer... params) {
            int heightBase = params[0];
            int base = params[1];
            return (heightBase * base) / 2;
        }

}
