package Exercise1;

public class Triangle extends GeometricObject
{

    private int side1;
    private int side2;
    private int side3;

    public Triangle()
    {
    }

    public Triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1()
    {
        return side1;
    }

    public void setSide1(int side1)
    {
        this.side1 = side1;
    }

    public int getSide2()
    {
        return side2;
    }

    public void setSide2(int side2)
    {
        this.side2 = side2;
    }

    public int getSide3()
    {
        return side3;
    }

    public void setSide3(int side3)
    {
        this.side3 = side3;
    }

    public double getArea()
    {
        double semiperimter = ((side1 + side2 + side3) / 2.0);

        double area = Math.round(Math.sqrt((semiperimter * (semiperimter - side1) * (semiperimter - side2) * (semiperimter - side3))) * 100.0D) / 100.0D;
        return area;

    }

    public double getPerimeter()
    {
        double perimeter = side1 + side2 + side3;
        return perimeter;

    }

    public String toString()
    {
        return "Area:\t\t" + getArea() + "\nPerimeter:\t" + getPerimeter() + "\nColor\t\t"
                + getColor() + "\nFilled:\t\t" + isFilled();
    }
}
