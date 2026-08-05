package dataStructure.stack;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack(4);
        stack.getTop();
        stack.getHeight();
        stack.push(20);
        stack.push(27);
        stack.push(21);
        stack.push(29);
        stack.push(28);
        stack.printStack();
    }
}
