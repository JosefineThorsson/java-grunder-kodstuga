package Week_3;

import java.util.Arrays; // Behövs för Arrays.sort() och Arrays.toString().

public class SecretTreasure {
    //Övning 4 – Hitta den hemliga skatten! 

    public static void main(String[] args)  {
        // Skapa en int-array med fem olika mängder guld. 
        int[] guld = {125, 250, 375, 500, 725};

        System.out.println("Vi har totalt " + raknaGuld(guld) + " gram guld." );

        System.out.println("Den största guldmängden är på " + storstaGuld(guld) + " gram.");
    }

    // Skapa en metod som heter raknaGuld. 
    // Metoden ska ta emot en array som parameter. 
    // Använd en loop för att räkna ihop allt guld. 
    // Returnera totalsumman och skriv ut resultatet.
    static int raknaGuld(int[] guld)    {
        int totGuld = 0;
        for (int g : guld)  {
            totGuld += g;
        }
        return totGuld;  
    }

    //Extra utmaning: Skapa en metod som hittar den största guldmängden i en kista. 
    static int  storstaGuld(int[] guld) {
        Arrays.sort(guld);

        return guld[guld.length - 1];
    }
}