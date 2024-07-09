import java.util.Arrays;

public class ArrayShuffling {
    public static void main(String[] args) {
        int[] A = { 3, 1, 4, 2, 5 }; // Example input array A

        Arrays.sort(A); // Sort array A in ascending order

        int N = A.length;
        int[] B = new int[N];

        int left = 0, right = N - 1;
        int idx = 0;

        while (left <= right) {
            B[idx++] = A[right--];
            B[idx++] = A[left++];
        }

        // If A has odd length, add the middle element
        if (N % 2 == 1) {
            B[idx] = A[N / 2];
        }

        // Print array B
        System.out.println("Array B (shuffled): " + Arrays.toString(B));
    }
}

