import java.util.Scanner;

public class J02StackUsingQueue {
    public static int queue[];
    public static int size;
    public static int front;
    public static int rear;

    public J02StackUsingQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1 || front == rear + 1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (rear == size - 1) {
            return true;
        }
        return false;
    }

    public void insert(int data) {
        if (!isFull()) {
            if (front == -1) {
                rear = 0;
                front = 0;
            }
            queue[++rear] = data;
        }
    }

    public int delete() {
        if (!isEmpty()) {
            return queue[front++];
        }
        return -1;
    }

    public void display() {
        System.out.println("Queue elements are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "  ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        J02StackUsingQueue Q1 = new J02StackUsingQueue(10);
        J02StackUsingQueue Q2 = new J02StackUsingQueue(10);
        while (true) {
            System.out.println("==========================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a value: ");
                    int value = sc.nextInt();
                    Q1.insert(value);
                    break;  
                case 2: 
                    
                default:
                    break;
            }
        }
    }
}