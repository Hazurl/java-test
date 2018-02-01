package cm.TD1.Vehicule;

import java.time.Year;
import java.util.Calendar;

/**
 * Vehicule
 */
public class Vehicule {

    private String modele;
    private int annee_achat;
    private int prix;
    private String immatriculation;
    private String permis;

    public Vehicule(String modele_, int annee_achat_, int prix_, String immatriculation_, String permis_) {
        this.modele = modele_;
        this.annee_achat = annee_achat_;
        this.prix = prix_;
        this.immatriculation = immatriculation_;
        this.permis = permis_;
    }

    public int age() {
        return Year.now().getValue() - this.annee_achat;
    }

    public int get_rent_price() {
        if (this.age() <= 1)
            return this.prix / 200;
        else
            return this.prix / 250;
    }

    public void print() {
        System.out.print(this.modele + " [" + this.immatriculation + "] bought in " + this.annee_achat +
                         " at " + this.prix + "€ and require permit " + this.permis + ".");
    }

}