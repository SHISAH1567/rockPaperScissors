/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sahilk.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sahil khanna
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        {
            int rock = 0;
            int paper = 0;
            int scissors = 0;
            int round = 0;
            int maxRound = 0;

            // user's play "rock, paper or scissors"
            String personPlay;
            // Computer play "rock, paper or scissors
            String computerPlay = "";
            // Random generated number
            int computerInt;
            // computer play string response;
            Scanner scan = new Scanner(System.in);

            Random generator = new Random();
            System.out.println(" how any round you want to play");
            round = scan.nextInt();
            // Track number of round
            maxRound = round;
            scan.nextLine();

            while (round <= 10) {

                System.out.println("Let's Start Play Rock, paper, scissors!\n"
                        + " Please choose your move.\n " + " 1 = Rock, 2 = Paper, 3 = Scissors ");

                System.out.println();

                // Genetrate computer play (0,1,2)
                computerInt = generator.nextInt(3) + 1;

                // translate computer randomly generated play to
                if (computerInt == 1) {
                    computerPlay = "ROCK";
                }
                if (computerInt == 2) {
                    computerPlay = "PAPER";
                }
                if (computerInt == 3) {
                    computerPlay = "SCISSORS";
                }

                // Player play from input
                System.out.println("Enter your play = ");
                personPlay = scan.next();

                personPlay = personPlay.toUpperCase();
                // print computer play
                System.out.println("Computer play = " + computerPlay);

                // See who won
                if (personPlay.equals(computerPlay)) {
                    System.out.println("it's a tie");
                }

                if (personPlay.equals("ROCK")) {
                    if (computerPlay.equals("SCISSORS")) {
                        System.out.println("Rock breaks Scissors. You Won");
                    }
                }

                if (computerPlay.equals("PAPER")) {
                    System.out.println("Paper wrap rock. You lose");
                }
                // Player option change
                if (personPlay.equals("PAPER")) {
                    if (computerPlay.equals("SCISSORS")) {
                        System.out.println("Scissors cut Paper. You lose");
                    }
                }

                if (computerPlay.equals("ROCK")) {
                    System.out.println("Paper wrap rock. You win");
                }
                // player option change
                if (personPlay.equals("SCISSORS")) {
                    if (computerPlay.equals("PAPER")) {
                        System.out.println("Scissors cut Paper. You win");
                    }
                }
                if (computerPlay.equals("ROCK")) {
                    System.out.println("Rock breaks Scissors. You lose");
                } // invalid input
                else {
                    System.out.println("Invalid user input");
                }
System.out.println("Gameover\n" + "Do you want to play again");
            }

            

        }
    }
}