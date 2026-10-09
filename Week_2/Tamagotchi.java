package Week_2;

public class Tamagotchi {
    //6. Bonus - Tamagotchi

    // Skapa klassen Pet med till exempel name, hunger och energy. 
    private String name;
    private int hunger;
    private int energy;

    Tamagotchi(String x, int y, int z)  {
        this.name = x; // Namnet på djuret
        this.hunger = y; // Hur hungrig djuret är
        this.energy = z; // Hur mycket energi djuret har kvar
    }

    // Djuret startar med hunger 0 och energy 100 om inte annat anges
    Tamagotchi(String x)    {
        this(x, 0, 100);
    }

    // Lägg till metoderna eat() och play() som förändrar värdena.

    // Om hunger blir för hög ska djuret klaga.
    void eat()  {
        if(hunger > 20)   {
            hunger = hunger - 20;
        } else  {
            System.out.println("Jag är mätt!\n");
        }
    }

    // Om energy blir för låg ska djuret vägra leka.    
    void play() {
        if(energy > 20 && hunger < 80) {
            energy = energy - 15;
            hunger = hunger + 10;
            System.out.println("Nu har jag lekt!\n");
                        
        } else if(hunger >= 80) {
            System.out.println("Jag vill inte leka, jag är för hungrig.\n");

        } else {
            System.out.println("Jag vill inte leka, min energi är för låg.\n");            
        }
    }

    public static void main(String[] args)  {
        Tamagotchi no1 = new Tamagotchi("Picatcho");
        Tamagotchi no2 = new Tamagotchi("Pippi", 100, 100);

        System.out.println("Spelet startar med spelare: " + no1.name + " och " + no2.name + "\n");

        boolean no1GameOver = false;
        boolean no2GameOver = false;

        while(true) {

            // Om båda spelarna har tillräcklig energinivå kvar
            if(no1.energy > 20 && no2.energy > 20) {
                no1.eat();
                no1.play();
                
                System.out.println("\n" + no1.name + " Energinivå: " + no1.energy + " %");
                System.out.println(no1.name + " Hungernivå: " + no1.hunger + " %\n");      

                no2.eat();
                no2.play();

                System.out.println("\n" + no2.name + " Energinivå: " + no2.energy + " %");
                System.out.println(no2.name + " Hungernivå: " + no2.hunger + " %");

            //Om spelare 1 fått slut på energi fortsätter spelare 2 att spela
            } else if(no1.energy <= 20 && no2.energy > 20) {

                // Skrivs ut en gång
                if(no1GameOver == false)    {
                    System.out.println("\nSpelet är över för spelaren: " + no1.name + ".");
                    System.out.println("Men spelaren " + no2.name + " får fortsätta spela.");
                    
                    no1GameOver = true;
                }


                no2.eat();
                no2.play();

                System.out.println("\n" + no2.name + " Energinivå: " + no2.energy + " %");
                System.out.println(no2.name + " Hungernivå: " + no2.hunger + " %");

            //Om spelare 2 fått slut på energi fortsätter spelare 1 att spela
            } else if(no1.energy > 20 && no2.energy <= 20) {

                // Skrivs ut en gång
                if(no2GameOver == false)    {
                    System.out.println("\nSpelet är över för spelaren: " + no2.name + ".");
                    System.out.println("Men spelaren " + no1.name + " får fortsätta spela.");
                    
                    no2GameOver = true;
                }

                no1.eat();
                no1.play();
                
                System.out.println("\n" + no1.name + " Energinivå: " + no1.energy + " %");
                System.out.println(no1.name + " Hungernivå: " + no1.hunger + " %");      

            // Om båda spelarna fått slut på energi så tar spelet slut
            } else {
                System.out.println("\nBåda djuren är för trötta. Spelet är slut!");
                break;
            }
        }        
    }
}
