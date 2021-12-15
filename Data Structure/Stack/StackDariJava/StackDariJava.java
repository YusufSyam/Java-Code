package Stack.StackDariJava;

import java.util.Stack;

public class StackDariJava{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        System.out.println(stack.search(1));
        stack.push(2);
        System.out.println(stack.search(1));
        stack.push(3);
        System.out.println(stack.search(1));
        stack.push(4);
        System.out.println(stack.search(1));
        System.out.println(stack.peek());
    }
}