public class RoomRectangle implements GeometricCalc {

    @Override
    public double area(double sideA, double sideB) {
        return sideA * sideB;
    }

    @Override
    public double perimeter(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }
}
