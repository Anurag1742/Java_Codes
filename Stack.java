public class Stack {

    public Stack(int size) {
        stack = new int[size];
        top = -1;
        this.size = size;
    }

    public static int size;
    public static int stack[];
    public int top;

    public void push(int data){
        if(!isFull()){
            stack[++top] = data;   
        }else{
            System.out.println("Stack is full.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int value = stack[top];
            top--;
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
        for(int i= top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(top == size - 1) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Stack stackDemo = new Stack(5); 
        stackDemo.push(1); 
        stackDemo.push(2); 
        stackDemo.push(3); 
        stackDemo.push(4); 
        stackDemo.push(5); 
        stackDemo.display(); 
        stackDemo.push(6); 
        stackDemo.pop(); 
        stackDemo.pop(); 
        stackDemo.display();
    }
}
