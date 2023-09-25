package lesson4;

public class ExampleThree {
    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        // Three types of errors:

        // Logic errors: program runs, doesn't crash but you don't get the expected output
            // double average = mark1 + mark2 + mark3 / (double)numTests; // divides mark3 by numTests and not the marks in total
        // Runtime Errors: Runs but crashes when it is running ex: divide by 0
            //int number = 7/0;
                /* 
                Exception in thread "main" java.lang.ArithmeticException: / by zero
                at lesson4.ExampleThree.main(ExampleThree.java:13
                */

        // Syntax Error: won't run (compile), red squiggle, error in the Java Code, forgetting a " " or maybe a ;
            // System.out.println("Hello World); // forgot the last double quote
    }
}
