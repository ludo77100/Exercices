package com.company;

import java.util.Scanner;

public class ChoixExercice {

    public void choixExercice() {

        System.out.println("Voici les exercice, merci de faire un choix:");
        System.out.println("Exercice 1: Calcul de factoriel");
        System.out.println("Exercice 2: Retour première occurence tableau");
        System.out.println("Exercice 3: Inversion de chaines de caractère");
        System.out.println("Exercice 4: Trouver le plus grand nombre d'un tableau");
        System.out.println("Exercice 5: Fizz et Buzz");
        System.out.println("Exercice 6: Palindrome");
        System.out.println("Exercice 7: Plus long mot d'une phrase");

        Scanner sc = new Scanner(System.in);
        int choix =  sc.nextInt();

        if(choix <= 7 && choix >= 1)

            switch (choix) {
                case 1:
                    Facteur facteur = new Facteur();
                    facteur.facteur();
                    break;

                case 2:
                    FirstOcc firstOcc = new FirstOcc();
                    firstOcc.firstOcc();
                    break;

                case 3:
                    InvChai invChai = new InvChai();
                    invChai.invChai();

                default:
                    System.out.println("Cette exercice n'est pas encore codé");
            }

        else
            System.out.println("Merci de saisir un nombre entre 1 et 7");
    }
}
