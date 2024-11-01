import java.io.*;
import java.util.*;
import java.awt.Point;

public class fileReader {
    public static class TestCase
    {
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

    public static List<TestCase> readInput(String filePath) throws IOException
    {
        List<TestCase> testCases = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                int numPoints = Integer.parseInt(line.trim());
                TestCase testCase = new TestCase(numPoints);

                for (int i = 0; i < numPoints; i++)
                {
                    line = reader.readLine();
                    if (line != null)
                    {
                        String[] coordinates = line.trim().split("\\s+");
                        int x = Integer.parseInt(coordinates[0]);
                        int y = Integer.parseInt(coordinates[1]);
                        testCase.addPoint(x, y);
                    }
                }
                testCases.add(testCase);
            }
        }
        return testCases;
    }
}
