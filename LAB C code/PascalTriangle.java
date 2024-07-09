public class PascalTriangle {
    // Print Pascal's triangle
    static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" "); // Print spaces for alignment
            }
            int coefficient = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(coefficient + " ");
                coefficient = coefficient * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 6; // Change this to the desired number of rows
        printPascal(numRows);
    }
}
