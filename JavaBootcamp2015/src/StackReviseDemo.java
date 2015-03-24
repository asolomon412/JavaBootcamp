
public class StackReviseDemo {

    public static void main(String[] args) {
        StackExample newStack = new StackExample(5);
        newStack.push(10);
        newStack.push(14);
        newStack.push(9);
        newStack.push(20);
        newStack.push(90);

        newStack.display();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.display();
    }
}
