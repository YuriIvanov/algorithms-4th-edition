package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.queue;

import edu.princeton.cs.introcs.In;

public class SampleQueueClient {
    public static int[] readInts(String name) {
        In in = new In(name);

        Queue<Integer> queue = new Queue<>();
        while (!in.isEmpty()) {
            queue.enqueue(in.readInt());
        }

        int queueSize = queue.size();
        int[] ints = new int[queueSize];
        for (int i = 0; i < queueSize; ++i) {
            ints[i] = queue.dequeue();
        }

        return ints;
    }
}
