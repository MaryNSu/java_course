package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    private static double overagePrice = 0.25;
    private static double taxRate = 0.15;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double plan = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        double overageCost = calculateOverage(overageMinutes);

        var subtotal = plan + overageCost;
        double taxes = calculateTaxes(subtotal);
        double total = calculateTotal(taxes, overageCost, plan);

        System.out.println("Phone Bill Statement");
        System.out.println(String.format("Plan: %s", plan));
        System.out.println(String.format("Overage: %.2f", overageCost));
        System.out.println(String.format("Tax: %.2f", taxes));
        System.out.println(String.format("Total: %.2f", total));

        scanner.close();
    }

    private static double calculateOverage(int minutes) {
        return minutes * overagePrice;
    }

    private static double calculateTaxes(double amount) {
        return amount * taxRate;
    }

    private static double calculateTotal(double overagePrice, double taxes, double plan) {
        return overagePrice + taxes + plan;
    }
}
