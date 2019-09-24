package Assignment;

import java.util.Random;
import java.util.Scanner;

public class OpenDoorGame {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice = 4;
        int rand_pick = rand.nextInt(3 )+1;
        while(choice >= 4 || choice <= 0 ) {
            System.out.println("Would you like to open... \n 1 - Door 1 \n 2 - Door 2 \n 3 - Door 3 \n Choice >>>");
            choice = input.nextInt();


            if (choice == 1) {
                doorPrize1(rand_pick);
            } else if (choice == 2) {
                doorPrize2(rand_pick);
            } else if (choice == 3) {
                doorPrize3(rand_pick);
            } else {
                System.out.println(" Invalid, choose again.");
            }
        }

    }
    public static void doorPrize1(int rand_pick){
        if (rand_pick == 1)
        {
            System.out.println(" You won a Teddy Bear! ");

        }
        else if (rand_pick == 2)
        {
            System.out.println(" You won a Million Dollars! ");

        }
        else if (rand_pick == 3)
        {
            System.out.println(" You won a new car! ");

        }

    }
    public static void doorPrize2(int rand_pick) {
        if (rand_pick == 1) {
            System.out.println(" You won a rock. ");

        } else if (rand_pick == 2) {
            System.out.println(" You won a shoe. ");

        } else if (rand_pick == 3) {
            System.out.println(" You won a piece of wood.  ");

        }
    }
        public static void doorPrize3( int rand_pick){
            if (rand_pick == 1) {
                System.out.println(" You won a baby Dolphin! ");

            } else if (rand_pick == 2) {
                System.out.println(" You won a House! ");

            } else if (rand_pick == 3) {
                System.out.println(" You won a free trip to Hawaii! ");

            }
        }
    }

