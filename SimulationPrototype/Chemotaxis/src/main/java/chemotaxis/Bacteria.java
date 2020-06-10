package chemotaxis;

import java.util.Random;

public class Bacteria {

    private PositionVector position;
    private PositionVector direction;
    private int speed;
    private double chanceToTumble;
    private int previousConcentration;
    private Random random = new Random();

    public Bacteria(PositionVector position, int speed, double chanceToTumble) {
        System.out.println("--- INIT Bacteria");
        this.position = position;
        this.speed = speed;
        this.chanceToTumble = chanceToTumble;
        previousConcentration = 0;
        direction = new PositionVector();
    }

    public PositionVector getPosition() {
        return position;
    }

    public void setPosition(PositionVector nextPosition) {
        position = nextPosition;
    }

    public PositionVector getDirection() {
        return direction;
    }

    public void setDirection(PositionVector direction) {
        this.direction = direction;
    }

    //todo: incorporate chanceToTumble and have if-else statement apply modifier
    public boolean tumble(int concentration) {
        System.out.println("Bacteria attempting tumble...");
        System.out.println("Previous concentration: " + previousConcentration);
        System.out.println("Current concentration: " + concentration);
        double chance;
        if(concentration == previousConcentration) {
            chance = 0.5;
        }else if(concentration > previousConcentration) {
            chance = 0.25;
        }else {
            chance = 0.75;
        }
        double randomChance = random.nextDouble();
        boolean tumble = chance > randomChance;
        System.out.println("Chance: " + chance + " vs random chance: " + randomChance + " -> tumble: " + tumble );
        return tumble;
    }



}
