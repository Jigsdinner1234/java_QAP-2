public class TestCampusMap
{
    public static void main(String[] args)
    {
        CampusMap campus = new CampusMap();

        MyRectangle scienceHall =
            new MyRectangle(400,700,600,500);

        MyRectangle library =
            new MyRectangle(100,900,300,700);

        MyRectangle lecture1 =
            new MyRectangle(700,900,750,850);

        MyRectangle lecture2 =
            new MyRectangle(760,900,810,850);

        MyRectangle lecture3 =
            new MyRectangle(820,900,870,850);

        MyRectangle lecture4 =
            new MyRectangle(700,840,750,790);

        MyRectangle lecture5 =
            new MyRectangle(760,840,810,790);

        campus.addBuilding(scienceHall);
        campus.addBuilding(library);
        campus.addBuilding(lecture1);
        campus.addBuilding(lecture2);
        campus.addBuilding(lecture3);
        campus.addBuilding(lecture4);
        campus.addBuilding(lecture5);

        MyCircle fountain =
            new MyCircle(
                new MyPoint(500,500), 40);

        campus.addFountain(fountain);

        campus.addWalkway(scienceHall, library);
        campus.addWalkway(scienceHall, lecture1);
        campus.addWalkway(scienceHall, lecture2);
        campus.addWalkway(scienceHall, lecture3);
        campus.addWalkway(scienceHall, lecture4);
        campus.addWalkway(scienceHall, lecture5);

        System.out.println(
            "Total Walkway Length: "
            + campus.calculateTotalWalkwayLength());

        System.out.printf(
            "Total Fountain Area: %.2f%n",
            campus.calculateTotalFountainArea());

        System.out.println();

        System.out.println(
            "Science Hall -> Library? "
            + campus.isWalkwayFromTo(
                scienceHall, library));

        System.out.println(
            "Library -> Lecture 3? "
            + campus.isWalkwayFromTo(
                library, lecture3));
    }
}