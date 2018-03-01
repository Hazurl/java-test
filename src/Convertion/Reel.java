package Convertion;

/*
 *  Reel
 */
public class Reel implements IConvertibleInteger {
    private double value;
    
    public Reel(double value) {
        this.value = value;
    }

    public void set(double value) {
        this.value = value;
    }

    public double get() {
        return value;
    }

    @Override
    public int to_int() {
        return (int)value;
    }

    @Override
    public String toString() {
        return "{" + value + "} : " + to_int();       
    }

}