import java.io.IOException;
import java.util.List;

public class maxSideLengthFinder {
    public void findMaxSideLength(String path)
    {
        String outputPath = path.substring(0, path.lastIndexOf('/') + 1) + "output.txt";

        try {
            List<TestCase> testCases = fileReader.readInput(path);

            closestPairFinder finder = new closestPairFinder();
            List<Pair> closestPairs = finder.findClosestPair(testCases);

            outputFileCreator jotter = new outputFileCreator();
            jotter.outputFile(outputPath, closestPairs);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
