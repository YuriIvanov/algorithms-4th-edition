package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();

        In in = new In(new Scanner(args[0]));
        while (!in.isEmpty()) {
            // Read token, push if operator.
            String token = in.readString();
            switch (token) {
                case "(":
                    // Ignore.
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    operators.push(token);
                    break;
                case ")":
                    // Pop, evaluate, and push result if token is ")".
                    String operator = operators.pop();
                    double value = values.pop();
                    switch (operator) {
                        case "+":
                            value += values.pop();
                            break;
                        case "-":
                            value -= values.pop();
                            break;
                        case "*":
                            value *= values.pop();
                            break;
                        case "/":
                            value = values.pop() / value;
                            break;
                        case "sqrt":
                            value = Math.sqrt(value);
                            break;
                    }
                    values.push(value);
                    break;
                default:
                    // Token not operator or paren: push double value.
                    values.push(Double.parseDouble(token));
                    break;
            }
        }

        StdOut.println(values.pop());
    }
}
