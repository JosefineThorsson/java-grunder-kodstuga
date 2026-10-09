package Week_1;

public class StringWorkshop {
    public static void main(String[] args)  {
        //Lägg övningens kod här

        //Del 1
        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName); //Anna Andersson
        System.out.println(fullName.length()); //antalet tecken

        System.out.println("Hej! Jag heter " + fullName + "."); //Hej! Jag heter Anna Andersson.
        System.out.println("Mitt namn innehåller " + fullName.length() + " tecken."); //Mitt namn innehåller 14 tecken.

        //Del 2 - Bonus
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");
        //Använder variablerna för att skapa meningen:
        //"Anna Andersson bor i Göteborg och utbildar sig till mjukvarutestare."
    }
}