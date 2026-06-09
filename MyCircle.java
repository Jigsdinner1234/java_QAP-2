/**
 * MyCircle class models a circle using a center point and radius.
 */
public class MyCircle
{
    private final MyPoint center;
    private final double radius;

    public MyCircle(MyPoint center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return "MyCircle[center=" + center +
               ",radius=" + radius + "]";
    }
}