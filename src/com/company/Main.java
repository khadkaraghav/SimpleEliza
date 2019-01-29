package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputUser();
    }


    public static void inputUser() {

        Scanner input = new Scanner(System.in);

        String str = "";

        while (!str.equalsIgnoreCase("i am feeling great")) {

            System.out.println("Good day. Enter your response here or Q to quit:");
            str = input.nextLine();

            if (!str.equalsIgnoreCase("q")) {

                System.out.println(str);}
            else{

                System.exit(0);

            }

        }
    }
}


