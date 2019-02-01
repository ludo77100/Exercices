package com.company;

import java.util.Scanner;

public class Facteur {

    /** Cette méthode retourne le facteur d'un nombre
     * resul = résultat du facteur, sert aussi au calcul
     * fact = sert de compteur jusqu'à 1
     * Si on passe un nombre incompatible, demande d'une nouvelle saisie
     * todo s'occuper du cas d'un facteur zéro ...
     */

    public void facteur() {
        //Déclaration des variables, long pour avoir le plus grand résultat possible
        Scanner sc = new Scanner(System.in);
        long resul;
        //On récupère la saisie
        System.out.println("Saisir un nombre entier (entre 1 et 25)");
        resul = sc.nextInt();
        //Condition afin de respecter la plage entre 1 et 25
        if (resul > 25 || resul < 1)
        {
            System.out.println("Merci de saisir un nombre valide");
            facteur();
        }
        else
            {
            //On affecte le facteur avec le nombre saisie par l'utilisateur - 1, sinon la boucle démarre avec 5*5 ...
            for (long fact = resul - 1; fact > 1; fact--)
            {
                resul = resul * fact; //On calcule le facteur ici
            }
        }

        System.out.println("Le résultat est " + resul); //On affiche le résultat

        /*
         * PREMIERE ALGO QUE J'AI CODE
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
         */
    }
}
