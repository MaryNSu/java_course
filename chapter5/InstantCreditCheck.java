package chapter5;

/*
 * VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    private static int requiredSalary = 25000;
    private static int requiredCreditScore = 700;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        // Notify the user
        notifyUser (qualified);
    }

    private static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    private static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    private static boolean isUserQualified(int creditScore, double salary) {
        var isCreditScoreOk = creditScore >= requiredCreditScore;
        var isSalaryOk = salary >= requiredSalary;
        return isCreditScoreOk && isSalaryOk;
    }

    private static void notifyUser(boolean isQualified){
        if (isQualified) {
            System.out.println("Congrats! You have been approved.");
        }
        else {
            System.out.println("Sorry. You've been declined.");
        }
    }
}


