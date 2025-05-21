package Linked_List;

public class J34RemoveDuplicate1 {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head = null;

    // Insert at end
    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data > data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove duplicates from sorted list
    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate
            } else {
                current = current.next;
            }
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        J34RemoveDuplicate1 list = new J34RemoveDuplicate1();

        // Add elements (sorted input)
        list.insertSorted(1);
        list.insertSorted(1);
        list.insertSorted(2);
        list.insertSorted(3);
        list.insertSorted(3);

        System.out.println("Before removing duplicates:");
        list.display();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.display();
    }
}
