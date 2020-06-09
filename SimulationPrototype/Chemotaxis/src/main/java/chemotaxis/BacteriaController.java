package chemotaxis;

public final class BacteriaController {

    public enum bacteriaActionType {

    }

    public static void progressBacteria(Bacteria bacteria, DomainReadable domain) {
        if(bacteria.tumble(domain.getConcentration(bacteria.getPosition()))) {

        }else {

        }
    }
}
