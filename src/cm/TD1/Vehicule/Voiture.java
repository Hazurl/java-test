package cm.TD1.Vehicule;

/**
 * Voiture
 */
public class Voiture extends Vehicule {

    private boolean auto_radio;

    public Voiture(String modele_, int annee_achat_, int prix_, 
                   String immatriculation_, String permis_, boolean auto_radio_) {
        super(modele_, annee_achat_, prix_, immatriculation_, permis_);
        this.auto_radio = auto_radio_;
    }

    public void print() {
        super.print();
        if(this.auto_radio)
            System.out.print(" Has an auto radio.");
        else
            System.out.print(" Without an auto radio.");
    }


}