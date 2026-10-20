package Week_3;

public class DreamTeam {
    //Övning 3 – Ditt drömlag 

    public static void main(String[] args)  {
        // Skapa en String-array med fem spelarnamn. 
        String[] spelare = {"Hunter", "Lilly", "Randall", "Jack",  "Gabrielle"};

        // Skriv ut den första och sista spelaren. 
        System.out.println("Första spelaren är: " + spelare[0] + ".");
        System.out.println("Sista spelaren är: " + spelare[spelare.length - 1] + ".");

        // Byt ut en av spelarna mot ett annat namn. 
        spelare[2] = "Hamish";

        // Skriv ut alla spelare med en vanlig for-loop. 
        System.out.println("Lista över spelarna med en vanlig for-loop:");

        for (int i = 0; i < spelare.length; i++)    {
            System.out.println(spelare[i]);
        }

        // Skriv ut hur många spelare laget har med length. 
        System.out.println("Laget har " + spelare.length + " stycken spelare."); 

        //Extra utmaning: Skriv ut alla spelare med en Enhanced For Loop. 
        System.out.println("Lista över spelarna med en enhanced for-loop:");

        for (String element : spelare) {
            System.out.println(element);
        }
    }
}