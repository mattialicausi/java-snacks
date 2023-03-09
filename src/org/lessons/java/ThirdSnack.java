package org.lessons.java;

public class ThirdSnack {
    public static void main(String[] args) {
        /*Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari*/

        //data
        int numberList[] = {1, 2, 4, 6, 2, 6, 7, 33, 22, 36, 9, 12, 7, 9, 22};
        int sum = 0;

        for (int i = 0; i < numberList.length; i++) {
            if (i % 2 != 0) {
                sum += numberList[i];
            }
        }
        System.out.println("La somma è: " + sum);
    }
}
