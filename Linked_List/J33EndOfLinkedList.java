package Linked_List;

public class J33EndOfLinkedList {
    class Node  {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head = null;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
        temp = temp.next;

    temp.next = newNode;
    }

    // Remove n-th node from the end
    public void removeNthFromEnd(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        // Move first n+1 steps ahead
        for( int i = 0; i <= n; i++) {
            if (first == null) {
                System.out.println("n is grater than the length of the list");
                return;
            }
            first =  first.next;
        }

        // Move both pointers
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        //Delete node
        second.next = second.next.next;

        //Update head in case first node was removed
        head = dummy.next;
    }
    // print linked list
    public void traverse() {
        Node temp = head;
        System.out.println("Linked  List: ");
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        J33EndOfLinkedList list = new J33EndOfLinkedList();

        // Add valuees : 1,2,3,4,5
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println("Before removal: ");
        list.traverse();  // 1 2 3 4 5
        
        int n = 2;
        list.removeNthFromEnd(n);

        System.out.println("After removing  " + n + "th node from end: ");
        list.traverse();  // 1 2 3 5
    }
}
