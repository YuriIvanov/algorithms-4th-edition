package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }

        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
