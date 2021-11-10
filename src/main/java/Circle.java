public class Circle {

    protected MyMath obj;
    public double getArea(double radius) {
        obj = new MyMath();
        double rSquare = obj.square(radius);
        return Math.PI * rSquare;
    }
}
