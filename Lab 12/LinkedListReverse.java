class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedListReverse {
    public static Node reverseLinkedList(Node first) {
        Node prev = null;
        Node current = first;

        while (current != null) {
            Node nextTemp = current.link; // Store the next node
            current.link = prev; // Reverse the link

            // Move to the next nodes
            prev = current;
            current = nextTemp;
        }

        return prev; // The new head of the reversed list
    }

    public static void main(String[] args) {
        // Example usage:
        Node originalList = new Node(1);
        originalList.link = new Node(2);
        originalList.link.link = new Node(3);

        Node reversedList = reverseLinkedList(originalList);

        // Print the reversed list
        while (reversedList != null) {
            System.out.print(reversedList.data + " ");
            reversedList = reversedList.link;
        }
    }
}