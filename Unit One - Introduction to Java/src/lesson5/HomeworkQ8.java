package lesson5;

import java.util.Scanner;

public class HomeworkQ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please input 2 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int result = ((num1 + 5) * 3) % (int)(num2 / 2);

        System.out.println((double)Math.round(result * 100) / 100);

        in.close();
    }
}
