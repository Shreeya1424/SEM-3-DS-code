import java.util.Scanner;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
public class StackUsingLinkedList{
    public static Node top = null;
    public static int count = 0;

    // insert at first
public static void push(int data){
    Node newNode = new Node(data);
    if(top==null){
        top=newNode;
       return;
    }
    Node temp=top;
    top=newNode;
    top.link=temp;
    return;
}
// delet at first
public static void pop(int key){
    // Node newNode = new Node(data);
    if(top==null){
        System.out.println("empty");
        return;
    }
    Node temp=top,prev=null;
    if(temp.data==key){
        top=temp.link;
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
// display
    public static void display() {
        Node temp = top;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        StackUsingLinkedList S = new StackUsingLinkedList();

        while (true) {
            System.out.println("--- Operations Singly Linked List ---");
            System.out.println("1. push the value");
            System.out.println("2. pop the value");
            System.out.println("3. Display all stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert at the front: ");
                    int firstData = sc.nextInt();
                    S.push(firstData);
                    S.display();
                    break;
                case 2:
                   int key=sc.nextInt();
                    S.pop(key);
                    S.display();
                    break;
                case 3:
                        S.display();
                        break;
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }

}