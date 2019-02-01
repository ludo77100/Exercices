package com.company;

import java.util.Scanner;

public class FizzBuzz{
    /**
     * Méthode retournant Fizz si le nombre saisi par l'utilisateur est un multiple de 3; Buzz si multiple de 5; FizzBuzz si multiple de 3 et 5; null si aucun
     * number = nombre saisi par l'utilisateur
     */
    public void fizzbuzz(){
        //On récupère la saisi user
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue, si multiple de 3, Fizz sera affiché, si multiple de 5, Buzz sera affiché, si multiple de 3 et 5, FIzzBuzz sera affiché");
        int number = sc.nextInt();
        //On test si multiple de 3 et 5 en premier sinon cette condition ne serait jamais check
        if (number % 3 ==0 && number % 5 ==0)
        {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (number % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println("null");
        }
    }
}
