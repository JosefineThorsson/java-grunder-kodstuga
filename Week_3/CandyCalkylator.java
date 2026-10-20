package Week_3;

public class CandyCalkylator {
    //Övning 2 – Godisräknaren 
    // Skapa en metod som heter raknaPris. 

    public static void main(String[] args)  {
        // Anropa metoden och skriv ut resultatet. 
        System.out.println("Totalt pris för godiset: " + raknaPris(2, 25) + " kronor.");

        // Skriv ut extra utmaning
        System.out.println("Extra utmaning");
        System.out.println("Totalt pris för godiset: " + raknaPris(2) + " kronor.");
    }

    //  Metoden ska ta emot antal godisbitar och pris per bit som parametrar. 
    // Metoden ska returnera det totala priset.
    static int raknaPris(int godisbitar, int pris)   {
        int totPris = godisbitar * pris;
        return totPris;
    }

    // Extra utmaning: Skapa en överlagrad version av metoden som bara tar emot antal godisbitar
    // och använder ett fast pris på 2 kr per bit.
    // återanvänder första metoden raknaPris för att slippa upprepa mig med multiplikationen.
    static int raknaPris(int godisbitar) {
        return raknaPris(godisbitar, 2);
    }
}