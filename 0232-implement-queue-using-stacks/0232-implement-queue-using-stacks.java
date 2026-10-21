class MyQueue {
    private Stack<Integer> f;
    private Stack<Integer> s;

    public MyQueue() {
        f = new Stack<>();
        s = new Stack<>();
    }
    
    public void push(int x) {
        f.push(x);
    }
    
    public int pop() {
        if(s.isEmpty()){
            while(!f.isEmpty()){
                s.push(f.pop());
            }
        }
        return s.pop();
    }
    
    public int peek() {
        if(s.isEmpty()){
            while(!f.isEmpty()){
                s.push(f.pop());
            }
        }

        return s.peek();
    }
    
    public boolean empty() {
        return f.isEmpty() && s.isEmpty();
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