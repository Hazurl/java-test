package cm.TD1.Vehicule;

/**
 * Voiture
 */
public class Voiture extends Vehicule {

    private boolean auto_radio;
    private int id;

    private static int next_id = 0;

    public Voiture(String modele_, int annee_achat_, int prix_, 
                   String immatriculation_, String permis_, boolean auto_radio_) {
        super(modele_, annee_achat_, prix_, immatriculation_, permis_);
        this.auto_radio = auto_radio_;
        id = next_id++;
    }

    public final int get_id() {
        return id;
    }

    public static void RAZ() {
        next_id = 0;
    }

    public void print() {
        super.print();
        if(this.auto_radio)
            System.out.print(" Has an auto radio.");
        else
            System.out.print(" Without an auto radio.");
    }


}