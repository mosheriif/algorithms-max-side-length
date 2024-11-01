import java.awt.Point;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.err.println("Usage: java SquareMaxSideLength <input-file-path>");
//            return;
//        }

//        String filePath = args[0];
        String filePath = "D:/Computer and Systems Engineering Department/Level 3/First Semester/(CSE321) Design and Analysis of Algorithms/test.txt";

        try {
            List<TestCase> testCases = fileReader.readInput(filePath);

            for (TestCase testCase : testCases) {
                System.out.println("Number of Points: " + testCase.numPoints);
                for (Point point : testCase.points) {
                    System.out.println("Point: (" + point.x + ", " + point.y + ")");
                }
            }

            closestPairFinder finder = new closestPairFinder();
            List<Pair> tests = finder.findClosestPair(testCases);
            for (Pair pair : tests) {
                System.out.println("Point A: (" + pair.pointA.x + ", " + pair.pointA.y + ")");
                System.out.println("Point B: (" + pair.pointB.x + ", " + pair.pointB.y + ")");
                System.out.println("Distance: " + pair.distance);
                System.out.println("------------------------------------------------------------------");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    }
}