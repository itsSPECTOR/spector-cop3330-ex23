package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 23 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //get input
        System.out.print("Is the car silent when you turn the key? ");
        String strSilent = input.nextLine();

        //start decision tree
        if (strSilent.contains("y")){
            //get input
            System.out.print("IAre the battery terminals corroded? ");
            String strTerm = input.nextLine();

            if(strTerm.contains("y")){
                //output
                System.out.print("Clean terminals and try starting again.");
            }
            else{
                //output
                System.out.print("Replace cables and try again.");
            }
        }
        else {
            //get input
            System.out.print("Does the car make a slicking noise? ");
            String strNoise = input.nextLine();

            if (strNoise.contains("y")){
                //output
                System.out.print("Replace the battery.");
            }
            else {
                //get input
                System.out.print("Does the car crank up but fail to start? ");
                String strStart = input.nextLine();

                if(strStart.contains("y")){
                    System.out.print("Check spark plug connections. ");
                }
                else {
                    //get input
                    System.out.print("Does the engine start and then die? ");
                    String strDie = input.nextLine();

                    if (strDie.contains("y")){
                        //get input
                        System.out.print("Does you car have fuel injection? ");
                        String strFuel = input.nextLine();

                        if(strFuel.contains("y")){
                            System.out.print("Get it in for service.");
                        }
                        else {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}