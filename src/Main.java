import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random die = new Random();
        Scanner in = new Scanner(System.in);


        String answer = "";



        do {
            int die1 = die.nextInt(6) + 1;
            int die2 = die.nextInt(6) + 1;
            int roll = die1 + die2;
            System.out.println("You rolled " + die1 + " and " + die2 + " total points " + roll);
            if (roll == 7 || roll == 11) {
                System.out.println("You win!");
            } else if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You lose!");
            } else {
                int roll2 = 0;
                while (roll2 != 7) {
                    int die3 = die.nextInt(6) + 1;
                    int die4 = die.nextInt(6) + 1;
                    roll2 = die3 + die4;
                    System.out.println("You rolled " + roll2 + " for point");
                    if (roll2 == roll) {
                        System.out.println("You Win!");
                        break;
                    } else if (roll2 == 7) {
                        System.out.println("You Lose!");
                    }
                }
            }

            System.out.print("Do you wanna play again?: [Y or N] ");
            answer = in.nextLine();

        }while(answer.equalsIgnoreCase("y"));

        }

    }
