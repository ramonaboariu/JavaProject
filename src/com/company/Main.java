package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOperations logicalOp = new LogicalOperations();
        ReadInput readInput = new ReadInput();
        Menu m = new Menu();

        Login login = new Login();
        if(login.loginValidation()){

            m.runProgram();
        }
    }
}