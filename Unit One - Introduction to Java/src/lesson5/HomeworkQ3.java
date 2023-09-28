package lesson5;

import java.util.Scanner;

public class HomeworkQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the radius rounded: ");
        int radius = in.nextInt();

        System.out.println("The area of the circle is: " + 3.1415 * (radius * radius));
        System.out.println("The circumference of the circle is: " + 2 * 3.1415 * radius);

        in.close();
    }
}
