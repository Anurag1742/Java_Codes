public class Demo2 {
    public Demo2(int size) {
        stack = new int[size];
        top = -1;
        this.size = size;
    }

    public static int size;
    public static int stack[];
    public int top;

    public void push(int data) {
        if (!isFull()) {
            stack[++top] = data;
        } else {
            System.out.println("Stack is Full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int value = stack[top--];
            return value;
        } else {
            System.out.println("Stack is Empty.");
        }
        return -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        
        Demo2 s = new Demo2(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.push(6);
        s.pop();
        s.pop();
        s.display();
    }
}

