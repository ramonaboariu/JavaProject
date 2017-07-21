package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ramonaboariu on 7/19/2017.
 */
public class ReadInput {
    public int readNumber(){
        int x;
        try {
            Scanner scanner = new Scanner(System.in);
            x=  scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.Please enter a number.");
            x = readNumber();

        }
        //  System.out.println(x);

        return x;


    }

    public String readString(){

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }
}
