package exe16;

import java.util.Stack;

public class DecimalToBaseConverter {

    public static void main(String[] args) {
        int decimalNumber = 123;
        int base = 8;
        Stack<Integer> stack = new Stack<>();
        System.out.println("Número decimal " + decimalNumber + " na base " + base + ":");
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            stack.push(remainder);
            decimalNumber /= base;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}