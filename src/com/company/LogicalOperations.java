package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramonaboariu on 7/19/2017.
 */
public class LogicalOperations {

    public int compareNumbers(int val) {

        if (val >= 2 && val <= 8)
            return val;
        else
            return (-1);

    }

    public void compareNr(int val) {
        String a = "The amount of snow this winter was(cm):";
        String b = "The forecast snow is(cm):";
        if (val > 8 || val == 6)
            System.out.println(a + val + " cm");
        else
            System.out.println(b + val + " cm");
    }

    public void compareNo(int val) {
        if (val >= 3 && val != 4)
            System.out.println("The number is greater than 3 and not equal to 4");
        else if (val == 4)
            System.out.println("The number is equal to 4");
    }

    public void evenNo(int val) {

        if (val % 2 == 0)
            System.out.println("Valoarea este para");
        else
            System.out.println("Valoarea este impara");
    }

    public void compareTextnNumber(String text, int nr) {
        if (text == "Evozon" && nr <= 3)
            System.out.println(text + " " + nr);

        else
            System.out.println(nr + " " + text);
    }


    public String compareToEvozon(String x) {
        String a = "Learning text comparison";
        String b = "Got to try some more";
        if (x.equals("Evozon"))
            return a;
        else
            return b;
    }

    public int compareToValue(int noToCompare, int no) {
        if (no < noToCompare)
            return no;
        return noToCompare;
    }

    public int compareBetweenValues(int noToCompare1, int noToCompare2, int no) {
        if (no <= noToCompare1 || no >= noToCompare2)
            return no;
        return noToCompare1;
    }

    public int[] getValuesLessThan(int number, int noToCompare) {
        int[] array = new int[noToCompare - number];

        for (int i = 0; number < noToCompare; i++, number++) {
            array[i] = number;
        }

        return array;
    }

    public void getGrade(int Qscore, int Mterm, int Fscore) {

        float media = (Qscore + Mterm + Fscore) / 3;

        if (media >= 90)
            System.out.println("Your grade is A");
        if (media >= 70 && media < 90)
            System.out.println("Your grade is B");
        if (media >= 50 && media < 70)
            System.out.println("Your grade is C");
        else
            System.out.println("Your grade is F");
    }

    public void getEqualTo(int numar, int[] array) {

        for (int i = 0; i < 10; i++) {
            if (array[i] == numar)

                System.out.println("Numarul se regaseste in vector");

        }
    }

    public void getStars(int numar) {
        int i, j;
        for (i = numar; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void getAge(int age) {
        if (age >= 18)
            System.out.println(" You are eligible to vote");
        else
            System.out.println(" You are not eligible to vote");

    }



    public void getNonStars(int n) {
        int i, j, k;

        for (i = 2; i <= n; i++) {

            for (j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            for (k = i; k <= n; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }





    }
