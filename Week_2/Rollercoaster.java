package Week_2;

import java.util.Scanner; //hämta Scanner som finns inbyggd i Java

public class Rollercoaster {
    public static void main(String[] args) {
        //1. Får du åka berg- och dalbana?
        Scanner sc = new Scanner(System.in); //skapa en ny Scanner som heter sc som hjälper oss att hämta in input från användaren

        // Skapa variabler för en persons ålder och längd
        int age;
        double height;

        System.out.println("Får jag åka berg- och dalbana?");

        System.out.println("Hur gammal är du?");

        age = sc.nextInt();

        System.out.println("Hur lång är du i meter? Ange decimaler med komma (t.ex. 1,65)");
        height = sc.nextDouble(); // Kräver att användaren skriver kommatecken istället för punkt i decimaltal


        // Använd if, else if och else för att avgöra om personen får åka
        if (age >= 12 && height >= 1.40)   {
            System.out.println("Ja, du får åka berg- och dalbana.");
        } else if (age >= 12 && height < 1.40)  {
            System.out.println("Nej, du får inte åka eftersom du är för kort.");
        } else if (age < 12 && height >= 1.40)  {
            System.out.println("Nej, du får inte åka eftersom du är för ung.");
        } else  {
            System.out.println("Nej, du får inte åka eftersom du är för kort och för ung.");
        }

        // Stänger scannern efter att all input är inne
        sc.close();
    }
}