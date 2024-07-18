class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedListCopy {
    public static Node copyLinkedList(Node first) {
        if (first == null) {
            return null; 
        }

        
        Node dummy = new Node(-1);
        Node current = dummy;

       
        while (first != null) {
            Node newNode = new Node(first.data);
            current.link = newNode;
            current = current.link;

           first = first.link;
        }

        return dummy.link;
    }

    public static void main(String[] args) {
       
        Node originalList = new Node(1);
        originalList.link = new Node(2);
        originalList.link.link = new Node(3);

        Node copiedList = copyLinkedList(originalList);

        while (copiedList != null) {
            System.out.print(copiedList.data + " ");
            copiedList = copiedList.link;
        }
    }
}