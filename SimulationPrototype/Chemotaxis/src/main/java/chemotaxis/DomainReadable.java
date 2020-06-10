package chemotaxis;

public class DomainReadable {

    private final int size;
    protected final int[][] domainArray;

    public DomainReadable(int size) {
        System.out.println("--- INIT Domain");
        this.size = size;
        domainArray = new int[size][size];
        initDomainArray();
    }

    private void initDomainArray() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                domainArray[i][j] = j;
            }
        }
    }

    public int getConcentration(PositionVector positionVector) {
        return domainArray[positionVector.getY()][positionVector.getX()];
    }
}
