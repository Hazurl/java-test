package TD2;

/**
 * Voiture
 */
public class Voiture extends Vehicule {

    private Boolean auto_radio;

    public Voiture(String modele_, int annee_achat_, int prix_, 
                   String immatriculation_, String permis_, Boolean auto_radio_) {
        super(modele_, annee_achat_, prix_, immatriculation_, permis_);
        this.auto_radio = auto_radio_;
    }

}