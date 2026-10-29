class MyStack {
    Queue<Integer>q1 = new LinkedList<>();
    Queue<Integer>q2 = new LinkedList<>();

    public MyStack() {
        this.q1 = q1;
        this.q2 = q2;
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
    }
    
    public int pop() {
        int val = q1.peek();
        q1.remove();
        return val;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
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