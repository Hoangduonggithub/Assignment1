import java.util.Stack;

public class StackADT {

    public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i<=10; i ++){
            stack.push(i);
        }
        System.out.println("Stack : "+ stack);
    }
    public static void stackPop(Stack<Integer>stack){
        stack.pop();
        System.out.println("Stack pop : "+ stack);
        int element = stack.pop();
        System.out.println("element : "+ element);
    }
    public  static void  stackPeek(Stack<Integer>stack){
        int element = stack.peek();
        System.out.println("element on the top : "+ element);
        System.out.println("Stack peek : "+ stack);
    }
    public  static void  stackSearch(Stack<Integer>stack, int element){
        int findElement = stack.search(element);
        if (findElement == - 1){
            System.out.println(element + " cannot find in the stack");
        }else{
            System.out.println(element + " is found at "+ findElement);
        }
    }

    public static void checkEmptyStack(Stack<Integer> stack){
        boolean result = stack.empty();
        if (result){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Stack is not empty");
        }
    }
}
