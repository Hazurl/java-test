package tp.TP1.Vehicule;

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

    public boolean can_transport(float volume) {
        return volume <= this.volume;
    }

    public float max_volume() {
        return volume;
    }

    public void print() {
        super.print();
        System.out.print(" Volume of " + this.volume + ".");
    }

}