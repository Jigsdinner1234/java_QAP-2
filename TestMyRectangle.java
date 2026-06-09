public class TestMyRectangle
{
    public static void main(String[] args)
    {
        MyRectangle rect1 =
                new MyRectangle(2, 8, 10, 2);

        System.out.println("Rectangle 1");
        System.out.println(rect1);

        System.out.println(
                "Length: "
                + rect1.getLength());

        System.out.println(
                "Width: "
                + rect1.getWidth());

        System.out.println(
                "Area: "
                + rect1.getArea());

        System.out.println(
                "Perimeter: "
                + rect1.getPerimeter());

        System.out.println();

        MyPoint p1 =
                new MyPoint(1, 9);

        MyPoint p2 =
                new MyPoint(7, 3);

        MyRectangle rect2 =
                new MyRectangle(p1, p2);

        System.out.println("Rectangle 2");
        System.out.println(rect2);

        System.out.println(
                "Length: "
                + rect2.getLength());

        System.out.println(
                "Width: "
                + rect2.getWidth());

        System.out.println(
                "Area: "
                + rect2.getArea());

        System.out.println(
                "Perimeter: "
                + rect2.getPerimeter());

        rect2.setTopLeft(
                new MyPoint(0, 10));

        rect2.setBottomRight(
                new MyPoint(8, 0));

        System.out.println();
        System.out.println(
                "After modifying Rectangle 2");

        System.out.println(rect2);

        System.out.println(
                "Area: "
                + rect2.getArea());

        System.out.println(
                "Perimeter: "
                + rect2.getPerimeter());
    }
}