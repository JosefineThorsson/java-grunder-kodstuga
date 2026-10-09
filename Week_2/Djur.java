package Week_2;

public class Djur {
    //4. Bygg ett eget djur

    // Skapa klassen Djur med namn, ålder och ljud. 
    String namn;
    int age;
    String ljud;

    // Skapa en konstruktor som sätter värden på variablerna. 
    Djur(String x, int y, String z)  {
        this.namn = x;
        this.age = y;
        this.ljud = z;
    }

    // Skapa metoden gotLjud() som skriver ut djurets ljud. 
    void gotljud()  {
        System.out.println("Djuret är en " + namn + ", den är " + age + " år gammal, och låter såhär: " + ljud + "!");
    }

    // Skapa minst två olika Djur-objekt i main och låt dem göra sina ljud. 
    public static void main(String[] args) {
        Djur djur1 = new Djur("hund", 3,"Wooff");
        Djur djur2 = new Djur("katt", 6,"Mjauu");
        
        djur1.gotljud();
        djur2.gotljud();

    }
}
