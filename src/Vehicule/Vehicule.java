package Vehicule;

import java.time.Year;

/*
 *  Vehicule
 */
public class Vehicule {
	
    private String modele;
    private int annee_achat;
    private int prix;
    private String immatriculation;
    private String permit;
    
    private int id;

    private static int next_id = 0;

    public Vehicule(String modele_, int annee_achat_, int prix_, String immatriculation_, String permit_) {
        this.modele = modele_;
        this.annee_achat = annee_achat_;
        this.prix = prix_;
        this.immatriculation = immatriculation_;
        this.permit = permit_;
        id = next_id++;
    }

    public final int get_id() {
        return id;
    }

    public static void RAZ() {
        next_id = 0;
    }

    public String get_modele() {
        return modele;
    }

    public String get_immatriculation() {
        return immatriculation;
    }

    public String get_permit() {
        return permit;
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

    public String ToString() {
        return this.modele + " [" + this.immatriculation + "] bought in " + this.annee_achat +
               " at " + this.prix + "€ and require permit " + this.permit + ".";
    }

    public static void main(String[] args) {
        Voiture twingo = new Voiture("Twingo", 2018, 10000, "AB123CD", "B", false);
        System.out.println(twingo);
        System.out.println("Rent price of the twingo : " + twingo.get_rent_price());

        Camion j9 = new Camion("J9", 2008, 20000, "1234AB56", "B", 25);
        System.out.println(j9);
        System.out.println("J9 can transport 7 m3 ? " + j9.can_transport(7));
        System.out.println("Rent price of the j9 : " + j9.get_rent_price());

        Autocar fri = new Autocar("FRI", 2005, 90000, "123AB45", "D", 3, 53);
        System.out.println(fri);
        System.out.println("FRI can transport 40 passengers with 0.1m3 each ? " + fri.can_transport(40, 0.1f));


        System.out.println();
    }

}
