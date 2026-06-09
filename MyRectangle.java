/**
 * MyRectangle class models a rectangle
 * using two MyPoint objects.
 */
public class MyRectangle
{
    private MyPoint topLeft;
    private MyPoint bottomRight;

    /**
     * Constructor using coordinates.
     */
    public MyRectangle(int x1, int y1,
                       int x2, int y2)
    {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    /**
     * Constructor using MyPoint objects.
     */
    public MyRectangle(MyPoint topLeft,
                       MyPoint bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft()
    {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft)
    {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight()
    {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight)
    {
        this.bottomRight = bottomRight;
    }

    public int getLength()
    {
        return Math.abs(
                bottomRight.getX()
                - topLeft.getX());
    }

    public int getWidth()
    {
        return Math.abs(
                topLeft.getY()
                - bottomRight.getY());
    }

    public int getArea()
    {
        return getLength() * getWidth();
    }

    public int getPerimeter()
    {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString()
    {
        return "MyRectangle[topLeft="
                + topLeft
                + ",bottomRight="
                + bottomRight
                + "]";
    }
}