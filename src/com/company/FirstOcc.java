package com.company;

import java.util.Scanner;

public class FirstOcc {
        private void rechercheTab() {
            //coder pour passer en paramètres
        }
        public void firstOcc () {
            int ages[] = {5, 18, 16, 17, 25, 32, 28, 45, 50, 70};
            int i = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Bonjour, veuillez saisir un nombre svp");
            int nombre = sc.nextInt();
            while (i < ages.length && nombre != ages[i])
                i++;
            if (i < 10) {
                i = i + 1; // on incrémente i une nouvelle fois pour avoir la position réel dans le tableau
                System.out.println("Le nombre " + nombre + " est dans le tableau en position " + i);
            } else {
                System.out.println("-1");
            }
        }
    }

