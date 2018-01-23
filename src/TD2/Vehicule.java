package TD2;

import java.time.Year;
import java.util.Calendar;

/**
 * Vehicule
 */
public class Vehicule {

    public String modele;
    public int annee_achat;
    public int prix;
    public String immatriculation;
    public String permis;

    public int age() {
        return Year.now().getValue() - this.annee_achat;
    }

    public int get_rent_price() {
        if (this.age() <= 1)
            return prix / 200;
        else
            return prix / 250;
    }

}