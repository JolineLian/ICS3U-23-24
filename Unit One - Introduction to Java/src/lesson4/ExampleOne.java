package lesson4;

public class ExampleOne {
    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        //double average = (mark1 + mark2 + mark3) / (double)numTests; // brackets come first, casting comes second
        //double average = (double)(mark1 + mark2 + mark3) / numTests;
        //double average = (mark1 + (double)mark2 + mark3) / numTests;


        double average = (double)((mark1 + mark2 + mark3) / numTests); // cast is too late (bracket first, casting second)

        System.out.println(average);

        // cast int -> double = more precision (widening conversion)
    }
}
