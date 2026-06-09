import java.util.ArrayList;

/**
 * CampusMap aggregates buildings, walkways, and fountains.
 */
public class CampusMap
{
    private final ArrayList<MyRectangle> buildings;
    private final ArrayList<MyLine> walkways;
    private final ArrayList<MyCircle> fountains;

    public CampusMap()
    {
        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    public void addBuilding(MyRectangle building)
    {
        buildings.add(building);
    }

    public void addFountain(MyCircle fountain)
    {
        fountains.add(fountain);
    }

    public void addWalkway(MyRectangle from,
                           MyRectangle to)
    {
        if (!buildings.contains(from)
                || !buildings.contains(to))
        {
            System.out.println(
                "Error: Building not found.");
            return;
        }

        int fromCenterX =
            (from.getTopLeft().getX()
            + from.getBottomRight().getX()) / 2;

        int fromCenterY =
            (from.getTopLeft().getY()
            + from.getBottomRight().getY()) / 2;

        int toCenterX =
            (to.getTopLeft().getX()
            + to.getBottomRight().getX()) / 2;

        int toCenterY =
            (to.getTopLeft().getY()
            + to.getBottomRight().getY()) / 2;

        MyLine path =
            new MyLine(
                fromCenterX,
                fromCenterY,
                toCenterX,
                toCenterY);

        walkways.add(path);
    }

    public double calculateTotalWalkwayLength()
    {
        double total = 0;

        for (MyLine line : walkways)
        {
            total += line.getLength();
        }

        return total;
    }

    public double calculateTotalFountainArea()
    {
        double total = 0;

        for (MyCircle circle : fountains)
        {
            total += circle.getArea();
        }

        return total;
    }

    public boolean isWalkwayFromTo(
            MyRectangle fromBuilding,
            MyRectangle toBuilding)
    {
        int fromCenterX =
            (fromBuilding.getTopLeft().getX()
            + fromBuilding.getBottomRight().getX()) / 2;

        int fromCenterY =
            (fromBuilding.getTopLeft().getY()
            + fromBuilding.getBottomRight().getY()) / 2;

        int toCenterX =
            (toBuilding.getTopLeft().getX()
            + toBuilding.getBottomRight().getX()) / 2;

        int toCenterY =
            (toBuilding.getTopLeft().getY()
            + toBuilding.getBottomRight().getY()) / 2;

        for (MyLine line : walkways)
        {
            if (line.getBeginX() == fromCenterX &&
                line.getBeginY() == fromCenterY &&
                line.getEndX() == toCenterX &&
                line.getEndY() == toCenterY)
            {
                return true;
            }

            if (line.getBeginX() == toCenterX &&
                line.getBeginY() == toCenterY &&
                line.getEndX() == fromCenterX &&
                line.getEndY() == fromCenterY)
            {
                return true;
            }
        }

        return false;
    }
}