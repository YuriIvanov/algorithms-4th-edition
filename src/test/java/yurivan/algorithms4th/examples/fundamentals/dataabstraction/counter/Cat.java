package yurivan.algorithms4th.examples.fundamentals.dataabstraction.counter;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.Out;

public class Cat {
    public static void main(String[] args) {
        Out out = null;
        try {
            out = new Out(args[args.length - 1]);
            for (int i = 0; i < args.length - 1; ++i) {
                In in = null;
                try {
                    in = new In((args[i]));
                    String s = in.readAll();
                    out.println(s);
                } finally {
                    if (null != in) {
                        in.close();
                    }
                }
            }
        } finally {
            if (null != out) {
                out.close();
            }
        }
    }
}
