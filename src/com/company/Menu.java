package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ramonaboariu on 7/19/2017.
 */
public class Menu {
    ReadInput readInput = new ReadInput();


    public void printOptions() {
        System.out.println("Meniul este: \n" +
                " 1. Adunare\n" +
                " 2. Scadere\n" +
                " 3. Coversie F to C\n" +
                " 4. Numarul maxim\n" +
                " 5. Comparare text cu Evozon \n" +
                " 6. Comparare numar, >=2 si <=8\n" +
                " 7. Compare text and number(Evozon)" +
                " 8. Weather and snow" +
                " 9. Compare numbers\'\n" +
                "10. Display the number pressed\n" +
                "11. Even number?\n" +
                "12. Show if the person is eligible to vote." +
                "13. Calculate your grade.\n" +
                "14. Choose the correct answer\n" +
                "15. Search an element from an array of 10 elements\n" +
                "16. Show stars\n" +
                "17. Show numbers and stars\n" +
                "18. Introduce a list and an interval n and returns a new list with all the elements sorted, except that every nth item\n" +
                " 0. LogOut");

    }

    public boolean chooseOption(int option) {
        Calculator calculator = new Calculator();
        Maximul max = new Maximul();
        Conversie conversie = new Conversie();
        LogicalOperations comp = new LogicalOperations();
        NumberKeys keys = new NumberKeys();
        Liste list = new Liste();

        switch (option) {

            case 1:
                System.out.println("Introdu doua numere.");
                int nr1 = readInput.readNumber();
                int nr2 = readInput.readNumber();
                System.out.println("Rezultatul este: ");
                System.out.println(calculator.sum(nr1, nr2));

                break;
            case 2:
                System.out.println("Introdu doua numere.");
                int no1 = readInput.readNumber();
                int no2 = readInput.readNumber();
                System.out.println("Rezultatul este: ");
                System.out.println(calculator.scadere(no1, no2));
                break;

            case 3:
                System.out.println("Introduceti temperatura dorita(F).");
                float temp = readInput.readNumber();
                System.out.println("Rezultatul este: ");
                System.out.println(conversie.convertToCelsius(temp));
                break;
            case 4:
                System.out.println("Introdu doua numere.");
                int val = readInput.readNumber();
                int val1 = readInput.readNumber();
                System.out.println("Rezultatul este: ");
                System.out.println(max.noMaxim(val, val1));
                break;
            case 5:
                System.out.println("Introduceti textul.");
                String text = readInput.readString();
                System.out.println(comp.compareToEvozon(text));
                break;
            case 6:
                System.out.println("Introduceti numarul");
                int no = readInput.readNumber();
                System.out.println(comp.compareNumbers(no));
                break;
            case 7:
                System.out.println("Introduceti textul.");
                String txt = readInput.readString();
                System.out.println("Introduceti numarul.");
                int a = readInput.readNumber();
                comp.compareTextnNumber(txt, a);
                break;
            case 8:
                System.out.println("Introduceti numarul.");
                int b = readInput.readNumber();
                comp.compareNr(b);
                break;
            case 9:
                System.out.println("Introduceti numarul.");
                int c = readInput.readNumber();
                comp.compareNo(c);
                break;
            case 10:
                System.out.println("Apasati tasta dorita.");
                int x = readInput.readNumber();
                keys.getNumberKeeys(x);
                break;
            case 11:
                System.out.println("Introduceti numarul.");
                int par = readInput.readNumber();
                comp.evenNo(par);
                break;
            case 12:
                System.out.println("Introduceti varsta:");
                int age = readInput.readNumber();
                comp.getAge(age);
                break;
            case 13:
                System.out.println("Quiz score:");
                int qscore = readInput.readNumber();
                System.out.println("Mid-term score.");
                int mterm = readInput.readNumber();
                System.out.println("Final score.");
                int fscore = readInput.readNumber();
                comp.getGrade(qscore, mterm, fscore);
                break;
            case 14:
                System.out.println("Introduceti numarul.");
                String ans = readInput.readString();
                keys.goodAnswer(ans);
                break;
            case 15:
                System.out.println("Introduceti numarul:");
                int y = readInput.readNumber();
                System.out.println("Introduceti elementele vectorului.");
                int[] array = new int[10];
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 10; i++) {
                    array[i] = scan.nextInt();
                }
                comp.getEqualTo(y, array);
                break;
            case 16:
                System.out.println("Introduceti numarul:");
                int stars = readInput.readNumber();
                comp.getStars(stars);
                break;
            case 17:
                System.out.println("Introduceti numarul:");
                int star = readInput.readNumber();
                comp.getNonStars(star);
                break;
            case 18:
                System.out.println("Introduceti numerele din lista:");
                List<Integer> array1 = new ArrayList<Integer>();
                Scanner scan1 = new Scanner(System.in);
                while (true) {
                    try {
                        array1.add(scan1.nextInt());

                    } catch (InputMismatchException exc) {
                        break;
                    }
                }
                System.out.println("Introduceti numarul:");
                int numar = readInput.readNumber();
                list.getLista(array1, numar);
                break;
            case 0:

                return false;
            default:
                System.out.println("");


        }
        return true;
    }

    public void runProgram() {
        int option;
        do {
            printOptions();
            System.out.println("Alege optiunea: ");

            option = readInput.readNumber();

        }
        while (chooseOption(option));
    }
}