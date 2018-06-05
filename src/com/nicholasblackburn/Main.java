/*
 * Copyright Nicholas Blackburn(c) 2018
 */

package com.nicholasblackburn;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int menu;

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Nicks Password Generator");
        System.out.println("-------------------------\n");
        System.out.println("1 - rsa public and private key ");
        System.out.println("2 - random pass");
        System.out.println("3 - guide");
        System.out.println("4 - Quit");
        System.out.println("-------------------------\n");
        selection = input.nextInt();
        if (selection == 1) {
            keygenerator.main(args);
        }
        if (selection == 2) {
            pass.main(args);
        }
        if (selection == 3) {
            System.out.print("generates passwords \n");
            System.out.print("generates rsa public and private keys ");
        }
        if (selection == 4) {
            System.exit(0);
        }
    }



    }
}


