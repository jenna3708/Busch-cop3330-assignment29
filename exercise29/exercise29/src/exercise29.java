/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;

public class exercise29 {

    static int investment(int num)
    {
        int numYears;
        numYears = 72/num;

        return numYears;
    }

    static boolean isValid(String input)
    {
        if(input.matches("[0-9]+$"))
            if(Integer.parseInt(input) != 0)
                return true;
        return false;
    }

    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        String num = input.next();

        while (!isValid(num))
        {
            System.out.println("Sorry. That's not a valid input.");
            num = input.next();
        }

        int convNum = Integer.parseInt(num);


        System.out.println("It will take "+investment(convNum)+" years to double your initial investment");


    }
}
