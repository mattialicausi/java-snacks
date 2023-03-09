package org.lessons.java;

import java.util.Random;

public class SecondSnack {
    public static void main(String[] args) {

        /*Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
         e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.*/


        //data
        String[] nameList = {"Mattia", "Giorgio", "Lorenzo", "Cristina", "Valeria", "Franceso", "Alessia"};
        String[] lastnameList = {"Rossi", "Di Paola", "Bianco", "Di Caprio", "Russo", "Romagnoli", "Li Causi"};

        String[] guestList = new String[10];

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();

            int randomName = rand.nextInt(nameList.length);
            int randomLastName = rand.nextInt(lastnameList.length);

            guestList[i] =  nameList[randomName] + " " + lastnameList[randomLastName];
            System.out.println(guestList[i]);
        }
    }
}
