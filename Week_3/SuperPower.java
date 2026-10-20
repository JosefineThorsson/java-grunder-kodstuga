package Week_3;

public class SuperPower {
    //Övning 5 – Välj din superkraft! 

    public static void main(String[] args)  {
        // Skapa en variabel som håller spelarens superkraft. 
        Superkraft currentPower = Superkraft.IS;

        System.out.println("Min superkraft:");
        printPower(currentPower);

        //Extra utmaning: Använd values() och en Enhanced For Loop
        // för att skriva ut alla tillgängliga superkrafter. 
        System.out.println("Alla superkrafter:");
        for (Superkraft p : Superkraft.values())    {
            System.out.println(p);
        }
    }

    // Skapa en enum som heter Superkraft. 
    // Lägg till ELD, IS, VIND och BLIXT.
    public enum Superkraft  {
        ELD,
        IS,
        VIND,
        BLIXT
    }

    // Använd switch för att skriva ut ett meddelande beroende på superkraft.    
    static void printPower(Superkraft p)    {
        switch (p) {
            case ELD:
                System.out.println("Jag kan kasta eldklot!");
                
                break;

            case IS:
                System.out.println("Jag kan frysa saker till is!");
                
                break;  
                
            case VIND:
                System.out.println("Jag kan orsaka en storm!");
                
                break;

            case BLIXT:
                System.out.println("Jag kan framkalla blixten!");
                
                break;
        }
    }
}