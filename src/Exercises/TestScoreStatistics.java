package Exercises;

import java.util.Scanner;

public class TestScoreStatistics {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int user = 1;

        while( user < 999)
        {
            System.out.println(" Enter a student's test score >>");
            user = input.nextInt();

            if (user > 100 )
            {
                System.out.println(" Invalid test score.");
            }
            else if (user < 0 )
            {
                System.out.println(" Invalid test score.");
            }
        }
    }
}
