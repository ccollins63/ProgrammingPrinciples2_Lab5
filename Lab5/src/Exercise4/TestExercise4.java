package Exercise4;

public class TestExercise4
{
    public static void main(String args[])
    {
       GeometricObject[] list = new GeometricObject[4];

        list[0] = new Circle(2);
        list[1] = new Circle(5);
        list[2] = new Rectangle(2,4);
        list[3] = new Rectangle(1,5);

        System.out.println("The total area of the geometric objects is:\t" + GeometricObject.sumArea(list));
    }
}