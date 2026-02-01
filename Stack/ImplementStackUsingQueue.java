// Problem: Implement Stack using Queue
// Pattern: Queue
// Technique: Queue Rotation
// Push: O(n), Pop: O(1), Top: O(1)
// Space Complexity: O(n)

import java.util.Queue;
import java.util.LinkedList;

class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
