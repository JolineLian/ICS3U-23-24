package lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt the user for an integer
         System.out.print("Please enter a number: ");
        int x = in.nextInt();

        System.out.println(x);

        System.out.print("Please enter a double number: ");
        double y = in.nextDouble();
        System.out.println(y);

       System.out.print("Please enter two ints: ");
       int a = in.nextInt();
       int b = in.nextInt();

       System.out.println(a+b);
       

       System.out.print("PLease enter a number: ");     // if I give it two numbers seperated by a space
                                                        // it takes the first and leaves the 2nd for later
       int x1 = in.nextInt();
       System.out.print("Please enter another number: ");
       int y1 = in.nextInt();

       System.out.println(x1+y1);

       in.close();
    }
}