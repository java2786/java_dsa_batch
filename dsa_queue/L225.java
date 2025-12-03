package dsa_queue;

public class L225 {
    
}

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.size()==0){
            return -1;
        }
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size()>1){
            q2.add(q.poll());
        }

        int temp = q.poll();
        q = q2;
        return temp;
    }
    
    public int top() {
        if(q.size()==0){
            return -1;
        }
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size()>1){
            q2.add(q.poll());
        }

        int temp = q.peek();
        q2.add(q.poll());
        q = q2;
        return temp;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */