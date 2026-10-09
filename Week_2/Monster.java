package Week_2;

public class Monster {
    //5. Monster Arena

    // Skapa klassen Monster med namn och health. 
    String name;
    int health;

    // Skapa en konstruktor som bestämmer monstrets namn och start-health. 
    Monster(String x, int y)    {
        this.name = x;
        this.health = y;
    }

    public static void main(String[] args) {
        // Skapa ett monster i main.
        Monster no1 = new Monster("Trollet", 100);

        // Använd en loop för att simulera attacker där monstret förlorar health varje runda.
        // Avsluta loopen med break när monstrets health är 0 eller mindre.
        while(true) {
            System.out.println(no1.name + " blir attackerat!");

            no1.health = no1.health - 20;

            System.out.println(no1.name + " har " + no1.health + " % i hälsa kvar.");
            
            if(no1.health <= 0) {
                System.out.println(no1.name + " är dött.");
                break;
            }

            //no1.health = no1.health - 20;
        }
    }
}
