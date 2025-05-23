package Linked_List;
// remove duplicate node from the sorted list
class Node{
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class J35RemoveDuplicate2 {

    public static Node removeDuplicates(Node head) {
        Node current = head;

        while(current != null &&  current.next != null) {
            if (current.data == current.next.data)  {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // function to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}