package chemotaxis;

import java.util.List;

public class Environment {

    private List<Bacteria> bacteriaList;
    private DomainWritable domain;
    private final int size = 100;
    private PositionVector bacteriaPosition = new PositionVector(50,50);
    private int bacteriaSpeed = 5;
    private double chanceToTumbel = 0.5;

    public Environment(int size) {
        domain = new DomainWritable();
        initDomain();
        initBacteria();
    }

    private void initDomain() {

    }

    private void initBacteria() {
        bacteriaList.add(new Bacteria(bacteriaPosition, bacteriaSpeed, chanceToTumbel));
    }

    public void progressEnvironment() {
        for(Bacteria bacteria : bacteriaList) {
            BacteriaController.progressBacteria(bacteria, domain);
        }
    }
}
