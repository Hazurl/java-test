package cm.TD2.Agence;

/**
 * Compte
 */
public class Compte {

    private int credit;
    private int debit;

    public void deposer(int quantite) {
        if (quantite < 0) {
            throw CompteException(0, "Quantite negative");
        }
        credit += quantite;
    }

    public void retirer(int quantite) {
        if (quantite < 0) {
            throw CompteException(0, "Quantite negative");
        }
        if (quantite < 0) {
            throw CompteException(0, "Quantite negative");
        }
        
    }
}