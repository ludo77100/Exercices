package com.company;

import java.util.Scanner;

public class Facteur {

    public void facteur() {
        //1.Déclaration de variables
        Scanner sc = new Scanner(System.in);
        int facteur;
        int i;
        int multi;
        //2.Message de bienvenue dans le programmes
        System.out.println("Bienvenue, pour calculer le facteur d'un nombre, merci de le saisir");
        //3.Récupération du facteur à calculer
        facteur = sc.nextInt();
        //4.Le compteur ainsi que le multiplicateur vallent facteur
        i = facteur;
        multi = facteur;
        //5.Calcul du facteur
        while(i > 1){
            i = multi - 1; //On de
            multi = i;
            facteur = facteur * multi;
            System.out.println(facteur);
        }
        //6.On affiche la réponse
        System.out.println("Réponse = " +facteur);
    }
}
