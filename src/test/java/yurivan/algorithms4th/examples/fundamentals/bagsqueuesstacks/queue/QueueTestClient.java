package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.queue;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class QueueTestClient {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                StdOut.print(queue.dequeue() + " ");
            }
        }

        StdOut.println("(" + queue.size() + " left on queue).");
    }
}
