package dataStructure.stack;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack(4);
        stack.getTop();
        stack.getHeight();
        stack.push(20);
        stack.printStack();
        stack.pop();
    }
}
