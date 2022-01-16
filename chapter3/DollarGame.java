package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]) {

        //Get what we don't know
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int penny = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickel = scanner.nextInt();

        System.out.println("How many dimes?");
        int dime = scanner.nextInt();

        System.out.println("And then, how many quarters?");
        int quarter = scanner.nextInt();
        scanner.close();

        //Count up the value of all of the change that user answered
        double sumPenny = penny * 0.01;
        double sumNickel = nickel * 0.05;
        double sumDime = dime * 0.10;
        double sumQuarter = quarter * 0.25;
        double totalSum = sumPenny + sumNickel + sumDime + sumQuarter;

        //Results
        if (totalSum == 1) {
            System.out.println("It's exactly one dollar. You win the game!");
        } else if (totalSum > 1) {
            double moreDiff = totalSum - 1;
            System.out.println("It's more than one dollar. You went over more than $" + moreDiff);
        } else {
            double lessDiff = 1 - totalSum;
            System.out.println("it's less than one dollar. You went under than $" + lessDiff);
        }
    }
}

