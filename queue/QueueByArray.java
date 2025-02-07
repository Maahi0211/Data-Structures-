class Queue{
    private int[] queue;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {
        queue=new int[capacity];
        front=0;
        rear=0;
        count=0;
    }
    public void enqueue(int value) {
        if(count==queue.length) {
            System.out.println("Queue is full");
            return;
        }
        rear=rear%queue.length;
        queue[rear]=value;
        rear++;
        count++;
    }

    public int dequeue(){
        if(count==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        front=front%queue.length;
        front++;
        count--;
        return value;
    }

    public int peek(){
        if(count==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int size(){
        return count;
    }
}

public class QueueByArray {

    public static void main(String[] args) {
        Queue queue=new Queue(7);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(3);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("top element is: "+queue.peek());

        queue.dequeue();
        System.out.println("top element is: "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(80);

        System.out.println("top element is: "+queue.peek());
        System.out.println("size: "+queue.size());
    }
}
