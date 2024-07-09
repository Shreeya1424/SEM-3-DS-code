import java.util.Scanner;

public class PatternChecker {
    public static boolean isPatternValid(String input){
        int countA = 0;
        int countB = 0;

        for (char ch : input.toCharArray()) {
            if (ch == 'a') {
                countA++;
            } else if (ch == 'b') {
                countB++;
            } else {
                // Invalid character (neither 'a' nor 'b')
                return false;
            }
        }

        return countA == countB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isValid = isPatternValid(inputString);
        if (isValid) {
            System.out.println("The input string follows the pattern aib^i.");
        } else {
            System.out.println("The input string does not follow the specified pattern.");
        }
    }
}

