import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names); // Sort the names alphabetically

        System.out.println("\nSorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
