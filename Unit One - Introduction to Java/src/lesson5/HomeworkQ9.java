package lesson5;

import java.util.Scanner;

public class HomeworkQ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the principle amount then the compound interest after one year as a percent: ");
        double principle = in.nextDouble();
        double interest = in.nextDouble();

        int interestEarned = (int)(principle * interest);

        int result = (int)(principle + interestEarned);

        System.out.println(result);

        in.close();
    }  
}
