package lesson5;

import java.util.Scanner;

public class HomeworkQ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the cost of the item:");
        int originalPrice = in.nextInt();
        
        double finalCost = (originalPrice * 0.80) * 1.13;

        System.out.println(finalCost);

        in.close();
    }
}
