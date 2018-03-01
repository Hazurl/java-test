package Comparable;

/*
 *  Coureur
 */
public final class Coureur {
    private static int next_num = 1;

    private final int num;
    private String name, surname;

    Coureur(String name, String surname) {
        this.name = name;
        this.surname = surname;
        num = next_num++;
    }

    public final int get_number() {
        return num;
    }

    public final String get_name() {
        return name;
    }

    public final String get_surname() {
        return surname;
    }

    
}
