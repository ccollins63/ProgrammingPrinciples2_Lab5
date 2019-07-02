package Exercise4;

public class Rectangle extends GeometricObject
{

    private int length;
    private int width;

    public Rectangle()
    {
    }

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public double getArea()
    {
        double area = Math.round((width * length) * 100.0D) / 100.0D;
        return area;

    }

    public double getPerimeter()
    {
        double perimeter = (2 * width) + (2 * length);
        return perimeter;

    }

    public String toString()
    {
        return "Area:\t\t" + getArea() + "\nPerimeter:\t" + getPerimeter() + "\nColor\t\t"
                + getColor() + "\nFilled:\t\t" + isFilled();
    }
}
