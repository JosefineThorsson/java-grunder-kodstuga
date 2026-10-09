package Week_1;

public class PersonCard {
    public static void main(String[] args)  {
        //Lägg övningens kod här
        //Del 1 - skapa variabler som beskriver en påhittad person
        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        double height = 1.72;
        char grade = 'B';
        boolean likesJava = true;

        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age);
        System.out.println("Längd: " + height);
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);

        //Del 2 - Beräkna nästa års ålder
        int ageNextYear = age + 1;

        System.out.println("Nästa år är " + firstName + " " + ageNextYear + " år");

        //Del 3 - förbättra variabelnamnen
        String carBrand = "Volvo";
        int modelYear = 2022;
        double price = 185000;
        boolean isElectric = true;

        System.out.println(firstName + " har en " + carBrand + "bil från år " + modelYear + " som kostade " + price + " kronor. Är bilen elektrisk? " + isElectric);
    }
}