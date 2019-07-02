package Exercise3;

public abstract class GeometricObject implements Comparable<GeometricObject>
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled)
    {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor()
    {
        return color;
    }

    /** Set a new color */
    public void setColor(String color)
    {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     * the get method is named isFilled */
    public boolean isFilled()
    {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        return "Created on " + dateCreated + "\nCircle with color " + color +
                " and filled " + filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObject max(GeometricObject object1, GeometricObject object2)
    {
        if (((Comparable)object1).compareTo(object2) > 0 )
            return object1;
        else
            return object2;
    }

    /** Abstract method getArea */
    public abstract double getArea();
}
