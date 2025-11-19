package dsa_queue;

public class L232 {
    
}
class MyQueue {
    Stack<Integer> inS;
    Stack<Integer> outS;

    public MyQueue() {
        inS = new Stack<>();
        outS = new Stack<>();
    }
    
    public void push(int x) {
        inS.push(x);
    }
    
    public int pop() {
        if(outS.size()!=0){
            return outS.pop();
        } else {
            // outS == 0
            if(inS.size()==0){
                return -1;
            } else {
                while(!inS.isEmpty()){
                    outS.push(inS.pop());
                }
                return outS.pop();
            }
        }
    }
    
    public int peek() {
        if(outS.size()!=0){
            return outS.peek();
        } else {
            // outS == 0
            if(inS.size()==0){
                return -1;
            } else {
                while(!inS.isEmpty()){
                    outS.push(inS.pop());
                }
                return outS.peek();
            }
        }
    }
    
    public boolean empty() {
        return inS.isEmpty()==true && outS.isEmpty()==true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */