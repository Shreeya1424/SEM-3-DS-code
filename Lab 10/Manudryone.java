import java.util.Scanner;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
public class Manudryone{
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

// insert at end
public static void insertAtLast(int data){
    Node newNode = new Node(data);
    if(first==null){
        first=newNode;
        return;
    }
    Node last=first;
    while(last.link !=null){
        last=last.link;
    }
    last.link=newNode;
}
// insert at order

public static void insertAtOrder(int data){
    Node newNode = new Node(data);
    if(first==null || newNode.data<=first.data){
        newNode.link=first;
        first=newNode;
        return;
    }
    Node current = first;
    while(current.link !=null && newNode.data>=current.link.data){
        current=current.link;
    }
    newNode.link=current.link;
    current.link=newNode;
}
// delet at first
public static void deleteFromFirst(int key){
    // Node newNode = new Node(data);
    if(first==null){
        System.out.println("empty");
        return;
    }
    Node temp=first,prev=null;
    if(temp.data==key){
        first=temp.link;
        return;
    }
    while(temp !=null && temp.data != key){
        prev=temp;
        temp=temp.link;
    }
    if(temp==null){
        System.out.println("Node not found");
        return;
    }
    prev.link=temp.link;
}
// delete at last
public static void deleteFromLast(int key) {
    if (first == null) {
        System.out.println("Linked List is empty!");
        return;
    }
    if (first.link == null) {
        int deletedData = first.data;
       first = null;
        count--;
        System.out.println("Deleted element from the end: " + deletedData);
        return;
    }
    Node temp = first;
    while (temp.link.link != null) {
        temp = temp.link;
    }
    int deletedData = temp.link.data;
    temp.link = null;
    count--;
    System.out.println("Deleted element from the end: " + deletedData);
}
// delet from position
public static void deleteFromPosition(int position) {
    if (position < 1 || position > count) {
        System.out.println("Invalid position. Please enter a valid position.");
        return;
    }
    if (position == 1) {
        // deleteFromFirst();
        return;
    }
    Node temp = first;
    for (int i = 1; i < position - 1; i++) {
        temp = temp.link;
    }
    int deletedData = temp.link.data;
    temp.link = temp.link.link;
    count--;
    System.out.println("Deleted element from position " + position + ": " + deletedData);
}
// display
 public static void display() {
        Node temp = first;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Manudryone S = new Manudryone();

        while (true) {
            System.out.println("--- Operations Singly Linked List ---");
            System.out.println("1. Insert at the front");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete the first node");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node from specified position");
            System.out.println("7. Display all nodes");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert at the front: ");
                    int firstData = sc.nextInt();
                    S.insertAtFirst(firstData);
                    S.display();
                    break;
                    case 2:
                    System.out.print("Enter the value to insert at the end: ");
                    int endData = sc.nextInt();
                    S.insertAtLast(endData);
                    S.display();
                    break;
                    case 3:
                    System.out.print("Enter the value to insert at the position: ");
                    int position = sc.nextInt();
                    S.insertAtOrder(position);
                    S.display();
                    break;
                case 4:
                   int key=sc.nextInt();
                    S.deleteFromFirst(key);
                    S.display();
                    break;
                
                case 5:
                   int key1=sc.nextInt();
                   S.deleteFromLast(key1);
                   S.display();
                    break;
                case 6:
                    System.out.print("Enter the position to delete: ");
                    int Order = sc.nextInt();
                    S.deleteFromPosition(Order);
                    S.display();
                    break;
                    case 7:
                        S.display();
                        break;
                case 8:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}

























