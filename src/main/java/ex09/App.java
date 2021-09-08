package ex09;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?");
        String Slength = input.nextLine();
        System.out.println("What is the width?");
        String Swidth = input.nextLine();

        int length = Integer.parseInt(Slength);
        int width = Integer.parseInt(Swidth);

        double area = width * length;

        double gallon = 350;

        double needed = Math.ceil( area/gallon);
        int Ineeded =(int)needed;
        int Iarea =(int)area;

        System.out.println("You will need to purchase "+ Ineeded + " gallons of paint to cover "+ Iarea +" square feet");
    }
}
