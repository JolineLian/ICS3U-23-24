package lesson5;

import java.util.Scanner;

public class HomeworkQ2 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // int usDollars;
    // double canadianDollars;

    System.out.print("please enter the amount of US Dollars to convert: ");
    int usDollars = in.nextInt();

    double canadianDollars = usDollars * 1.35;

    System.out.print("You have " + canadianDollars + " Canadian dollars");


    in.close();    
}
}