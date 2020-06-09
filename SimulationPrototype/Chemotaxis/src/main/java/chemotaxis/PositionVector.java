package chemotaxis;

/**
 * Holds a position (vector to x,y-position of the car on the track grid)
 * or a velocity vector (x,y-components of the velocity vector of a car).
 *
 * Created by mach 21.01.2020
 */
public final class PositionVector implements Cloneable {
    private int x; // horizontal component (position / velocity)
    private int y; // vertical component (position / velocity)

    /**
     * Enum representing a direction on the track grid.
     * Also representing the possible acceleration values and which numpad button
     * they correspond to.
     */
    public enum Direction {
        DOWN_LEFT(new PositionVector(-1, 1), 1),
        DOWN(new PositionVector(0, 1), 2),
        DOWN_RIGHT(new PositionVector(1, 1), 3),
        LEFT(new PositionVector(-1, 0), 4),
        NONE(new PositionVector(0, 0), 5),
        RIGHT(new PositionVector(1, 0), 6),
        UP_LEFT(new PositionVector(-1, -1), 7),
        UP(new PositionVector(0, -1), 8),
        UP_RIGHT(new PositionVector(1, -1), 9);

        public final PositionVector vector;
        private final int numpadBtn;

        Direction(final PositionVector v, final int n) {
            vector = v;
            numpadBtn = n;
        }

        public static Direction getDirectionFromNumpad(int numpad) {
            Direction numDirection = NONE;
            for (Direction d : values()) {
                if (d.numpadBtn == numpad) {
                    numDirection = d;
                }
            }
            return numDirection;
        }
    }

    /**
     * Adds two PositionVectors (e.g. car position and velocity vector or two velocity vectors).
     *
     * @param vectorA A position or velocity vector
     * @param vectorB A position or velocity vector
     * @return A new PositionVector holding the result of the addition. If both
     * arguments are positions (not velocity), the result is mathematically
     * correct but meaningless.
     */
    public static PositionVector add(final PositionVector vectorA, final PositionVector vectorB) {
        return new PositionVector(vectorA.getX() + vectorB.getX(), vectorA.getY() + vectorB.getY());
    }

    /**
     * Subtracts two PositionVectors (e.g. car position and velocity vector or two velocity vectors).
     *
     * @param vectorA A position or velocity vector
     * @param vectorB A position or velocity vector
     * @return A new PositionVector holding the result of the addition. If both
     * arguments are positions (not velocity), the result is mathematically
     * correct but meaningless.
     */
    public static PositionVector subtract(final PositionVector vectorA, final PositionVector vectorB) {
        return new PositionVector(vectorA.getX() - vectorB.getX(), vectorA.getY() - vectorB.getY());
    }

    /**
     * Calculates the scalar product (Skalarprodukt) of two 2D vectors. The scalar product
     * multiplies the lengths of the parallel components of the vectors.
     *
     * @param vectorA A position or velocity vector
     * @param vectorB A position or velocity vector
     * @return The scalar product (vectorA * vectorB). Since vectorA and
     * vectorB are PositionVectors, which hold only integer coordinates,
     * the resulting scalar product is an integer.
     */
    public static int scalarProduct(final PositionVector vectorA, final PositionVector vectorB) {
        return (vectorA.getY() * vectorB.getY()) + (vectorA.getX() * vectorB.getX());
    }

    public PositionVector(final int x, final int y) {
        this.y = y;
        this.x = x;
    }

    public PositionVector(final PositionVector other) {
        x = other.getX();
        y = other.getY();
    }

    public PositionVector() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }


    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof PositionVector)) throw new ClassCastException();
        final PositionVector otherPositionVector = (PositionVector) other;
        return y == otherPositionVector.getY() && x == otherPositionVector.getX();
    }

    @Override
    public String toString() {
        return "(X:" + x + ", Y:" + y + ")";
    }
}
