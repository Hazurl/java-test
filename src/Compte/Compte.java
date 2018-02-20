package Compte;

/**
 * Compte
 */
public class Compte {

    private int credit;
    private int debit;

    public void deposer(int quantite) throws CompteException {
        if (quantite < 0) {
            throw new CompteException(0, "Quantite negative");
        }
        credit += quantite;
    }

    public void retirer(int quantite) throws CompteException {
        if (quantite < 0)
            throw new CompteException(0, "Quantite negative");

        debit += quantite;        
    }
}