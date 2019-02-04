package com.company;

import java.util.Scanner;

public class InvChai {
    public void invChai(){

        Scanner sc = new Scanner(System.in);
        String string1;
        String string2 = "";
        System.out.println("Entrez un mot:");

        string1 = sc.next();
        for(int i = string1.length() - 1; i>= 0; i--)
        {
            string2 = string2 + string1.charAt(i);
        }

        System.out.println("Le mot " + string1 + " inversé est "+ string2);


        /*
        //Initialisation des variable
        Scanner sc = new Scanner(System.in);
        String string1;
        String string2;
        int string1Length;
        int i = 0;

        //Création d'un tableau de la longueur de la chaine de caractère
        System.out.println("Bonjour,veuillez saisir un mot:");
        string1 = sc.next();
        string1Length = string1.length();
        System.out.println(string1Length); // a effacer
        char string1Tab[] = new char[string1Length];
        System.out.println(string1Tab[5]); // a effacer

        while(i < string1Length)
            string1Tab[i] = string1.charAt(i);

        System.out.println("3");
        System.out.println(string1Tab);
        //recuper une chaine de carac
        //la spliter et la stocker dans un tableau (d'une longueur String.lenght)
        //concatenner chaque valeur du tableau en le déroulant depuis la fin dans une nouvelle variable
        */

    }
}
