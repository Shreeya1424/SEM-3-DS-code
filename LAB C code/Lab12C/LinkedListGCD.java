class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedListGCD {
    public static int gcd(int a, int b) {
        // Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static Node addGCDNodes(Node first) {
        if (first == null || first.link == null) {
            return first; // Empty list or single node
        }

        Node current = first;
        while (current != null && current.link != null) {
            int gcdValue = gcd(current.data, current.link.data);

            // Create a new node with the computed GCD
            Node newNode = new Node(gcdValue);
            newNode.link = current.link;
            current.link = newNode;

            current = newNode.link; // Move to the next pair
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
        Node originalList = new Node(18);
        originalList.link = new Node(10);
        originalList.link.link = new Node(6);
        originalList.link.link.link = new Node(6);
        originalList.link.link.link.link = new Node(2);
        originalList.link.link.link.link.link = new Node(10);
        originalList.link.link.link.link.link.link = new Node(1);
        originalList.link.link.link.link.link.link.link = new Node(3);

        Node modifiedList = addGCDNodes(originalList);
        printList(modifiedList); // Print the modified list
    }
}