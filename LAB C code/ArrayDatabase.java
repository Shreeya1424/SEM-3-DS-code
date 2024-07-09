public class ArrayDatabase {

    // Compute the sum of an array of integers
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Find the minimum value in an array of integers
    public static int min(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int num : arr) {
            minValue = Math.min(minValue, num);
        }
        return minValue;
    }

    // Find the maximum value in an array of integers
    public static int max(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : arr) {
            maxValue = Math.max(maxValue, num);
        }
        return maxValue;
    }

    // Compute the average (mean) of an array of integers
    public static double avg(int[] arr) {
        if (arr.length == 0) {
            return 0.0; // Handle empty array case
        }
        int total = sum(arr);
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        int[] data = { 10, 20, 5, 15, 30 };

        System.out.println("Sum: " + sum(data));
        System.out.println("Min: " + min(data));
        System.out.println("Max: " + max(data));
        System.out.println("Avg: " + avg(data));
    }
}

