class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedListSwapKthNodes {
    public static Node swapKthNodes(Node first, int K) {
        if (first == null || K <= 0) {
            return first; // Invalid input
        }

        // Find the length of the list
        int length = 0;
        Node current = first;
        while (current != null) {
            length++;
            current = current.link;
        }

        if (K > length) {
            return first; // K is out of bounds
        }

        // Find the Kth node from the beginning
        Node KthFromStart = first;
        for (int i = 1; i < K; i++) {
            KthFromStart = KthFromStart.link;
        }

        // Find the Kth node from the end
        Node KthFromEnd = first;
        for (int i = 1; i < length - K + 1; i++) {
            KthFromEnd = KthFromEnd.link;
        }

        // Swap values
        int temp = KthFromStart.data;
        KthFromStart.data = KthFromEnd.data;
        KthFromEnd.data = temp;

        return first;
    }

    // Helper method to print the linked list
    public static void printList(Node first) {
        while (first != null) {
            System.out.print(first.data + " ");
            first = first.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        Node originalList = new Node(1);
        originalList.link = new Node(2);
        originalList.link.link = new Node(3);
        originalList.link.link.link = new Node(4);
        originalList.link.link.link.link = new Node(5);

        int K = 2; // Swap the 2nd nodes from both ends

        Node swappedList = swapKthNodes(originalList, K);
        printList(swappedList); // Print the modified list
    }
}