/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sahilk.rockpaperscissorr;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class rockPaperScissorr {

    public static void main(String[] args) {
        int comCount = 0;
        int userCount = 0;
        int tieCount = 0;
        int round = 1;

        Scanner scanner = new Scanner(System.in);
        //ASK USER HOW MANY ROUND YOU WANT TO PLAY

        System.out.println("How many round you want to play?");
        round = scanner.nextInt();
        for (int i = 1; i < 10; i++) {

            while (round<10) {

                // computer randomly chooses Rock, Paper, or Scissors
                String[] generator = {"ROCK", "PAPER", "SCISSOR"};
                String computerPlay = generator[new Random().nextInt(generator.length)];

                String playePlay;

                while (true) {

                    //player chooses move  Rock, Paper, or Scissors
                    System.out.println("Please enter your move in capital letter (ROCK,PAPER, or SCISSOR)");
                    playePlay = scanner.nextLine();
                    playePlay = playePlay.toUpperCase();

                    // Checking player input
                    if (playePlay.equals("ROCK") || playePlay.equals("PAPER") || playePlay.equals("SCISSOR")) {
                        break;
                    }

                    System.out.println(playePlay + " is not a valid move.");
                }

                System.out.println("Computer played: " + computerPlay);
                // Formula compile

                if (playePlay.equals(computerPlay)) {
                    System.out.println("The game was a tie!");
                    tieCount++;
                } else if (playePlay.equals("ROCK")) {
                    if (computerPlay.equals("PAPER")) {
                        System.out.println("You lose!");
                        comCount++;
                    } else if (computerPlay.equals("SCISSOR")) {
                        System.out.println("You win!");
                        userCount++;
                    }
                } else if (playePlay.equals("PAPER")) {
                    if (computerPlay.equals("ROCK")) {
                        System.out.println("You win!");
                        userCount++;
                    } else if (computerPlay.equals("SCISSOR")) {
                        System.out.println("You lose!");
                        comCount++;
                    }
                } else if (playePlay.equals("SCISSOR")) {
                    if (computerPlay.equals("PAPER")) {
                        System.out.println("You win!");
                        userCount++;

                    } else if (computerPlay.equals("ROCK")) {
                        System.out.println("You lose!");
                        comCount++;
                    }

                }

                //Result show on screen
                System.out.println("YOU WON " + userCount + " TIMES");
                System.out.println("COMPUTER WON " + comCount + " TIMES");
                System.out.println("TIE GAME " + tieCount + " TIMES");

                // Ask player to play again
                System.out.println("Do you want Play again? (y/n)");
                String playAgain = scanner.nextLine();

                if (!playAgain.equals("y")) {
                    break;

                }
                System.out.println("THANKS FOR PLAYING");
            }
        }

    }

};
