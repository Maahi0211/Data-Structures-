class Node{
    int data;
    Node next;
    Node pre;

    Node (int d){
        this.data=d;
        this.next=null;
        this.pre=null;
    }
}

public class DoubleLL {

    Node head;
    Node tail;

    DoubleLL(){
        this.head=null;
        this.tail=null;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public void printReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.pre;
        }
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.pre=newNode;
            head=newNode;
        }
    }

    public void insertPosition(int data, int pos){
        if(pos==1){
            insertFirst(data);
        }
        else{
            Node temp=head;
            Node newNode = new Node(data);
            for(int i=1; i<pos-1; i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            newNode.pre=temp;
            temp.next.pre=newNode;
            temp.next=newNode;
        }
    }

    public void deleteFirst(){
        head=head.next;
        head.pre=null;
    }

    public void deleteLast(){
        tail=tail.pre;
        tail.next=null;
    }

    public void deletePosition(int pos){
        if(pos==1){
            deleteFirst();
        }
        else{
            Node temp=head;
            for(int i=1; i<pos-1; i++){
                temp=temp.next;
            }
            temp.next.next.pre=temp;
            temp.next=temp.next.next;
        }
    }

    public static void main(String[] args) {
        DoubleLL a = new DoubleLL();
        a.insertFirst(2);
        a.insertFirst(4);
        // //a.print();
        // a.printReverse();
        a.insertLast(44);
        a.insertPosition(7,3);
        // a.print();
        // a.printReverse();
        // a.deleteFirst();
        //
        a.deletePosition(3);
        a.deleteLast();
        a.print();
        // a.printReverse();
    }
}