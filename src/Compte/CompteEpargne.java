package Compte;

/*
 *  CompteEpargne
 */
public class CompteEpargne extends Compte {
    private int taux;
    
    public void deposer(int quantite) throws CompteException {
        retirer(1);
        try {
            super.deposer(quantite);
        } catch (CompteException e) {
            throw new CompteException(1, e.get_message());
        }
    }
}
