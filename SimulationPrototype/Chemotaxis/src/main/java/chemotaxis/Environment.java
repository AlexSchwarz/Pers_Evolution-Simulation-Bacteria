package chemotaxis;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    private List<Bacteria> bacteriaList;
    private DomainReadable domain;
    private final int size = 100;
    private PositionVector bacteriaPosition = new PositionVector(50,50);
    private int bacteriaSpeed = 5;
    private double chanceToTumble = 0.5;

    public Environment() {
        System.out.println("--- INIT Environment");
        domain = new DomainReadable(size);
        bacteriaList = new ArrayList<>();
        initBacteria();
    }

    private void initBacteria() {
        bacteriaList.add(new Bacteria(bacteriaPosition, bacteriaSpeed, chanceToTumble));
    }

    public void progressEnvironment() {
        for(Bacteria bacteria : bacteriaList) {
            BacteriaController.progressBacteria(bacteria, domain);
        }
    }
}
