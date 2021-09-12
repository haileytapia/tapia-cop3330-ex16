/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        age = input.nextInt();

        String legality = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.print(legality);
    }
}