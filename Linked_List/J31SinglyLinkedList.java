import java.util.Scanner;

public class J31SinglyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Print LinkedList
    public void printList() {
        Node temp = head;
        // if (temp == null) {
        // System.out.println("Linked List is empty");
        // return;
        // }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at Beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add at Middle
    public void addMid(int index, int data) {
        if (index == 0 || index == 1) {
            addFirst(data);
            return;
        }
        if (index > size) {
            System.out.println("Invalid input");
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove First
    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty.");
            return;
        } else if (size == 1) {
            int val = head.data;
            size--;
            head = tail = null;
            System.out.println(val + " removed.");
            return;
        }
        int val = head.data;
        head = head.next;
        size--;
        System.out.println(val + " removed.");
    }

    // Remove last
    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty.");
            return;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            System.out.println(val + " removed.");
            return;
        }
        Node previous = head;
        for (int i = 0; i < size - 2; i++) {
            previous = previous.next;
        }

        int val = previous.next.data;
        previous.next = null;
        tail = previous;
        size--;
        System.out.println(val + " removed.");
    }

    // Find & Remove Nth node from End Iterative
    public void removeNthFromEnd(int n) {
        Node previsou = head;
        if (n == size) {
            head = head.next;
            size--;
            return;
        }
        for (int i = 1; i < size - n; i++) {
            previsou = previsou.next;
        }

        previsou.next = previsou.next.next;
        return;
    }

    // Search a key (Iterative)
    public int keySearchIterative(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Key not found.");
        return -1;
    }

    // Search a key (Recursive)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int keySearchRecursive(int key) {
        return helper(head, key);
    }

    // Reverse Linked List
    public void ReverseLL() {
        Node previous = null;
        Node current = tail = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // Find Middle Node
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Check Palindrome
    // public static boolean checkPalindrome() {

    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        J31SinglyLinkedList ll = new J31SinglyLinkedList();

        int data, choice;
        while (true) {
            System.out.println("\n-------------------------------------");
            System.out.println("1. Print Linked List & Size of Linked List");
            System.out.println("2. Insert at Beginning.");
            System.out.println("3. Insert at Last.");
            System.out.println("4. Insert at Middle.");
            System.out.println("5. Remove First element.");
            System.out.println("6. Remove Last element.");
            System.out.println("7.");
            System.out.println("8. Search a key (Iterative).");
            System.out.println("9. Search a key (recursive).");
            System.out.println("10. Reverse Linked List.");
            System.out.println("11. Remove Nth Node from end.");
            System.out.println("12. Check Palindrome.");

            System.out.print("\nEnter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Elements are:- ");
                    ll.printList();
                    System.out.println("Size of Linked List: " + size);
                    break;
                case 2:
                    System.out.print("Enter the element:- ");
                    data = sc.nextInt();
                    ll.addFirst(data);
                    break;
                case 3:
                    System.out.print("Enter the element:- ");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;
                case 4:
                    System.out.print("Enter the index: ");
                    int index = sc.nextInt();
                    System.out.print("Enter the element:-");
                    data = sc.nextInt();
                    break;
                case 5:
                    ll.removeFirst();
                    break;
                case 6:
                    ll.removeLast();
                    break;

                case 7:
                    break;
                case 8:
                    System.out.print("Enter key : ");
                    int key = sc.nextInt();
                    int idx = ll.keySearchIterative(key);
                    System.out.println("Key is found at position: " + idx++);
                    break;
                case 9:
                    System.out.print("Enter a key: ");
                    key = sc.nextInt();
                    idx = ll.keySearchRecursive(key);
                    System.out.println("Key is found at position: " + idx++);
                    break;
                case 10:
                    System.out.println("Before reverse: ");
                    ll.printList();

                    ll.ReverseLL();
                    System.out.println("After reverse: ");
                    ll.printList();

                    break;

                case 11:
                    System.out.print("Which node do you want to delete (from end): ");
                    int n = sc.nextInt();
                    ll.removeNthFromEnd(n);
                    break;

                default:
                    return;
            }
        }
    }
}