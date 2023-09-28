package lesson5;

import java.util.Scanner;

public class HomeworkQ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter total minutes: ");
        int totalMinutes = in.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + "hours" + minutes + "minutes");

        in.close();
    }
}
