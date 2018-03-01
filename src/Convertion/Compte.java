package Convertion;

/*
 *  Compte
 */
public class Compte implements IConvertibleInteger {
    private int credit;
    String owner;
    
    public Compte(String owner) {
        this.owner = owner;
        this.credit = 0;
    }

    public void deposer(int value) {
        credit += value;
    }

    public void retirer(int value) {
        credit -= value;
    }

    @Override
    public int to_int() {
        return credit;
    }

    @Override
    public String toString() {
        return "{" + owner + ", " + credit + "} : " + to_int();
    }

}

