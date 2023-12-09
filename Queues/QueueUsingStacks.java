package Queues;
import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return a special value or throw an exception for an empty queue
        }

        // If stack2 is empty, transfer elements from stack1
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Pop from stack2 for dequeue operation
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks myQueue = new QueueUsingStacks();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println("Dequeue: " + myQueue.dequeue());

        myQueue.enqueue(40);
        myQueue.enqueue(50);

        while (!myQueue.isEmpty()) {
            System.out.println("Dequeue: " + myQueue.dequeue());
        }
    }
}
