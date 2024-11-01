public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java SquareMaxSideLength <input-file-path>");
            return;
        }

        String filePath = args[0];
//        String filePath = "D:/Computer and Systems Engineering Department/Level 3/First Semester/(CSE321) Design and Analysis of Algorithms/Programming Assignments/Assignment 1/algorithms-max-side-length/output-test/test.txt";

        maxSideLengthFinder solve = new maxSideLengthFinder();
        solve.findMaxSideLength(filePath);

    }
}