/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
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