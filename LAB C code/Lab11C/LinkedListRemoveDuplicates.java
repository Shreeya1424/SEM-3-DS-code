class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedListRemoveDuplicates {
    public static Node removeDuplicates(Node first) {
        if (first == null || first.link == null) {
            return first; // Empty list or single node
        }

        Node current = first;
        while (current != null && current.link != null) {
            if (current.data == current.link.data) {
                // Duplicate found, skip the next node
                current.link = current.link.link;
            } else {
                // Move to the next distinct node
                current = current.link;
            }
        }

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
        originalList.link = new Node(1);
        originalList.link.link = new Node(6);
        originalList.link.link.link = new Node(13);
        originalList.link.link.link.link = new Node(13);
        originalList.link.link.link.link.link = new Node(13);
        originalList.link.link.link.link.link.link = new Node(27);
        originalList.link.link.link.link.link.link.link = new Node(27);

        Node deduplicatedList = removeDuplicates(originalList);
        printList(deduplicatedList); // Print the deduplicated list
    }
}