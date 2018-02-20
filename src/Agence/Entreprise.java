package Agence;

import Structures.Ensemble;

/**
 * Entreprise
 */
public class Entreprise {

    Ensemble<Agence> agences;

    public Entreprise() {
        agences = new Ensemble<Agence>();
    }

    public void ajouter_agence(Agence agence) {
        agences.add_element(agence);
    } 

    public int taille_personnel() {
        int total = 0;
        for(Agence a : agences) {
            total += a.personels_count();
        }
        return total;
    } 

    public Agence recherche(String nom) {
        for(Agence a : agences) {
            if(a.get_name() == nom)
                return a;
        }
        return null;
    }


}
