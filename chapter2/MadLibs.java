package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]){

        // 1. Get a season of the year
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get a number
        System.out.println("Enter a number: ");
        scanner.nextInt();
         int number = scanner.nextInt();


        // 3. Get an adjective
        System.out.println("Enter an adjective: ");
        scanner.next();
        String adjective = scanner.nextLine();
        scanner.close();

        // 4. Display result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");
    }
}
