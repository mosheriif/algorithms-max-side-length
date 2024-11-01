# Maximum Square Side Length Around Points

This project is part of the (CSE321) Analysis and Design of Algorithms course. The program computes the maximum side length of squares that can be drawn around a set of two-dimensional points, ensuring that no two squares intersect except at their sides. The program utilizes a divide-and-conquer approach to efficiently determine the largest possible square for each point.

## Problem Statement

Given a set of two-dimensional points, the goal is to compute the maximum side length of the square that can be drawn around each point, such that no two squares intersect, except at the sides.

### Notes:
- Each point is treated as the center of the square around it.
- The sides of the squares can only be horizontal and vertical.

## Input Format

The input to the program is a single file containing several test cases. Each test case follows this structure:
- The first line contains an integer representing the number of points.
- Each of the following lines contains two integers representing the x and y coordinates of a point.

### Example Input:
```
4
1 1
3 3
5 5
6 6
3
-4 2
-3 7
-3 -9
```

## Output Format

For each test case, the program outputs a single integer on a separate line, representing the maximum side length of the square for each test case. The output will be saved in a file named `output.txt`, which will be located in the parent folder of the input test file.

### Example Output:
```
1
5
```

## How to Run

1. **Compile the Program**:
   Ensure you have Java installed on your machine. Compile the Java source files using:
   ```bash
   javac YourMainClass.java
   ```

2. **Create a JAR File**:
   After compiling, create a JAR file (e.g., `MaxSquareSideLength.jar`):
   ```bash
   jar cvfe MaxSquareSideLength.jar YourMainClass *.class
   ```

3. **Run the Program**:
   Execute the JAR file with the absolute path to the input file as an argument:
   ```bash
   java -jar max-side-length.jar "path/to/your/testfile.txt"
   ```

## Requirements

- Java SE 8 or higher


## References

- [iDeer7. (2021, May 05). Closest Pair of Points (Divide and Conquer) Explained. YouTube.](https://www.youtube.com/watch?v=6u_hWxbOc7E)
- [Inside code. (2021, July 24). How to find the closest pair of points in O(nlogn)? - Inside code. Youtube](https://www.youtube.com/watch?v=ldHA8UcQI9Q)
- [GeeksforGeeks. "Closest Pair of Points | Divide and Conquer Algorithm." GeeksforGeeks. Accessed [2024, Nov 01].](https://www.geeksforgeeks.org/closest-pair-of-points-using-divide-and-conquer-algorithm/)



## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.