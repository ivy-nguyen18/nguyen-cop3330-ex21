/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex21.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int numMonth = input.nextInt();
        Month month = new Month(numMonth);

        System.out.print(month.getMonth() +".");

    }
}
