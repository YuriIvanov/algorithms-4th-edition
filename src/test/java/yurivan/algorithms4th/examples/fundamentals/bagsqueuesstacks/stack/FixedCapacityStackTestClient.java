package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class FixedCapacityStackTestClient {
    public static void main(String[] args) {
        FixedCapacityStack<String> stack = new FixedCapacityStack<>(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                StdOut.print(stack.pop() + " ");
            }
        }

        StdOut.println("(" + stack.size() + " left on stack.");
    }
}
