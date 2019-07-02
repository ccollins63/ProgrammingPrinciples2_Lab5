package Exercise3;

public class TestComparable
{
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(1, "Red", true);
        GeometricObject circle2 = new Circle(2, "Blue", false);
        GeometricObject maxCircle = new Circle();

        maxCircle = GeometricObject.max(circle1, circle2);

        System.out.println(maxCircle.toString());

    }
}
