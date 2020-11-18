package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class StackTestClient {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                StdOut.print(stack.pop() + " ");
            }

            StdOut.println("(" + stack.size() + " left on stack).");
        }
    }
}
