public class BugHunt { 
    public static void main(String[] args) { 
        //Träna felsökning genom att läsa kompileringsfel och rätta ett problem i taget.
        String name = "Ada"; //Lägger till stor bokstav på string och ett semikolon i slutet av raden 
        int age = 25; //skriver 25 utan citattecken så det blir heltal istället
        double height = 1.72; //ändrar kommatecken till punkt för att skriva decimaltal
        char grade = 'A'; //ändrar citattecken till enkelt citattecken så de kan användas för typen char
        boolean likesJava = true; //tar bort citattecken runt true så det funkar med boolean typen
        
        int apples = 5; 
        int bananas = 2; 

        System.out.println("Fruit: " + (apples + bananas)); //lägger till paranteser
        System.out.println("Name: " + name); //lägger till + emellan de olika typena så de kan skrivas ut
        System.out.println(age == 25); //true

        System.out.println("Längd: " + height); //skriver ut de variabler som inte skrivits ut
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);
    } 
} 