import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // Initialize an empty stack
        Stack<Integer> stack = new Stack<>();
// Push elements onto the stack
        stack.push(42);
        stack.push(10);
// Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
// Peek at the element on the top of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
// Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
