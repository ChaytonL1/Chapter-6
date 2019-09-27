package Exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 {

    public static void main(String[] args){

        String result;
        int user = 0;
        int counter = 0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        result = "Welcome to Rock Paper Scissors";
        displayPrint(result);
        while (user != 999){
        result = "Choose the following \n1: Rock \n2: Paper \n3: Scissors \n or enter 999 to quit. \n >>> ";
        displayPrint(result);

        int r = rand.nextInt(3)+1;
        user = input.nextInt();
        if(user == 1){
            if(r == 1){
                result = "Tie";
            }
            else if(r == 2){
                result = "Lose";
            }
            else{
                result = "Win";
                ++counter;
            }
            displayPrint(result);
        }
        if(user == 2){
            if(r == 2){
                result = "Tie";
            }
            else if(r == 3){
                result = "Lose";
            }
            else{
                result = "Win";
                ++counter;
            }
            displayPrint(result);
        }
        if(user == 3){
            if(r == 3){
                result = "Tie";
            }
            else if(r == 1){
                result = "Lose";
            }
            else{
                result = "Win";
                ++counter;
            }
            displayPrint(result);
        }
    }
    System.out.println(" You won " + counter + " time(s).");
    }

    public static void displayPrint(String result){
        System.out.println(result);
    }

 }

