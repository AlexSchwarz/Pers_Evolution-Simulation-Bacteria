package chemotaxis;

public final class BacteriaController {


    public static void progressBacteria(Bacteria bacteria, DomainReadable domain) {
        if(bacteria.tumble(domain.getConcentration(bacteria.getPosition()))) {
            reorient(bacteria);
        }else {
            move(bacteria);
        }
    }

    private static void move(Bacteria bacteria) {
        System.out.println("BacteriaController move bacteria");
    }

    private static void reorient(Bacteria bacteria) {
        System.out.println("BacteriaController reorient bacteria");
    }
}
