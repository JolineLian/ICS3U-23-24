package lesson5;

import java.util.Scanner;

public class HomeworkQ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the distance in kilometers and time in hours");
        int distance = in.nextInt();
        int time = in.nextInt();

        double speed = (double) distance / time;

        System.out.println("The speed is: " + (double) Math.round(speed * 100) / 100);

        in.close();
    }
}
