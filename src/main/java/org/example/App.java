package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age? ");
        String ageS = in.nextLine();
        int age = parseInt(ageS);
        System.out.println(age < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.");
    }
}
