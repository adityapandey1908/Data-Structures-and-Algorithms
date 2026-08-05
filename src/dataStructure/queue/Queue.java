package dataStructure.queue;

public class Queue {
    private Node first;
    private Node last;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        height=1;
    }
    public void printQueue(){
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: "+ first.value);
    }
    public void getLast(){
        System.out.println("Last: "+ last.value);
    }
    public void height(){
        System.out.println("length: "+ height);
    }

    public void enqueue(int value){
        if(height == 0){
            Node newNode = new Node(value);
            first = newNode;
            last = newNode;
        }else{
            Node newNode = new Node(value);
            last.next = newNode;
            last = newNode;
        }
        height++;
    }
    public Node dequeue(){
        if(height == 0) return null;
        Node temp = first;
        if(height == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        height--;
        return temp;
    }
}
