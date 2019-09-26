package Exercises;

import java.util.Scanner;

public class TestScoreStatistics {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int user = 1;
        int high =0;
        int low = 101;
        int scoreTotal = 0;
        int average;
        int count = 0;
        while( user != 999)
        {
            System.out.println(" Enter a student's test score >>");
            user = input.nextInt();

            if (user > high && user >= 0 && user < 101 )
            {
                high = user;
                System.out.println(" New High Score. " + high);
                count++;
                scoreTotal = scoreTotal + user;

            }
            else if (user < low && user >= 0 && user < 101)
            {
                low = user;
                System.out.println(" New Low Score. " + low);
                count++;
                scoreTotal = scoreTotal + user;
            }
            else if ( user > 100 || user < 0 || user < 998 )
            {
                System.out.println(" Invalid Test Score. ");
            }
            else if (user == 999)
            {
                average = scoreTotal / count;
                System.out.println(" The High Score was " + high );
                System.out.println(" The Low Score was " + low );
                System.out.println(" The Average Score was " + average );
            }
            else
                {
                    System.out.println(" Thank You. ");
                    count++;
                    scoreTotal = scoreTotal + user;
                }
        }
    }
}
