class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedListSort {
    public static Node mergeSort(Node first) {
        if (first == null || first.link == null) {
            return first; // Base case: empty list or single element
        }

        // Split the list into two halves
        Node mid = findMiddle(first);
        Node left = first;
        Node right = mid.link;
        mid.link = null; // Break the link

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    private static Node findMiddle(Node first) {
        Node slow = first;
        Node fast = first;

        while (fast != null && fast.link != null && fast.link.link != null) {
            slow = slow.link;
            fast = fast.link.link;
        }

        return slow;
    }

    private static Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.data < right.data) {
                current.link = left;
                left = left.link;
            } else {
                current.link = right;
                right = right.link;
            }
            current = current.link;
        }

        // Append any remaining elements
        if (left != null) {
            current.link = left;
        }
        if (right != null) {
            current.link = right;
        }

        return dummy.link;
    }

    public static void main(String[] args) {
        // Example usage:
        Node originalList = new Node(3);
        originalList.link = new Node(1);
        originalList.link.link = new Node(2);

        Node sortedList = mergeSort(originalList);

        // Print the sorted list
        while (sortedList != null) {
            System.out.print(sortedList.data + " ");
            sortedList = sortedList.link;
        }
    }
}