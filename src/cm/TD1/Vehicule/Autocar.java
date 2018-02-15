package cm.TD1.Vehicule;

/**
 * Autocar
 */
public final class Autocar extends Camion {

    private int seat_count; 

    static int majoration = 50;

    public Autocar(String modele_, int annee_achat_, int prix_, String immatriculation_,
                   String permis_, float volume_, int seat_count_) {
        super(modele_, annee_achat_, prix_, immatriculation_, permis_, volume_);
        this.seat_count = seat_count_;
    }

    static int get_majoration() {
        return majoration;
    }

    static void set_majoration(int value) {
        majoration = value;
    }

    public int get_rent_price() {
        return super.get_rent_price() + (this.seat_count > 40 ? get_majoration() : 0);
    }

    public void print() {
        super.print();
        System.out.print(" " + this.seat_count + " seats available.");
    }
    
}