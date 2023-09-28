package lesson5;

import java.util.Scanner;

public class HomeworkQ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the weight in kilograms and the height in meters: ");
        int weight = in.nextInt();
        double height = in.nextDouble();

        double BMI = weight / (height * height);
        System.out.println((double)Math.round(BMI * 100)/100);

        in.close();
    }
}
