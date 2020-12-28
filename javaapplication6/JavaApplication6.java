/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Isaiah J Jones
 */
import java.util.Scanner;

public class JavaApplication6 {

    Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char phoneLetter;
        Scanner in = new Scanner(System.in);

        // Prompt user for a letter
        System.out.println("Enter a letter");

        // Store letter
        String line = in.nextLine();
        line = line.toUpperCase();
        phoneLetter = line.charAt(0);

        // Compute letter
        switch (phoneLetter) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 2 on the telephone.");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 3 on the telephone.");
                break;
            case 'G':
            case 'H':
            case 'I':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 4 on the telephone.");
                break;
            case 'J':
            case 'K':
            case 'L':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 5 on the telephone.");
                break;
            case 'M':
            case 'N':
            case 'O':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 6 on the telephone.");
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 7 on the telephone.");
                break;
            case 'T':
            case 'U':
            case 'V':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 8 on the telephone.");
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("The letter " + phoneLetter + " corresponds"
                        + " to 9 on the telephone.");
                break;
            default:
                System.out.println(phoneLetter + " is not a letter.");
                break;
        }

    }

}
