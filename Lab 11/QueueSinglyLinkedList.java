class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

public class QueueSinglyLinkedList {

    
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.link = newNode;
                rear = newNode;
            }
        }
    
        public int dequeue() {
            if (front == null) {
                throw new IllegalStateException("Queue is empty.");
            }
            int dequeuedValue = front.data;
            front = front.link;
            if (front == null) {
                rear = null; 
            }
            return dequeuedValue;
        }
    
        public boolean isEmpty() {
            return front == null;
        }
    
        public int peep() {
            if (front == null) {
                throw new IllegalStateException("Queue is empty.");
            }
            return front.data;
        }
    
        public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            QueueSinglyLinkedList A = new QueueSinglyLinkedList();
            A.enqueue(10);
            A.enqueue(20);
            A.enqueue(30);
    
            System.out.println("Front element: " + A.peep());
            System.out.println("Dequeued element: " + A.dequeue());
            System.out.println("Is queue empty? " + A.isEmpty());
        }
    }
    
    
}
