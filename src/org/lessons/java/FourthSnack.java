package org.lessons.java;

import java.util.Random;

public class FourthSnack {
    public static void main(String[] args) {

        /*Crea due array che hanno un numero di elementi diversi.
        Mostra a video dei nuovi elementi random finchè il numero di elementi presenti nell’array che ne ha di meno +
        quelli mostrati a video non è uguale al numero di elementi presenti nell’array che ne ha di più*/

        //data
        int firstList[] = {1, 2, 3, 4, 5};
        int secondList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int differenceBetweenLists;

        if(firstList.length != secondList.length) {
            System.out.println("Non hanno la stessa lunghezza");

            int shortList[] = firstList.length > secondList.length ? secondList : firstList;
            int longerList[] = firstList.length < secondList.length ? secondList : firstList;

            differenceBetweenLists = longerList.length - shortList.length;
            System.out.println("Differenza: " + differenceBetweenLists);

            System.out.println("Lista più lunga");
            for (int i = 0; i < longerList.length; i++) {
                System.out.print(longerList[i] + " ");
            }

            System.out.println();
            System.out.println("Lista più corta");
            for (int i = 0; i < shortList.length; i++) {
                System.out.print(shortList[i] + " ");
            }

            for (int i = 0; i < differenceBetweenLists; i++) {

                Random rand = new Random();
                int randomNumber = rand.nextInt(100) + 1;

                System.out.print(randomNumber + " ");
            }

        }

    }
}
