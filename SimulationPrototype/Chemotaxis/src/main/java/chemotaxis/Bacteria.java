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

    public boolean tumble(int concentration) {
        double chance;
        if(concentration == previousConcentration) {
            chance = 0.5;
        }else if(concentration > previousConcentration) {
            chance = 0.25;
        }else {
            chance = 0.75;
        }
        return chance > random.nextDouble();
    }



}
