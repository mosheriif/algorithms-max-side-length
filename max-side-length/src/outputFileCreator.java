import java.util.List;
import java.io.*;

public class outputFileCreator {
    public void outputFile(String path, List<Pair> closestPairsList)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Pair closestPair : closestPairsList) {
                writer.write(Integer.toString((int)(closestPair.distance)));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to output file: " + e.getMessage());
        }
    }
}
