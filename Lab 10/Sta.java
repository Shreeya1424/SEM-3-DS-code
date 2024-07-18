import java.util.Scanner;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
public class Sta{
    public static Node first = null;
    public static int count = 0;

    // insert at first
public static void insertAtFirst(int data){
    Node newNode = new Node(data);
    if(first==null){
        first=newNode;
       return;
    }
    Node temp=first;
    first=newNode;
    first.link=temp;
    return;
}


}