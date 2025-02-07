class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class QueueLL{
    private Node front;
    private Node rear;
    private int count;

    public QueueLL(){
        front=null;
        rear=null;
        count=0;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(rear==null){
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
        count++;
    }

    public int dequeue(){
        if(count==0){
            System.out.println("Queue is empty");
            return 0;
        }
        int data=front.data;
        front=front.next;
        count--;
        if(front==null) rear=null;
        return data;
    }

    public int peek(){
        if(count==0){
            System.out.println("Queue is empty");
            return 0;
        }
        return front.data;
    }

    public int size(){
        return count;
    }
}

public class QueueByLL {

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("top element is: "+queue.peek());
        System.out.println("size is: "+queue.size());
        queue.dequeue();
        System.out.println("top element is: "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println("top element is: "+queue.peek());
        System.out.println("size of queue: "+queue.size());
    }
}
