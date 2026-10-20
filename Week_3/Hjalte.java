package Week_3;

import java.util.Arrays; // Behövs för Arrays.sort() och Arrays.toString().

public class Hjalte {
    // Övning 6 – Bygg ett litet spel! 
    // Skapa en klass som heter Hjalte.     

    // Ge hjälten en privat instansvariabel poang. 
    private int poang;

    public static void main(String[] args)  {
        Hjalte h1 = new Hjalte();

        // Skapa en int-array med fem poängvärden, till exempel {10, 20, 5, 50, 15}. 
        int[] poang = {10, 20, 5, 50, 15};

        // Använd en loop för att räkna ihop poängen och ge dem till hjälten. 
        h1.setPoang(raknaPoang(poang));

        // Skriv ut hjältens totala poäng.
        System.out.println("Hjältens totala poäng är: " + h1.getPoang());

        // Skriv ut den högsta poängen
        System.out.println("Den högsta poängen är: " + h1.storstaPoang(poang));
    }

    // Skapa en getter som returnerar poängen. 
    int getPoang()   {
        return poang;
    }

    //  Skapa en setter som kan ändra poängen. 
    void setPoang(int poang)    {
        this.poang = poang;
    }

    // Använd en loop för att räkna ihop poängen och ge dem till hjälten. 
    static int raknaPoang(int[] poang) {
        int totPoang = 0;
        for (int p : poang)   {
            totPoang += p;
        }
        return totPoang;
    }

    //Extra utmaning: Skapa en metod som tar emot en array och returnerar den högsta poängen. 
    int storstaPoang(int[] poang)    {
        Arrays.sort(poang);
        return poang[poang.length - 1];
    }
    
}