package dataStructure.queue;

public class Main {
    public static void main(String[] args){
        Queue queue = new Queue(20);
        queue.getFirst();
        queue.getLast();
        queue.enqueue(85);
        queue.enqueue(87);
        System.out.println(queue.dequeue());
        queue.printQueue();
    }
}
