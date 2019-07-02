package Exercise1;
import java.util.Scanner;

public class TestTriangle
{
    public static void main(String args[])
    {
        Scanner scan        = new Scanner(System.in);
        Triangle myTriangle = new Triangle();

        System.out.println("Please enter in three sides:");
        myTriangle.setSide1(scan.nextInt());
        myTriangle.setSide2(scan.nextInt());
        myTriangle.setSide3(scan.nextInt());
        System.out.println("Please enter color:");
        myTriangle.setColor(scan.next());
        System.out.println("Please enter is filled:\n(true or false)");
        myTriangle.setFilled(scan.nextBoolean());

        System.out.println(myTriangle);
}
}
