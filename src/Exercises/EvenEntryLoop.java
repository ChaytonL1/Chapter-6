package Exercises;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int user = 1;

        while( user < 999)
        {
            System.out.println(" Enter an even number. >>");
            user = input.nextInt();

            if (user % 2 == 0) {
                System.out.println(" Good Job. ");
            }
            else if (user % 2 != 0)
            {
                System.out.println(" Error Try Again.");
            }
        }
    }
}
