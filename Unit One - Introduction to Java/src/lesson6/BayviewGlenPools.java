package lesson6;

import java.util.Scanner;

public class BayviewGlenPools {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length and width of the pool: ");
        int length = in.nextInt();
        int width = in.nextInt();

        System.out.println("Please enter the depth of both the shallow and deep end: ");
        int shallowHeight = in.nextInt();
        int deepHeight = in.nextInt();

        System.out.println("Please enter the length of the transition between the shallow end and the deep end: ");
        int transition = in.nextInt();

        System.out.println("Please enter the length of the shallow end: ");
        int shallowLength = in.nextInt();

        System.out.println("Please enter the price per meter square of the liner: ");
        int linercost = in.nextInt();

        int transitionHeight = deepHeight - shallowHeight;
        double transitionLengthSquared = transition * transition - transitionHeight * transitionHeight;
        double transitionLength = Math.sqrt (transitionLengthSquared);
        double deepLength = length - (transitionLength + shallowLength);

        double transitionArea = transitionLength * transitionHeight / 2;
        double deepArea = deepLength * deepHeight;
        double shallowArea = (transitionLength + shallowLength) * shallowHeight;
        double areaTwoD = transitionArea + deepArea + shallowArea;
        double volume = areaTwoD * width;
        
        double amountOfWater = volume * 0.9;

        double deepHeightLiner = deepHeight * width;
        double shallowHeightLiner = shallowHeight * width;

        double deepLengthLiner = deepLength * deepHeight;
        double shallowAndTransitionLengthLiner = (transitionLength + shallowLength) * shallowHeight;
        double linerDeepBottom = deepLength * width;
        double linerShallowBottom = shallowLength * width;
        double linerTransitionBottom = transition * width;

        double liner = (transitionArea * 2) + (shallowAndTransitionLengthLiner * 2) + (deepLengthLiner * 2) + shallowHeightLiner + deepHeightLiner + linerDeepBottom + linerShallowBottom + linerTransitionBottom;

        double linerCostTotal = liner * linercost;

        System.out.println("the amount of water needed to fill the pool 90 percent is: " + amountOfWater);
        System.out.println("the amount of liner needed is: " + liner);
        System.out.println("the cost of the liner is: " + linerCostTotal);

        in.close();
    }
}
