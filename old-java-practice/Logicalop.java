class Logicalop {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 20;

        // Logical AND operator
        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }

        // Logical OR operator
        if (a > b || c < a) {
            System.out.println("At least one condition is true");
        }

        // Logical NOT operator
        if (!(a < b)) {
            System.out.println("Condition is false, so NOT makes it true");
        }
    }
}