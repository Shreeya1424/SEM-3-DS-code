import java.util.Scanner;
   
public class MenuDriven {

    public int[] arr;
    public int front, rear, capacity;

    public MenuDriven(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = this.rear = -1;
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty())
            front = 0;
        arr[++rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = arr[front];
        if (front == rear)
            front = rear = -1;
        else
            front++;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        MenuDriven queue = new MenuDriven(capacity);

        int choice, data;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    data = queue.dequeue();
                    if (data != -1)
                        System.out.println("Dequeued element: " + data);
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

