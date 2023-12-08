package LinkedList;

public  class LinkedList {
  private static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            next=null;
        }
    }
    private static Node head;
    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
       
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        
        delete();
        delete();
        delete();
        delete();
        delete();
        
       
        
        printList();
        reverse();
        addFirst(10);
        addLast(20);
        
        printList();
        System.out.println("Mid = "+mid());

    }
    public static void addFirst(int value){
        Node n1 = new Node(value);
        n1.next=head;
        head=n1;
    }
    public static void addLast(int value){
        Node n1 = new Node(value);
        Node current = head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next = n1;

    }
    public static void addAtKPosition(int k,int value){
        Node n1 = new Node(value);
        Node current = head;
        for(int i=1;i<=k-1;i++){
            current=current.next;
        }
        Node temp = current.next;
        current.next=n1;
        n1.next=temp;
    }
    public static void printList(){
        Node current=head;
        System.out.println("The LinkedList Elements are : ");
        while (current!=null) {
            System.out.print(current.value+" ");
            current=current.next;
        }
    }
    public static void delete(){
        head=head.next;
    }
    public static void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void reverse(){
        Node current = head;
        Node  Previous = null;
        while (current!=null) {
            Node currp = current.next;
            current.next=Previous;
            Previous=current;
            current=currp;
        }
       head=Previous;
    }
public static int mid(){
    Node fast = head;
    Node slow = head;
    while(fast.next != null && fast.next.next != null){
        slow=slow.next;
        fast=fast.next.next;

    }
    return slow.value;
}
}
