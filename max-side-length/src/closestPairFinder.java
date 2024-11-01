import java.awt.Point;
import java.util.*;

public class closestPairFinder {
    public List<Pair> findClosestPair(List<TestCase> testCaseList)
    {
        List<Pair> closestPairs = new ArrayList<>();
        for (TestCase testCase : testCaseList) {
            List<Point> pointsX = new ArrayList<>(testCase.points);
            List<Point> pointsY = new ArrayList<>(testCase.points);
            pointsX.sort(Comparator.comparingInt(p -> p.x));
            pointsY.sort(Comparator.comparingInt(p -> p.y));
            closestPairs.add(divideAndConquer(pointsX, pointsY));
        }
        return closestPairs;
    }
    private Pair divideAndConquer(List<Point> pointsX, List<Point> pointsY)
    {
        if (pointsX.size() == 2)
        {
            Point a = pointsX.get(0);
            Point b = pointsX.get(1);
            return new Pair(a.distance(b), a, b);
        }
        if (pointsX.size() == 3)
        {
            Point a = pointsX.get(0);
            Point b = pointsX.get(1);
            Point c = pointsX.get(2);
            Pair closest = new Pair(a.distance(b), a, b);
            if (a.distance(c) < closest.distance)
            {
                closest.pointA = a;
                closest.pointB = c;
                closest.distance = a.distance(c);
            }
            if (b.distance(c) < closest.distance)
            {
                closest.pointA = b;
                closest.pointB = c;
                closest.distance = b.distance(c);
            }
            return closest;
        }

        List<Point> leftX = pointsX.subList(0, pointsX.size()/2);
        List<Point> rightX = pointsX.subList(pointsX.size()/2, pointsX.size());
        List<Point> leftY = new ArrayList<>();
        List<Point> rightY = new ArrayList<>();

        for(int i = 0; i < pointsY.size(); i++)
        {
            if (pointsY.get(i).x <= pointsX.get(pointsX.size()/2).x)
            {
                leftY.add(pointsY.get(i));
            }
            else
            {
                rightY.add(pointsY.get(i));
            }
        }

        Pair fromLeft = divideAndConquer(leftX, leftY);
        Pair fromRight = divideAndConquer(rightX, rightY);
        Pair closest;
        if (fromLeft.distance < fromRight.distance)
        {
            closest = fromLeft;
        }
        else
        {
            closest = fromRight;
        }

        return checkStrip(pointsY, pointsX.get(pointsX.size()/2).x, closest);
    }
    private Pair checkStrip(List<Point> pointsY, int midpointX, Pair closest)
    {
        List<Point> strip = new ArrayList<>();
        for(int i = 0; i < pointsY.size(); i++)
        {
            if (Math.abs(pointsY.get(i).x - midpointX) < closest.distance)
            {
                strip.add(pointsY.get(i));
            }
        }
        for (int i = 0; i < strip.size(); i++)
        {
            for (int j = i + 1; j < strip.size(); j++)
            {
                if ((strip.get(j).y - strip.get(i).y) < closest.distance)
                {
                    double distance = strip.get(i).distance(strip.get(j));
                    if (!(distance > closest.distance))
                    {
                        closest = new Pair(distance, strip.get(i), strip.get(j));
                    }
                }
            }
        }
        return closest;
    }
}
