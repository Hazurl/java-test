package TD2;

/**
 * Camion
 */
public class Camion extends Vehicule {

    private float volume;

    public Camion(String modele_, int annee_achat_, int prix_, 
                  String immatriculation_, String permis_, float volume_) {
        super(modele_, annee_achat_, prix_, immatriculation_, permis_);
        this.volume = volume_;
    }

}