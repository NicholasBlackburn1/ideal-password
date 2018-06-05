/*
 * Copyright Nicholas Blackburn(c) 2018
 */

package com.nicholasblackburn;

public class pass {
    public static void main (String[] args) {
        com.nicholasblackburn.password.PasswordGenerator passwordGenerator = new com.nicholasblackburn.password.PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .build();
        String password = passwordGenerator.generate(100); // output ex.: lrU12fmM 75iwI90o
             System.out.print("this is your pass\n");
             System.out.print(password);
    }
}