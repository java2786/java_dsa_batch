// create your own stack with maximum 5 values

import java.util.Arrays;

class MyStack{
    private int size = 0;
    int[] arr = null;
    int top = -1;

    public MyStack(int max){
        arr = new int[max];
    }

    public int size(){
        return size;
    }

    public void push(int n){
        if(size==arr.length){
            System.out.println("Storage full");
            return;
        }
        arr[size] = n;
        size++;
        top++;
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int a = arr[top];
        top--;
        size--;
        return a;
    }
    public int peek(){
        if(top < 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int a = arr[top];
        return a;
    }

    @Override
    public String toString() {
        return "MyStack [arr=" + Arrays.toString(arr) + "]";
    }

    
}
public class MyStackDemo {
    
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(43);
        System.out.println(stack.size()); // 1
        stack.push(21);
        int n = stack.pop();
        int m = stack.peek();
        System.out.println(n); // 21
        System.out.println(m); // 43

        System.out.println(stack.size()); // 1

        System.out.println(stack.pop());

        stack.pop(); // error -> -1
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.push(99);
        
        System.out.println(stack);
        System.out.println(stack.toString());
    }
}
