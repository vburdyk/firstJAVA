import java.util.List;
import java.util.ArrayList;

/**
 * The LukeNumber class is used to calculate and find Lucas numbers and their squares.
 */
public class LukeNumber {
    private final int N;

    /**
     * Constructor to initialize the number of Lucas numbers to find.
     *
     * @param n The number of Lucas numbers to calculate.
     */
    public LukeNumber(int n) {
        this.N = n;
    }

    /**
     * Recursive method to calculate Lucas numbers.
     *
     * @param n The index of the Lucas number to calculate.
     * @return The nth Lucas number.
     */
    public int Luke(int n) {
        if (n == 0)
            return 2;
        else if (n == 1)
            return 1;
        else
            return Luke(n - 1) + Luke(n - 2);
    }

    /**
     * Find Lucas numbers that are perfect squares.
     *
     * @return A list of Lucas numbers that are perfect squares.
     */
    public List<Integer> findSquares() {
        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int lucas = Luke(i);
            if (Math.sqrt(lucas) % 1 == 0) {
                squares.add(lucas);
            }
            System.out.print(lucas);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        return squares;
    }
}