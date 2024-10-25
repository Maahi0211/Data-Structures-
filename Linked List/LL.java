class Node{
    int data;
    Node next;

    Node(int d){
        this.data=d;
        this.next=null;
    }
}

public class LL {

    Node head;
    LL(){
        this.head=null;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public void insertPosition(int data, int pos){
        Node temp=head;
        if(pos==1){
            insertFirst(data);
        }
        else {
            Node newNode=new Node(data);
            for(int i=1; i<pos-1; i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    public void deleteFirst(){
        head=head.next;
    }

    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deletePosition(int pos){
        Node temp=head;
        if(pos==1){
            deleteFirst();
        }
        else {
            for(int i=1; i<pos-1; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }

    public static void main(String[] args) {
        LL a = new LL();
        a.insertLast(10);
        a.insertLast(33);
        a.insertLast(44);
        a.insertFirst(22);
        // a.print();
        // a.deleteFirst();
        // a.deleteLast();
        // a.print();
        a.insertPosition(2, 3);
        a.deletePosition(4);
        a.print();

    }

}
