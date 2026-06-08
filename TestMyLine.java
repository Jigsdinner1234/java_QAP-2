/**
 * Test driver for MyLine class.
 */
public class TestMyLine
{
    public static void main(String[] args)
    {
        MyLine line1 = new MyLine(1, 2, 5, 6);

        System.out.println("Line 1:");
        System.out.println(line1);

        System.out.println("\nBegin Point: "
                + line1.getBegin());

        System.out.println("End Point: "
                + line1.getEnd());

        System.out.println("Begin X: "
                + line1.getBeginX());

        System.out.println("Begin Y: "
                + line1.getBeginY());

        System.out.println("End X: "
                + line1.getEndX());

        System.out.println("End Y: "
                + line1.getEndY());

        System.out.printf("Length: %.2f%n",
                line1.getLength());

        System.out.printf("Gradient: %.4f radians%n",
                line1.getGradient());

        line1.setBeginXY(10, 20);
        line1.setEndXY(30, 40);

        System.out.println("\nAfter changing points:");
        System.out.println(line1);

        MyLine.MyPoint p1 = new MyLine.MyPoint(3, 4);
        MyLine.MyPoint p2 = new MyLine.MyPoint(8, 10);

        MyLine line2 = new MyLine(p1, p2);

        System.out.println("\nLine 2:");
        System.out.println(line2);

        System.out.printf("Length: %.2f%n",
                line2.getLength());

        System.out.printf("Gradient: %.4f radians%n",
                line2.getGradient());
    }
}