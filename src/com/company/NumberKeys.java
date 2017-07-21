package com.company;

/**
 * Created by ramonaboariu on 7/20/2017.
 */
public class NumberKeys {
    public void getNumberKeeys(int nrInt) {


        switch (nrInt) {
            case 0:
                System.out.println(nrInt);
                break;
            case 1:
                System.out.println(nrInt);
                break;
            case 2:
                System.out.println(nrInt);
                break;
            case 3:
                System.out.println(nrInt);
                break;
            case 4:
                System.out.println(nrInt);
                break;
            case 5:
                System.out.println(nrInt);
                break;
            case 6:
                System.out.println(nrInt);
                break;
            case 7:
                System.out.println(nrInt);
                break;
            case 8:
                System.out.println(nrInt);
                break;
            case 9:
                System.out.println(nrInt);
                break;
            default:
                System.out.println("Not allowed");
                break;

        }
    }

    public void goodAnswer(String choice) {

        switch (choice)

        {
            case "a":
                System.out.println("Wrong Answer");
                break;
            case "b":
                System.out.println("Correct answer");
                break;
            case "c":
                System.out.println("Correct Answer");
                break;
            case "d":
                System.out.println("Correct Answer ");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}