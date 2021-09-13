package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 09 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        double f2; //amount of square feet

        System.out.println("How many square feet? "); //prompt how many square feet
        f2 = userInput.nextInt(); //scan the input

        double nGallons = f2 / 350; //conversion rate
        int nGallonsRound = (int) Math.ceil(nGallons); //round up


        //print output
        System.out.println("You will need to purchase " + nGallonsRound + " gallons of paint to " +
                "cover " + f2 + " square feet.");

    }
}
