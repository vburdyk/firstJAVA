import java.util.List;
import java.util.Scanner;

/**
 * The Main class is the entry point of the Lucas Numbers program.
 */
public class Main
{
    /**
     * The main method where the program execution begins.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Enter the number of Luke numbers to find: "); // Ask the user to enter the number of Luke  numbers they want
        int n = scanner.nextInt();

        LukeNumber lukeNumber = new LukeNumber(n); // Create an instance of the LukeNumber class with the specified number of Lucas numbers

        List<Integer> sq = lukeNumber.findSquares(); // Call the findSquares method to find Lucas numbers that are perfect squares

        System.out.println("Numbers that are squares: " + sq);
    }
}