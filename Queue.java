public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    // Constructor
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0; // queue is initially empty
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedValue = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedValue;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queueArray[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Check if queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Get the size of the queue
    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue of size 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek()); // Should print 10
        System.out.println("Queue size is: " + queue.size()); // Should print 3

        System.out.println("Dequeued element: " + queue.dequeue()); // Should print 10
        System.out.println("Dequeued element: " + queue.dequeue()); // Should print 20

        System.out.println("Is queue empty? " + queue.isEmpty()); // Should print false

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70); // Should print "Queue is full. Cannot enqueue 70"

        System.out.println("Front element is: " + queue.peek()); // Should print 30
        System.out.println("Queue size is: " + queue.size()); // Should print 3
    }
}