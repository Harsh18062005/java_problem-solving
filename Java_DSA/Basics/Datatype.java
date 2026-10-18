public  class Datatype {
    public static void main(String[] args) {
        // Integer data type
        int num = 10;
        System.out.println("Integer: " + num);

        //short data type
        short shortNum = 100;
        System.out.println("Short: " + shortNum);

        //long data type
        long longNum = 100000L;
        System.out.println("Long: " + longNum);


        // Float data type
        float decimalNum = 5.75f;
        System.out.println("Float: " + decimalNum);

        // Double data type
        double largeDecimalNum = 19.99;
        System.out.println("Double: " + largeDecimalNum);

        // Character data type
        char letter = 'A';
        System.out.println("Character: " + letter);
        System.out.println((char)(letter+1)); // Print ASCII value of character

        // Boolean data type
        boolean isJavaFun = true;
        System.out.println("Boolean: " + isJavaFun);



        //Type Casting
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Implicit Casting: " + myDouble);

        // Explicit Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("Explicit Casting: " + myInt2);

    }
}