public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

       //Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Addition Assignment: " + c);
        c -= 3; // c = c - 3
        System.out.println("Subtraction Assignment: " + c);
        c *= 2; // c = c * 2
        System.out.println("Multiplication Assignment: " + c);
        c /= 4; // c = c / 4
        System.out.println("Division Assignment: " + c);
        c %= 3; // c = c % 3
        System.out.println("Modulus Assignment: " + c);

        //unary Operators
        int d = 5;
        System.out.println("Unary Plus: " + (+d));
        System.out.println("Unary Minus: " + (-d));
        System.out.println("Increment: " + (++d));
        System.out.println("Decrement: " + (--d));
        
    }
}
