package lesson5;

import java.util.Scanner;

public class HomeworkQ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input both side 1 and side 2: ");
        int side1 = in.nextInt();
        int side2 = in.nextInt();

        int hypotenuseSquared = (side1 * side1) + (side2 * side2);
        double hypotenuse = Math.sqrt(hypotenuseSquared);

        System.out.println("The hypotenuse squared is: " + hypotenuse);

        in.close();
    }
}
