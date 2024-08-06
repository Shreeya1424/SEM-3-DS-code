class Node1 {
    int data;
    Node1 link;

    public Node1(int data) {
        this.data = data;
        this.link = null;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        // Create a sample node with data 42
        Node1 node = new Node1(42);

        // Print the node's data
        System.out.println("Node data: " + node.data);
    }
}

