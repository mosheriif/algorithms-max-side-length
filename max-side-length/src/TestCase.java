import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestCase {
    int numPoints;
    List<Point> points = new ArrayList<>();

    public TestCase(int numPoints)
    {
        this.numPoints = numPoints;
    }

    public void addPoint(int x, int y)
    {
        points.add(new Point(x, y));
    }
}
