package chapter4;

import java.util.Random;

/*
 The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 */
public class RollTheDieGame {

    public static void main(String args[]) {
        //Initialize what we know
        int numberOfSpaces = 20;
        int numberOfDieRolls = 5;
        int total = 0;
        Random random = new Random();

        for (int i = 0; i < numberOfDieRolls; i++) {
            int die = random.nextInt(6) + 1;
            total += die;

            if (total > numberOfSpaces) {
                var message = String.format("You've rolled a %s. You are now on spase %s, you lost, sorry.", die, total);
                System.out.println(message);
                break;
            }

            var message = String.format("Roll # %s : You've rolled a %s. You are now on spase %s and have %s more to go.", i + 1, die, total, numberOfSpaces - total);
            System.out.println(message);


            if (total == numberOfSpaces) {
                var messageWin = String.format("Roll # %s : You're on space %s. Congrats, you win!", i + 1, total);
                System.out.println(messageWin);
                break;
            }
        }

        if (total < numberOfSpaces) {
            var message = String.format("You are under %s after %s rolls. You lost, try again.", numberOfSpaces, numberOfDieRolls);
            System.out.println(message);
        }
    }
}

