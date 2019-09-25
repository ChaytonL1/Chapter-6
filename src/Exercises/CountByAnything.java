package Exercises;

import java.util.Scanner;

public class CountByAnything {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int user = 1;
        System.out.println(" Enter a number you would want to count by. \n >>>>>");
        user = input.nextInt();

        for ( int i = 0; i <= 100; i = i + user)
        {
            System.out.println(i);
        }


    }
}
