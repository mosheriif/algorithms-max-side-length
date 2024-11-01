import java.awt.Point;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java SquareMaxSideLength <input-file-path>");
            return;
        }

        String filePath = args[0];
        try {
            List<fileReader.TestCase> testCases = fileReader.readInput(filePath);

            for (fileReader.TestCase testCase : testCases) {
                System.out.println("Number of Points: " + testCase.numPoints);
                for (Point point : testCase.points) {
                    System.out.println("Point: (" + point.x + ", " + point.y + ")");
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}