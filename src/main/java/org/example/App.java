package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader


        System.out.printf("Enter the principal: ");
        String principal = reader.nextLine();
        System.out.printf("Enter the rate of interest: ");
        String rate = reader.nextLine();
        System.out.printf("Enter the number of years: ");
        String years = reader.nextLine();


        float p = Float.parseFloat(principal);
        float r = Float.parseFloat(rate);
        float rr = r/100;
        float t = Float.parseFloat(years);
        float a = p*(1+(rr*t));

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + a + ".");
    }
}