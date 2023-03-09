package org.lessons.java;

import java.util.Scanner;

public class FirstSnack {
    public static void main(String[] args) {

        /* Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = Integer.parseInt(scan.nextLine());

        if (n % 2 == 0) {
            System.out.println("Il numero è pari: " + n);
        } else {
            System.out.println("Il numero è dispari: " + (n + 1));
        }

        scan.close();

    }
}
