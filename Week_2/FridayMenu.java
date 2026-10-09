package Week_2;

import java.util.Scanner; //hämta Scanner som finns inbyggd i Java

public class FridayMenu {
    public static void main(String[] args) {
        
        //2. Fredagsmeny
        Scanner sc = new Scanner(System.in); //skapa en ny Scanner som heter sc som hjälper oss att hämta in input från användaren

        // Skapa en variabel choice med ett värde mellan 1 och 4.
        int choice;
        String food;

        System.out.println("Vilken mat får du? (skriv in en siffra mellan 1-4)");
        choice = sc.nextInt();

        // Använd switch för att koppla varje val till en maträtt. 
        // Lägg till default för ett ogiltigt val. 
        switch (choice) {
            case 1:
                food = "Lasagne";
                System.out.println("Du får " + food);
                break;

            case 2:                
                food = "Spaghetti Bolognease";
                System.out.println("Du får " + food);
                break;

            case 3:
                food = "Tacos";
                System.out.println("Du får " + food);
                break;
            case 4:
                food = "Köttbullar och potatismos";
                System.out.println("Du får " + food);
                break;
            default:
                System.out.println("Ogiltigt nummer. Skriv in ett nummer mellan 1-4 och försök igen.");
        }

        // Stänger scannern efter att all input är inne
        sc.close();

    }
}
