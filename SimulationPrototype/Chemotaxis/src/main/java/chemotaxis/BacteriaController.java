package chemotaxis;

import java.util.*;

public final class BacteriaController {

    private static final Random random = new Random();


    public static void progressBacteria(Bacteria bacteria, DomainReadable domain) {
        Objects.requireNonNull(bacteria);
        Objects.requireNonNull(domain);
        if(bacteria.tumble(domain.getConcentration(bacteria.getPosition()))) {
            reorient(bacteria);
        }else {
            move(bacteria, domain);
        }
    }

    public static void move(Bacteria bacteria, DomainReadable domain) {
        Objects.requireNonNull(bacteria);
        Objects.requireNonNull(domain);
        System.out.println("BacteriaController move bacteria");
        PositionVector position = bacteria.getPosition();
        PositionVector direction = bacteria.getDirection();
        PositionVector nextPosition = PositionVector.add(position, direction);
        System.out.println("Added direction " + direction + " to position " + position + " resulting in " + nextPosition);
        if(domain.isPositionInDomain(nextPosition)) {
            bacteria.setPosition(nextPosition);
            System.out.println("Move valid");
        }else {
            System.out.println("Move invalid");
        }
    }

    public static void reorient(Bacteria bacteria) {
        Objects.requireNonNull(bacteria);
        System.out.println("BacteriaController reorient bacteria");
        PositionVector nextDirection = generateRandomMoveVector(bacteria.getSpeed());
        System.out.println("Reorientation result " + nextDirection);
    }

    private static PositionVector generateRandomMoveVector(int radius) {
        PositionVector randomMoveVector;
        if(radius == 0) {
            randomMoveVector = new PositionVector(0,0);
        }
        else {
            List<PositionVector> list = new ArrayList<>();
            int d = (5 - radius * 4) / 4;
            int centerX = 0;
            int centerY = 0;
            int x = 0;
            int y = radius;
            do {
                list.add(new PositionVector(centerX + x, centerY + y));
                list.add(new PositionVector(centerX + x, centerY - y));
                list.add(new PositionVector(centerX - x, centerY + y));
                list.add(new PositionVector(centerX - x, centerY - y));

                list.add(new PositionVector(centerX + y, centerY + x));
                list.add(new PositionVector(centerX + y, centerY - x));
                list.add(new PositionVector(centerX - y, centerY + x));
                list.add(new PositionVector(centerX - y, centerY - x));

                if (d < 0) {
                    d += 2 * x + 1;
                } else {
                    d += 2 * (x - y) + 1;
                    y--;
                }
                x++;
            } while (x <= y);
            assert !list.isEmpty();
            randomMoveVector = list.get(random.nextInt(list.size()));
        }
        Objects.requireNonNull(randomMoveVector);
        return randomMoveVector;
    }
}
