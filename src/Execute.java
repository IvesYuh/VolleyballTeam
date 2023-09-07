/*
- Modificadores. OK
- Encapsulamento. OK
- Herança. OK
- Polimorfismo 
 */

public class Execute {
    public static void main(String[] args) {


        Trainer teamTrainer[] = new Trainer[7];
        teamTrainer[0] = new Trainer("Digao", 1.98f, 52, "Trainer", "SoulFighter", "10/10");
        teamTrainer[1] = new Trainer("Doug", 1.87f, 22, "Setter", "SoulFighter", "8/10");
        teamTrainer[2] = new Trainer("Faby", 1.78f, 25, "Setter", "SoulFighter", "8/10");
        teamTrainer[3] = new Trainer("Toby", 1.99f, 31, "Middle Hitter", "SoulFighter", "9/10");
        teamTrainer[4] = new Trainer("Jayce", 2.05f, 24, "Middle Blocker", "SoulFighter", "7/10");
        teamTrainer[5] = new Trainer("Poppy", 2.12f, 22, "Side Hitter", "SoulFighter", "9/10");
        teamTrainer[6] = new Trainer("Yout", 1.75f, 28, "Outside Setter", "SoulFighter","8/10");
        for(int i=0; i<teamTrainer.length; i++){
            System.out.println(teamTrainer[i].getName() + " - " + teamTrainer[i].getHeight() + " - "  + teamTrainer[i].getAge() + " - "  + teamTrainer[i].getPosition() + " - "  + teamTrainer[i].getNameTeam() + " - "  + teamTrainer[i].getRank() + "\n");
        }

    }
}
