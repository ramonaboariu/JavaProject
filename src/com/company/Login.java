package com.company;

/**
 * Created by ramonaboariu on 7/19/2017.
 */
public class Login {
    private String username;
    private String password;
    ReadInput readInput = new ReadInput();

    public boolean login(String user, String pass) {


        if (user.equals(Constants.USERNAME) && pass.equals(Constants.PASS)) {
            return true;
//            Menu menu = new Menu();
//            menu.printOptions();
        }
        return false;
    }

    public boolean loginValidation() {


        for (int i = 0; i < Constants.MAX_NUMBERS_OF_TRY; i++) {
            System.out.println("Introduceti username.");
            String username = readInput.readString();
            System.out.println("Introduceti parola.");
            String password = readInput.readString();
            if (login(username, password)) {
                System.out.println("Bun venit " + Constants.USERNAME + " ! Ai fost logat cu succes. !");
                return true;
            } else {
                System.out.println("Username-ul sau parola sunt gresite.\n " +
                        "Ti-au mai ramas " + (Constants.MAX_NUMBERS_OF_TRY - i - 1) + " incercari.");
            }
        }
        return false;
    }
}