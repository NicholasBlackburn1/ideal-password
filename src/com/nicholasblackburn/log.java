/*
 * Copyright Nicholas Blackburn(c) 2018.
 */

package com.nicholasblackburn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class log {
    public static void main(String[] args) throws FileNotFoundException {

        {
           int i ;
            for (i = 0; i < 10; i++) {
                PrintStream out = new PrintStream(new FileOutputStream("output.txt" + i));
                System.setOut(out);// write your code here
            }
        }
    }
}