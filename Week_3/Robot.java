package Week_3;

public class Robot {
    //Övning 1 – Hälsa på din robot! 
    // Skapa en metod som heter halsa. 

    private int number;

    public static void main(String[] args)  {

        Robot r1 = new Robot();
        Robot r2 = new Robot();

        // Anropa metoden flera gånger med olika namn. 
        halsa("Alex");
        r1.setFavNumber(3);
        printFavNumber(r1.getFavNumber());

        halsa("Marge");
        r2.setFavNumber(7);
        printFavNumber(r2.getFavNumber());

    }

    // Metoden ska ta emot ett namn som parameter. 
    // Metoden ska skriva ut till exempel: ”Hej Alex! Jag är din robot!”.
    static void halsa(String namn)    {
        System.out.println("Hej " + namn + "! Jag är din robot.");
    }

    // Extra utmaning: Skapa ytterligare en metod som returnerar robotens favoritnummer. 
    int getFavNumber() {
        return number;
    }

    // Ändra favoritnummer
    void setFavNumber(int number) {
        this.number = number;
    }

    // Skriv ut favoritnummer
    static void printFavNumber(int number)   {
        System.out.println("Mitt favoritnummer är " + number + ".");
    }
}