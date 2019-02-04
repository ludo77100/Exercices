package com.company;

import java.util.Scanner;

public class Palin {

    public void palin(){
        Scanner sc = new Scanner(System.in);
        String string1;
        String string2 = "";
        System.out.println("Entrez un mot:");

        string1 = sc.next();
        for(int i = string1.length() - 1; i>= 0; i--)
        {
            string2 = string2 + string1.charAt(i);
        }

        if (string1.equals(string2)) { // pourquoi == ne marche pas ?????
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
