package Convertion;

/*
 *  Chaine
 */
public class Chaine implements IConvertibleInteger {
    String str;

    Chaine(String value) {
        str = value;
    }

    public final String get() {
        return str;
    }

    public final void set(String str) {
        this.str = str;
    }

    @Override
    public int to_int() {
        return Integer.parseInt(str);
    }
    
    @Override
    public String toString() {
        return "{" + str + "} : " + to_int();
    }

}
